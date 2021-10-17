package lesson1;

import java.util.Scanner;

public class D_Input {
    static void scanner() {
        // Создание Сканнера, который берет поток данных с консоли пользователя
        Scanner sc = new Scanner(System.in);
        // команда nextInt() позволяет получить число, введенное пользователем
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A + B);
    }

    static void scanner2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите своё имя:");
        // Команда nextLine() позволяет получить всю строку, которую ввел пользователь
        String name = sc.nextLine();
        System.out.print("Привет, ");
        System.out.println(name);
    }
}
