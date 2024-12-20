package concurrency.AddSubProb;

public class Value {
    volatile int val;
    private int loopval;

    // generate getter and setter
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
    public int getLoopval() {
        return loopval;
    }
    public void setLoopval(int loopval) {
        this.loopval = loopval;
    }
}
