public class Employee {
    private int id;
    private String surname;
    private int age;
    private double salary;
    private String department;
    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    public void increaseSalary() {
        salary *= 2;
    }
    public void showInfo() {
        System.out.println("Сотрудник: " + surname + ", Зарплата: " + salary);
    }
}
