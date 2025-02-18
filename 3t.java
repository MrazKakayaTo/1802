public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Антон", 30, 50000, "Кто");
        Employee emp2 = new Employee(2, "Андрей", 40, 60000, "Что");
        emp1.increaseSalary();
        emp2.increaseSalary();
        emp1.showInfo();
        emp2.showInfo();
    }
}
