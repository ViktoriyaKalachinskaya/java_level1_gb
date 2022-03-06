/**
 * Java 1. Home Work #7
 *
 * @author Viktoriya Kalachinskaya
 * @version 06.03.2022
 */
class Plate {
    private int volume;
    private int food;

    Plate(int volume, int food) {
        this.volume = volume;
        this.food = food;
    }
    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }
        void add(int food) {
            if (this.food + food <= volume) {
                this.food += food;
            }
        }
        @Override
    public String toString() {
        return "plate: " + food;
    }
}
