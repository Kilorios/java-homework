package lesson2;

import java.util.Scanner;

/*
Спросить у пользователя число
Если это число не от 1 до 4, вывести "Неверное время года"
Если число от 1 до 4, вывести время года, соответствующее числу
Например, 1 -> "Зима" или 3 -> "Лето"
 */
public class Z_HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();

        switch (inputInt) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;
            case 4:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверное время года");
        }
    }
}
