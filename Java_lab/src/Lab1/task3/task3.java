package Lab1.task3;

public class task3 {
    public static void main(final String[] args) {
        final int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final char[] arrayChar = {'a','b','c','d'};

        printString (arrayInt,arrayChar);
    }

    public static String recordTwoArraysInString(final int[] arrayInt, final char[] arrayChar) {//метод запису 2 масива в стрінгу
        final int maxLength;
        if ( arrayChar.length>= arrayInt.length) { //Максимальна довжина
            maxLength = arrayChar.length;
        } else {
            maxLength = arrayInt.length;
        }

        String result = "";
        for (int i = 0; i < maxLength; i++) {
            if (i < arrayInt.length) { // Виконувати доти, поки числа не закінчаться
                result = result+arrayInt[i];
            }
            if (i < arrayChar.length) { // Виконувати доти, поки символи не закінчаться
                result = result+arrayChar[i];
            }
        }
        return result;
    }

    public static void printString(final int[] intArr, final char[] chArr){
        System.out.println (recordTwoArraysInString (intArr,chArr));

    }
}

