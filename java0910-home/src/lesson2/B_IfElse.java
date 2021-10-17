package lesson2;

import java.util.Scanner;

public class B_IfElse {
    static void if_else() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        // Условный оператор начинается с if и условия
        // От результата условия зависит какой блок кода выполнится
        if (i > 0) {
            // Блок кода запустится, только если условие - true
            System.out.println("Число положительное");
        } else {
            // Блок кода запустится, только если условие - false
            System.out.println("Число неположительное");
        }

        System.out.println("if_else закончился");
    }

    // Спросить у пользователя число
    // Если оно 57 - поздравить пользователя
    // В обратном случае ничего не делать
    static void task1() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 57) {
            System.out.println("Поздравляю");
        }
    }

    // Спросить у пользователя два числа
    // Выведите наибольшее число
    static void task2() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        if (i > j)
            System.out.println(i);
        if (j >= i)
            System.out.println(j);
    }

    // Спросить у пользователя три числа
    // Вывести наибольшее среди них
    static void task3() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println(a);
        if (b > a && b >= c)
            System.out.println(b);
        if (c > a && c > b)
            System.out.println(c);
    }

    static void inner() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // В зависимости от значения целого числа, возможно 3 случая
        // Число = 0, число > 0 или число < 0
        // С помощью if проверяем, является ли число нулём
        if (a == 0) {
            System.out.println("Число 0");
        } else {
            // С помощью if, который вложен в else, проверяем оставшиеся два случая
            if (a > 0)
                System.out.println("Правее 0");
            else
                System.out.println("Левее 0");
        }
    }
}
