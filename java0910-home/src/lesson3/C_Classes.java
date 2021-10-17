package lesson3;

public class C_Classes {
    //static int i;

    static class A {}

    static class Animal {
        int age;
        String name;

        void meow() {
            System.out.println("meow");
        }

        void sayName() {
            System.out.println("My name is " + name);
        }

        Animal(){}

        Animal(int a, String n) {
            age = a;
            name = n;
        }
    }

    static void classes() {
        A a = new A();
        A b = new A();
        //System.out.println(a);
        //System.out.println(b);

        Animal vasya = new Animal();
        System.out.println(vasya.name);
        System.out.println(vasya.age);
        vasya.name = "Vasya";
        vasya.age = 3;
        System.out.println(vasya.name);
        System.out.println(vasya.age);

        vasya.meow();
        vasya.sayName();

        Animal barsik = new Animal();
        barsik.name = "Barsik";
        barsik.age = 5;
        barsik.sayName();
        barsik.meow();
    }

    static void constructors() {
        Animal sharik = new Animal(5, "Sharik");
        System.out.println(sharik.name);
        System.out.println(sharik.age);
        Animal barbos = new Animal(10,"Barbos");
        System.out.println(barbos.name);
        System.out.println(barbos.age);
    }

    static void add(int a, int b) {
        System.out.println(a + b);
        //i = a + b;
    }

    static int min(int a, int b) {
        return a - b;
    }

    static void methods() {
        add(5,6);
        //System.out.println(i);
        add(11,1);
        // Ошибка, потому что "11" - String, а нужен int
        //add("11", 1);

        System.out.println(min(5,6));
    }
}
