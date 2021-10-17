package lesson3;

public class D_Vidimost {
    static void a() {
        System.out.println("Начало a");
        System.out.println(5 / 0);
        System.out.println("Конец a");
    }

    static void b() {
        System.out.println("Начало b");
        a();
        System.out.println("Конец b");
    }

    static void c() {
        System.out.println("Начало с");
        b();
        System.out.println("Конец c");
    }

    static void example() {
        int i = 0;
        if (5 > 0)
            i = 5;
        System.out.println(i);
    }
}
