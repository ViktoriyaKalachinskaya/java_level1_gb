/**
 * Java 1. Home Work #7
 *
 * @author Viktoriya Kalachinskaya
 * @version 06.03.2022
 */
class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Mashka", 10), new Cat("Baks",15), new Cat("Vasya",5)
        };
        Plate plate = new Plate(50,30);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}
