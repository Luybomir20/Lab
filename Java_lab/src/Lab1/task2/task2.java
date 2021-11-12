package Lab1.task2;


public class task2 {
    public static void main(final String[] args) {

        final String[] strArray = {"Winter", "Autumn", "Summer"};//Створюємо масив з слів

        int a = 0;
        for (final String str : strArray) {//Цикл for-each
            a = a+str.length();//Сума довжини кожного елемента масива
        }

        final char[] charArray = new char[a];//Створюємо символьний масив в розмірі рядкового

        int i = 0;
        for (final String str : strArray) {//Перераховуємо всі елементи
            for (final char c : str.toCharArray()) //до символьного масиву
            {
                charArray[i++] = c;//Додаємо кожен символ
            }
        }

        int k = 0;
        for (i =0; i < charArray.length; i++){
            if (charArray[i] == 'u'){
                k++;
            }
        }
        System.out.println("kilkist elementiv ="+k);

    }
}








