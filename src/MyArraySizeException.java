public class MyArraySizeException extends IndexOutOfBoundsException {
    private int index;

    public MyArraySizeException(int index) {
        this.index = index;
    }

    public MyArraySizeException(String message, int index) {
        super(message);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
