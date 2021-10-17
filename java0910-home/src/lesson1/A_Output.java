package lesson1;

public class A_Output {
    static void output() {
        /*
        Команда System.out.println() выводит то, что дано в круглых скобках и ставит новую строку
        Команда System.out.print() выводит то, что дано в круглых скобках без новой строки
         */
        // 1 вариант
        System.out.println("Меня зовут Андрей");
        System.out.println("Мне 22 года");

        // 2 вариант
        System.out.print("Меня зовут ");
        System.out.println("Андрей");
        System.out.println("Мне 22 года");

        // 3 вариант
        System.out.println("Меня зовут Андрей\nМне 22 года");
    }
}
