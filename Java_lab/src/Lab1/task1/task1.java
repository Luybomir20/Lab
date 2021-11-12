package Lab1.task1;

import java.lang.String;
import java.util.Arrays;


public class task1 {
    public static void main(final String[] args) {
        final String[]  text = {"January","February","March","April","May"};
        String temp;//Тимчасова змінна
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i <text.length-1; i++) {//Зменшуэмо на 1,щоб не вийти за межі
                if (text[i].length()> text[i+1].length()) {
                    temp = text[i];//Якщо елемент перший більший,то присвоюємо його тимчасовій змінні
                    text[i] = text[i + 1];//2 елемент ми присвоюємо 1
                    text[i + 1] = temp;//А той що був   в тимчасові,то присвоюємо 2
                    sorted = false;
                }

            }
        }

        System.out.println(Arrays.toString(text));

    }
}
