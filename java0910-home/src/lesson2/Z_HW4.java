package lesson2;

/*
Создать массив с типом данных short (длина неважна, но не советую больше 4-5)
Вывести первый элемент из массива
Увеличить каждый элемент в массиве в 2 раза
Вывести первый элемент из массива
 */
public class Z_HW4 {
    public static void main(String[] args) {
        // 1 вариант
        // short[] shortArr = new short[4];

        // 2 вариант
        short[] shortArr = new short[]{4, 7, -1000, 128};
        System.out.println(shortArr[0]);
        shortArr[0] = (short) (2 * shortArr[0]);
        shortArr[1] = (short) (2 * shortArr[1]);
        shortArr[2] = (short) (2 * shortArr[2]);
        shortArr[3] = (short) (2 * shortArr[3]);
        System.out.println(shortArr[0]);
    }
}
