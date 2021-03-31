public class MyThread extends Thread{

    static final int size = 10000000;
    static final int h = size/2;

    @Override
    public void run() {
        float arr[] = new float[h];
        for (int i = 0; i <size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
