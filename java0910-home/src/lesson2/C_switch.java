package lesson2;

public class C_switch {
    // Предположим, что у нас есть число от 1 до 7
    // В зависимости от его значения надо вывести день недели
    // Например, 1 -> "Пн", 2 -> "Вт" и т.д.
    static void noswitch() {
        int i = 3;

        // 1 вариант - использовать вложенные if, т.е. в else одного if писать другой if
        if (i == 1)
            System.out.println("Пн");
        else
            if (i == 2)
                System.out.println("Вт");
            else
                if (i == 3)
                    System.out.println("Ср");
        // И т.д.
        // Такой код очень неудобно читать и поддерживать в рабочем состоянии
    }

    static void noswitch2() {
        int i = 7;

        // Есть альтернатива - возможность написать if на той же строке, что и else
        // Улучшает читаемость кода
        if (i == 1)
            System.out.println("Пн");
        else if (i == 2)
            System.out.println("Вт");
        else if (i == 3)
            System.out.println("Ср");
        else if (i == 4)
            System.out.println("Чт");
        else if (i == 5)
            System.out.println("Пт");
        else if (i == 6)
            System.out.println("Сб");
        else if (i == 7)
            System.out.println("Вс");
    }

    static void withswitch() {
        int i = 2;

        // Специальная конструкция для таких ситуаций - switch
        // В начале мы указываем в зависимости от значения какой переменной существуют "ветки" кода
        switch (i) {
            // Перечисление возможных случаев и что нужно делать при конкретном случае
            case 1:
                System.out.println("Пн");
                // Необходим break в конце, иначе будут выполняться соседние блоки кода
                break;
            case 2:
                System.out.println("Вт");
                break;
            case 3:
                System.out.println("Ср");
                break;
            case 4:
                System.out.println("Чт");
                break;
            case 5:
                System.out.println("Пт");
                break;
            case 6:
                System.out.println("Сб");
                break;
            case 7:
                System.out.println("Вс");
                break;
            default:
                System.out.println("Неверное значение");
                break;
        }
    }
}
