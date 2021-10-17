package lesson2;

public class A_Actions {
    static void actions() {
        int a = 5;
        int b = 0;
        // Нельзя делить int на 0
        // Если убрать знаки комментария на следующих строках, возникнет ошибка при работе программы
        // System.out.println(a / b);
        // System.out.println(a % b);

        double c = 5.0;
        double d = 0.0;
        // При делении на 0 в дробных числах, ошибки не возникает
        // Результатом будет специальное значение +бесконечность
        // Такие значения определяются стандартом IEEE754
        System.out.println(c / d);
        // Есть возможность создавать специальные значение, такие как + и - бесконечность
        double inf = Double.POSITIVE_INFINITY;

        // Действия сравнения переменных
        System.out.println(a > b);
        // == это знак сравнения на равенство, != это знак сравнения на НЕравенство
        System.out.println(a == b);
        System.out.println(a != b);
        // И в левой, и в правой части сравнения могут быть какие-нибудь действия
        // В таких случаях сначала произойдет подсчёт значений справа и слева
        // И после этого они будут сравниваться
        System.out.println(a - 1 == b + 4);
    }

    static void log_actions() {
        // Логический оператор НЕ (англ. not)
        // Меняет true на false и наоборот
        System.out.println(!true);
        System.out.println(!false);

        // Логический оператор ИЛИ (англ. or)
        // В результате получается false только если и слева, и справа false
        // В остальных случаях true
        System.out.println(false || false);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(true || true);

        System.out.println();

        // Логический оператор И (англ. and)
        // В результате получается true только если и слева, и справа true
        // В остальных случаях false
        System.out.println(false && false);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(true && true);
    }

}
