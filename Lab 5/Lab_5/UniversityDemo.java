package Upes.Lab_5;

// Demonstrate polymorphism
public class UniversityDemo {
    public static void main(String[] args) {
        Person[] people = { new Professor(), new GraduateStudent() };

        for (Person p : people) {
            if (p instanceof Professor) {
                ((Professor) p).conductLecture();
            } else if (p instanceof GraduateStudent) {
                ((GraduateStudent) p).submitThesis();
            }
        }
    }
}
