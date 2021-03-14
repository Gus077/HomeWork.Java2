public class Wall implements Barriers {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void jump(RunAndJump r) {
        r.jump(height);
    }

    @Override
    public void run(RunAndJump r) {

    }
}
