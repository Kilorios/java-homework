package lesson2;

import java.util.Scanner;

/*
Спросить у пользователя число
Если оно больше, чем 1000000, вывести строку "Это число большое"
В обратном случае вывести "Это число маленькое"
 */
public class Z_HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();

        if (inputInt > 1_000_000) {
            System.out.println("Это число большое");
        } else {
            System.out.println("Это число маленькое");
        }
    }
}
