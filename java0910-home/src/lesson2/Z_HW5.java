package lesson2;

/*
С помощью циклов while и for (по очереди) вывести числа от -5 до 100 с шагом 2
То есть "-5 -3 -1 1 3 5 7 .. 99"
 */
public class Z_HW5 {
    public static void main(String[] args) {
        int i = -5;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }

        for (int j = -5; j <= 100; j = j + 2) {
            System.out.println(j);
        }
    }
}
