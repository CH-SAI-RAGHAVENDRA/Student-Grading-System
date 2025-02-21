package Student_Grading_System;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        
        while (true) {
            System.out.println("\n--- Student Grading System Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course to Student");
            System.out.println("3. Add Grade to Student");
            System.out.println("4. Display Student Grades");
            System.out.println("5. Calculate Student Average");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                System.out.print("Enter Student ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Student Type (1 for Undergraduate, 2 for Graduate): ");
                int type = scanner.nextInt();
        
                if (type == 1) {
                    students.add(new UndergraduateStudent(name, id));  
                } else if (type == 2) {
                    students.add(new GraduateStudent(name, id));  
                } else {
                    System.out.println("Invalid type. Try again.");
                }
                break;

                case 2:
                    System.out.print("Enter Student Roll Number: ");
                    id = scanner.nextLine();
                    Student student = findStudentById(students, id);
                    if (student != null) {
                        System.out.print("Enter Course Code: ");
                        String courseCode = scanner.nextLine();
                        System.out.print("Enter Course Name: ");
                        String courseName = scanner.nextLine();
                        System.out.print("Enter Course Credits: ");
                        int credits = scanner.nextInt();
                        Course course = new Course(courseCode, courseName, credits);
                        student.addCourse(course);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    id = scanner.nextLine();
                    student = findStudentById(students, id);
                    if (student != null) {
                        System.out.print("Enter Course Code: ");
                        String courseCode = scanner.nextLine();
                        System.out.print("Enter Grade: ");
                        double gradeValue = scanner.nextDouble();
                        Grade grade = new Grade(courseCode, gradeValue);
                        student.addGrade(grade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    id = scanner.nextLine();
                    student = findStudentById(students, id);
                    if (student != null) {
                        student.displayGrades();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    id = scanner.nextLine();
                    student = findStudentById(students, id);
                    if (student != null) {
                        System.out.println("Average Grade: " + student.calculateAverage());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
        }
        }
}
private static Student findStudentById(List<Student> students, String id) {
    for (Student student : students) {
        if (student.Roll_No.equals(id.trim())) {
            return student;
        }
    }
    return null;
}
}
