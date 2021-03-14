public class TreadMill implements Barriers {

    private int range;

    public TreadMill(int range) {
        this.range = range;
    }

    @Override
    public void run (RunAndJump r) {
        r.run(range);
    }

    @Override
    public void jump(RunAndJump r) {

    }
}
