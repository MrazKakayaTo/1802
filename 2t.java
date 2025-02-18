public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Иван", new double[]{4.5, 3.7, 5.0});
        System.out.println("Средняя оценка студента " + student.getName() + ": " + student.calculateAverage());
    }
}
