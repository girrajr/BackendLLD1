package concurrency.AddSubProb;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;


    Adder(Value value){
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(int i=0; i<value.getLoopval(); i++){
            value.setVal(value.getVal()+1);
        }
        return null;
    }
}
