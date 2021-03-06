/**
 * Java 1. Home Work #5
 *
 * @author Viktoriya Kalachinskaya
 * @version 27.02.2022
 */

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public  Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name +
                "\n Position: " + position +
                "\n Email: " + email +
                "\n Phone: " + phone +
                "\n Salary: " + salary +
                "\n Age: " + age);
    }
}
