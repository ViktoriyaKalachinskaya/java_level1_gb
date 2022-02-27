/**
 * Java 1. Home Work #5
 *
 * @author Viktoriya Kalachinskaya
 * @version 27.02.2022
 */


class HomeWork5 {

    public static void main (String[] args) {
        Employee[] employees = {
                new Employee("Kalachinskaya Viktoriya Eduardovna", "Manager", "vika1@mail.ru",
                             "89514278666", 200000, 27),
                new Employee("Nikitin Nikita Nikitovich", "DevOps", "nikita29@mail.ru",
                             "89088071433", 300000, 29),
                new Employee("Lizina Elizaveta Ivanovna", "Manager", "ivanovna@mail.ru",
                             "89514278855", 150000, 25),
                new Employee("Tatarinov Vadim Pantelimonovich", "Engineer", "tatarv@bk.com",
                             "9512335", 310000, 42),
                new Employee("Laketco Yana Egorovna", "stylist", "volosi55@styl-list.ru",
                             "88005553535", 400000, 20)
        };
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
