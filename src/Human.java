public class Human implements RunAndJump{


    private int MAX_JUMP_HEIGHT;
    private int MAX_RUN_RANGE;

    public Human(int MAX_JUMP_HEIGHT, int MAX_RUN_RANGE) {
        this.MAX_JUMP_HEIGHT = MAX_JUMP_HEIGHT;
        this.MAX_RUN_RANGE = MAX_RUN_RANGE;
    }


    @Override
    public void run(int range) {
        if(canRun(range)) {
            System.out.println("Человек пробежал " + range + " метров");
        } else System.out.println("Человек не смог пробежать заданное расстояние");
    }

    private boolean canRun(int range){
        return range <= MAX_RUN_RANGE;
    }

    @Override
    public void jump(int height) {
        if(canJump(height)){
            System.out.println("Человек прыгнул на высоту " + height);
        } else System.out.println("Человек не смог прыгнуть на заданную высоту");

    }

    private boolean canJump (int height){
        return height <= MAX_JUMP_HEIGHT;
    }

}
