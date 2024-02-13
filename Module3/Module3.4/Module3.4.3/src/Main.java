import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Create instances of Student, Course, and Enrollment
        Student student = new Student(1, "Matti Meikalainen", 20);
        Course course = new Course("RU123", "Ruotsi", "Maija Mehilainen");
        Enrollment enrollment = new Enrollment(student, course, "2024-02-13");

        // Serialize and save the Enrollment instance
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enrollments.ser"))) {
            oos.writeObject(enrollment);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize and print the Enrollment instance
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("enrollments.ser"))) {
            Enrollment deserializedEnrollment = (Enrollment) ois.readObject();
            System.out.println("Student ID: " + deserializedEnrollment.getStudent().getId());
            System.out.println("Student Name: " + deserializedEnrollment.getStudent().getName());
            System.out.println("Student Age: " + deserializedEnrollment.getStudent().getAge());
            System.out.println("Course Code: " + deserializedEnrollment.getCourse().getCourseCode());
            System.out.println("Course Name: " + deserializedEnrollment.getCourse().getCourseName());
            System.out.println("Instructor: " + deserializedEnrollment.getCourse().getInstructor());
            System.out.println("Enrollment Date: " + deserializedEnrollment.getEnrollmentDate());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}