package lesson2;

import java.util.Scanner;

/*
Спросить у пользователя число

Если это число не находится между 0 и 101, вывести "Вы не попали"
В обратном случае, проверить больше ли число, чем 90
Если да, вывести "Отличный выстрел, в яблочко"
Если нет, вывести "Вы попали"
 */
public class Z_HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();

        if (inputInt <= 0 || inputInt >= 101) {
            System.out.println("Вы не попали");
        } else if (inputInt > 90) {
            System.out.println("Отличный выстрел, в яблочко");
        } else {
            System.out.println("Вы попали");
        }
    }
}
