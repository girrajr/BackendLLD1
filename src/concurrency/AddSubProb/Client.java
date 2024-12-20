package concurrency.AddSubProb;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();
        value.setVal(0);
      //  value.setLoopval(1000);
        value.setLoopval(10000);

        Adder add = new Adder(value);
        Subtractor sub = new Subtractor(value);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Void> adder  = executorService.submit(add);
        Future<Void> subt = executorService.submit(sub);
        adder.get();
        subt.get();

        executorService.shutdown();
        System.out.println("Final Value: "+value.getVal());
    }
}
