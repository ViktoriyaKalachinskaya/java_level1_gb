/**
 * Java 1. Home Work #6
 *
 * @author Viktoriya Kalachinskaya
 * @version 01.03.2022
 */
class Cat extends Animal {
    Cat(int runLimit) {
        super(runLimit, -1);
    }
    @Override
    public String swim(int distance) {
        return getClassName() + " can't swim ";
    }
}
