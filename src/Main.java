public class Main {
/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера
   необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе
   массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено
   исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
   и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).

    Заметка: Для преобразования строки к числу используйте статический метод класса Integer:
    Integer.parseInt(сюдаподатьстроку);
    Заметка: Если Java не сможет преобразовать входную строку (в строке число криво написано), то будет сгенерировано
    исключение NumberFormatException.
 */

    public static void main(String[] args) {
        String[][] arr = {
                {"12","13","14","15"},
                {"1","2","3","4"},
                {"100","200","300","400"},
                {"8","7","6","5"}
        };

        try {
            System.out.println(gerArr(arr));
        }catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }

    }
/**
 * Метод вычисления суммы строкового массива размером 4х4 с преобразованием к целочисленному типу
 *
 * @param s строковый массив размером 4х4
 * @throws MyArraySizeException при неверном размере массива
 * @throws MyArrayDataException при неверном значении элемента массива (невозможности его преобразования к целочисленному типу)
 */

    public static int gerArr (String[][] s) throws MyArraySizeException, MyArrayDataException {
        if(s.length != 4) {
            throw new MyArraySizeException("Неверный размер массива: " + s.length, s.length);
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i].length != 4){
                throw new MyArraySizeException("Неверная длина строки: " + i, i);
            }
        }
        int summ = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                try {
                    summ += Integer.parseInt(s[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Неверно указаны данные в ячейке: [" + i + "][" + j +"]", i,j);
                }
            }
        }
        return summ;
    }
}