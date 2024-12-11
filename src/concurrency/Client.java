package concurrency;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //we need to change the thread pool to cached thread pool as with 2 thread its working previously beacuse
        // we wrer creating new threadpool every time inside the mergedShort method itself
        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSort mergeSort = new MergeSort(new int[]{12, 11, 13, 5, 6, 7}, executorService);

        int[] sortedArray = executorService.submit(mergeSort).get();

        System.out.println("Sorted Array: "+ Arrays.toString(sortedArray));
        executorService.shutdown();

    }
}

