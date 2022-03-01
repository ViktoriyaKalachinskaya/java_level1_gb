/**
 * Java 1. Home Work #6
 *
 * @author Viktoriya Kalachinskaya
 * @version 01.03.2022
 */

class HomeWork6 {
    public static void main (String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500,10);

        IAnimal[] animals = {cat,dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(250));
            System.out.println(animal.run(550));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
        System.out.println(" Animals were created: " + Animal.getCountOfAnimals());
    }
}
