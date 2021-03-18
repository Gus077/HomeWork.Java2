public class MyArrayDataException extends NumberFormatException{
    private int index1;
    private int index2;

    public MyArrayDataException(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;
    }

    public MyArrayDataException(String message, int index1, int index2) {
        super(message);
        this.index1 = index1;
        this.index2 = index2;
    }

    public int getIndex1() {
        return index1;
    }

    public int getIndex2() {
        return index2;
    }
}
