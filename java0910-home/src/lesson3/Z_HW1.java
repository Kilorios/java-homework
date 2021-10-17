package lesson3;

/*
Создать массив с большим количеством значений типа long
С помощью цикла пройтись по всем элементам в массиве и,
в случае если элемент больше, чем максимальное значение int, вывести его на экран
Максимальное значение int = 2_147_483_647
 */
public class Z_HW1 {
    public static void main(String[] args) {
        long[] arrInt = new long[]{2_147_483,2_147_483_647,2_147_483_648L,7};

        for (int i = 0; i < arrInt.length; i = i + 1) {
            if (arrInt[i] > 2_147_483_647)
                System.out.println(arrInt[i]);
            else
                System.out.println("Пусто");
        }
    }

}


