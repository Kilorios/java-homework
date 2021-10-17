package lesson3;

public class A_ArraysAndLoops {
    static void traverseArray() {
        int[] arrInt = new int[100];
        // {1,2,3,4,..,100}
        for (int i = 0; i < 100; i = i + 1) {
            arrInt[i] = i + 1;
        }

        System.out.println(arrInt[3]);

        int[] arrInt2 = new int[100];
        // {-50, -49, .., 49}
        for (int i = 0; i < 100; i = i + 1) {
            arrInt2[i] = i - 50;
        }
        System.out.println(arrInt2[3]);
    }

    static void workWithArr() {
        int[] arrInt = new int[]{5, 5, 6, 15, 5, 7};
        // Вывести "Пять" на каждую пятерку в массиве

        for (int i = 0; i < arrInt.length; i = i + 1) {
            // Переменная i будет по очереди иметь значения всех индексов массива
            // То есть её нужно использовать в []
            System.out.println(i);
            if (arrInt[i] == 5)
                System.out.println("Пять");
            else
                System.out.println("Не пять");
        }

        for (int i = 0; i < arrInt.length; i = i + 1) {
            arrInt[i] = arrInt[i] * 2;
        }
        System.out.println(arrInt[3]);
    }


    /*
    Создать массив целых чисел int с какими-нибудь значениями
    С помощью цикла for пройти по массиву и значения меньше 10 увеличить на 10.
    {1, 10, -5, 7} -> {11, 10, 5, 17}
     */
    static void task1() {
        int[] arrInt = new int[]{1,10,-5,7};

        for (int i = 0; i < arrInt.length; i = i + 1) {
            if (arrInt[i] < 10)
                arrInt[i] = arrInt[i] + 10;
            System.out.println(arrInt[i]);
        }
    }

    static void travExample1() {
        int[] arrInt = new int[]{1,10,-5,7};

        for (int i = 0; i < arrInt.length; i = i + 2) {
            if (arrInt[i] < 10)
                arrInt[i] = arrInt[i] + 10;
            System.out.println(arrInt[i]);
        }
    }

    static void travExample2() {
        int[] arrInt = new int[]{1,10,-5,7,20,10,20};

        for (int i = arrInt.length-1; i >= 0; i = i - 1) {
            System.out.println(arrInt[i]);
        }
    }

    static void maximum() {
        int[] arrInt = new int[]{1,10,-5,7,20,10,-50};

        int max = arrInt[0];
        for (int i = 1; i < arrInt.length; i = i + 1)
            if (arrInt[i] > max)
                max = arrInt[i];

        System.out.println(max);
    }

    static void minimum() {
        int[] arrInt = new int[]{1,10,-5,7,20,10,-50};

        int min = arrInt[0];
        for (int i = 1; i < arrInt.length; i = i + 1)
            if (arrInt[i] < min)
                min = arrInt[i];

        System.out.println(min);
    }

    static void sum() {
        int[] arrInt = new int[]{1,10,-5,7,20,10,-50};

        int sum = 0;
        for (int i = 0; i < arrInt.length; i = i + 1)
            sum = sum + arrInt[i];
        System.out.println(sum);
    }

    static void prod() {
        int[] arrInt = new int[]{1,10,-5,7,20,10,-50};

        int prod = 1;
        for (int i = 0; i < arrInt.length; i = i + 1)
            prod = prod * arrInt[i];
        System.out.println(prod);
    }

    static void maximumIndex() {
        int[] arrInt = new int[]{1,10,-5,7,20,10,-50};

        int max = arrInt[0];
        int maxIndex = 0;
        for (int i = 1; i < arrInt.length; i = i + 1)
            if (arrInt[i] > max) {
                max = arrInt[i];
                maxIndex = i;
            }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}
