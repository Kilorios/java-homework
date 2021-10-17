package lesson3;

/*
Создать массив с большим количеством целых чисел типа long
Найти разницу, между максимальным и минимальным значениями массива
Код нахождения максимума и минимума есть в одном из файлов с занятия
 */
public class Z_HW2 {
    public static void main(String[] args) {
            int[] arrInt = new int[]{1,10,-5,7,20,10,-50};

            int min = arrInt[0];
            for (int i = 1; i < arrInt.length; i = i + 1)
                if (arrInt[i] < min)
                    min = arrInt[i];

        int[] arrInt2 = new int[]{1,10,-5,7,20,10,-50};

        int max = arrInt2[0];
        int maxIndex = 0;
        for (int i = 1; i < arrInt2.length; i = i + 1)
            if (arrInt2[i] > max) {
                max = arrInt2[i];
                maxIndex = i;
                System.out.println(max - min);
            }
    }
}
