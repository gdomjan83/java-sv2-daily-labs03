package day01;

public class StudentsMain {
    public static void main(String[] args) {
        Students students = new Students();

        students.addHeight(170);
        students.addHeight(175);
        students.addHeight(180);
        students.addHeight(190);
        students.addHeight(200);

        System.out.println(students.isHeightIncreasing());
    }
}
