package lesson3;


/*
Петя пошёл в магазин и купил хлеб. Донёс и оставил дома.
 */
class Person {
    String name;
    Location location;
    Product[] have;

    // Изменить location на другой
    void goTo(Location l) {
        location = l;
    }

    void buySmth(Product p) {
        location.delete(p);
        have[0] = p;
    }

    void store(Product p) {
        location.add(p);
    }
}

class Product {
    String name;
}

class Location {
    String name;
    Product[] products;

    void add(Product p) {
        products[0] = p;
    }
    void delete(Product p) {
        products[0] = null;
    }
}

public class D_ClassExamples {
    public static void main(String[] args) {
        // Изначальные условия "задачи"
        Person petya = new Person();
        petya.name = "Petya";

        Location store = new Location();
        store.name = "Store";
        Location home = new Location();
        home.name = "Home";

        Product bread = new Product();
        bread.name = "Bread";

        store.products = new Product[]{bread};
        home.products = new Product[1];
        petya.have = new Product[1];

        petya.location = home;

        // "Алгоритм" из задачи
        // Петя идёт в магазин
        petya.goTo(store);

        // Петя покупает хлеб
        petya.buySmth(bread);

        // Петя идёт домой
        petya.goTo(home);

        // Петя кладёт хлеб
        petya.store(bread);
    }
}
