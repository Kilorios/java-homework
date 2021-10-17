package lesson2;

public class D_Arrays {
    static void arrays() {
        // Создание массива int
        int[] arrInt;

        // Инициализация массива
        // 1 вариант: задание длины
        arrInt = new int[5];
        System.out.println(arrInt);

        // 2 вариант: задание значений
        int[] arrInt2 = new int[]{1, 7, -100, 4, 5, 100, 1000};
        System.out.println(arrInt2);

        // Длина массива
        System.out.println(arrInt.length);
        System.out.println(arrInt2.length);

        // Взятие элемента по индексу
        System.out.println(arrInt2[0]);
        int lastIndex = arrInt2.length - 1;
        System.out.println(arrInt2[lastIndex]);
        // Изменение значения по индексу
        arrInt2[lastIndex] = -1;
        System.out.println(arrInt2[lastIndex]);


        // Значения по умолчанию:
        // целые типы данных 0
        // дробные типы данных 0.0
        // boolean false
        // классы null
        System.out.println(arrInt[3]);
        arrInt[3] = 5;
        System.out.println(arrInt[3]);

    }

    // Создать массив double длиной 3 с любыми значениями
    // Вывести 0 и 2 элемент
    // 1 элемент заменить на 0.5
    static void task3() {
//        double[] arrDouble = new double[3];
//        arrDouble[0] = 1.0;
//        arrDouble[1] = -100.1;
//        arrDouble[2] = 1.00001;

        double[] arrDouble = new double[]{1.0, -100.1, 1.00001};

        System.out.println(arrDouble[0]);
        System.out.println(arrDouble[2]);

        arrDouble[1] = 0.5;
        System.out.println(arrDouble[1]);
    }
}
