public class Main {

    static final int size = 10000000;
    static final int h = size/2;

    public static void main(String[] args) {
        float arr[] = new float[size];

        long start = System.currentTimeMillis();

        for (int i = 0; i <size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long finish = System.currentTimeMillis();
        System.out.println("Метод 1: " + (finish-start) + "мс");

        float a1[] = new float[h];
        float a2[] = new float[h];

        long start1 = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1,0, h);
        System.arraycopy(arr, h, a2,0, h);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < h; i++) {
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < h; i++) {
                a2[i] = (float)(a2[i] * Math.sin(0.2f + ((h + i) / 5)) * Math.cos(0.2f + ((h+i) / 5)) * Math.cos(0.4f + ((h+i) / 2)));
            }
        });

        t1.start();
        t2.start();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long finish1 = System.currentTimeMillis();

        System.out.println("Метод 2: " + (finish1-start1) + "мс");



    }
}