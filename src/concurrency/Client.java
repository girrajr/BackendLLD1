package concurrency;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        MergeSort mergeSort = new MergeSort(new int[]{12, 11, 13, 5, 6, 7});

        int[] sortedArray = executorService.submit(mergeSort).get();

        System.out.println("Sorted Array: "+ Arrays.toString(sortedArray));
        executorService.shutdown();

    }
}

