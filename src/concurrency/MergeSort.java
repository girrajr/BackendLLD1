package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<int[]> {

    private int[] arr;

    MergeSort(int[] arr){
        this.arr = arr;
    }


    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public int[] call() throws Exception {
        System.out.println("Thread " + Thread.currentThread().getName() + " is working on array: " + java.util.Arrays.toString(arr));

             if(arr.length<=1){
                 return arr;
             }

                int mid = arr.length/2;
                int[] left = new int[mid];
                int[] right = new int[arr.length-mid];

                for(int i=0; i<mid; i++){
                    left[i] = arr[i];
                }
                for(int i=mid; i<arr.length; i++){
                    right[i-mid] = arr[i];
                }


                MergeSort leftSort = new MergeSort(left);
                MergeSort rightSort = new MergeSort(right);

        // we need to remove this line from here and add pass it in Constructor of MergeSort as it is creating multiple threadpools
                ExecutorService executorService = Executors.newFixedThreadPool(2);
                Future<int[]> leftFuture = executorService.submit(leftSort);
                Future<int[]> righFuture = executorService.submit(rightSort);

                int[] leftSortedArray = leftFuture.get();
                int[] rightSortedArray = righFuture.get();

             //  executorService.shutdown();   // if we not write this line then executorService will not shutdown and program will not terminate
        return merge(leftSortedArray, rightSortedArray);
    }

    public int[] merge(int[] left, int[] right){
        System.out.println("Thread " + Thread.currentThread().getName() + " is merging arrays: " + java.util.Arrays.toString(left) + " and " + java.util.Arrays.toString(right));
        int[] result = new int[left.length + right.length];
        int i=0, j=0, k=0;
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while(i<left.length){
            result[k++] = left[i++];
        }
        while(j<right.length){
            result[k++] = right[j++];
        }
        return result;
    }



}
