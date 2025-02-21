package Student_Grading_System;
import java.util.*;

abstract class Student {
    protected String Name;
    protected String Roll_No;
    protected List<Course> c;
    protected List<Grade> grades;

    public Student(String Name,String Roll_No)
    {
        this.Name=Name;
        this.Roll_No=Roll_No;
        this.c=new ArrayList<>();
        this.grades=new ArrayList<>();
    }
    
    public void addCourse(Course course)
    {
        c.add(course);
    }
    public void addGrade(Grade grade)
    {
        grades.add(grade);
    }

    public void displayGrades(){
        System.out.println("Grades of "+Name+": ");
        for(Grade grade:grades){
            System.out.println("Course: "+grade.getCourseCode()+" - Grade: "+grade.getPercentage()+ "% -Grade: "+grade.getLetterGrade()+" - Points: "+grade.getGradePoints());
        }
    }

        public abstract double calculateAverage();
}

class UndergraduateStudent extends Student{
        public UndergraduateStudent(String Roll_No,String name){
            super(Roll_No,name);
        }
        public double calculateAverage() {
            double totalPoints=0;
            for(Grade grade:grades){
                totalPoints+=grade.getGradePoints();
            }
            return grades.size()>0?totalPoints/grades.size():0.0;
}
}

class GraduateStudent extends Student {

    public GraduateStudent(String Roll_No, String name) {
        super(Roll_No, name);
    }
    public double calculateAverage() {
        double totalPoints=0;
        for(Grade grade:grades){
            totalPoints+=grade.getGradePoints();
        }
        return grades.size()>0?totalPoints/grades.size():0.0;
}
}
