public class Cat implements RunAndJump{

    private String name;
    private int MAX_JUMP_HEIGHT;
    private int MAX_RUN_RANGE;

    public Cat(int MAX_JUMP_HEIGHT, int MAX_RUN_RANGE) {
        this.name = name;
        this.MAX_JUMP_HEIGHT = MAX_JUMP_HEIGHT;
        this.MAX_RUN_RANGE = MAX_RUN_RANGE;
    }

    @Override
    public void run(int range) {
        if(canRun(range)) {
            System.out.println("Кот пробежал " + range + " метров");
        } else System.out.println("Кот не смог пробежать заданное расстояние");
    }

    private boolean canRun(int range){
        return range <= MAX_RUN_RANGE;
    }

    @Override
    public void jump(int height) {
        if(canJump(height, MAX_JUMP_HEIGHT)){
            System.out.println("Кот прыгнул на высоту " + height);
        } else System.out.println("Кот не смог прыгнуть на заданную высоту");

    }

    private boolean canJump (int height, int MAX_JUMP_HEIGHT){
        return height <= MAX_JUMP_HEIGHT;
    }
}
