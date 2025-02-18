public class Student {
    private String name;
    private double[] grades;
    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }
    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
    public String getName() {
        return name;
    }
}
