package Student_Grading_System;

public class Course {
    private String courseCode;
    private String courseName;
    private int credits;

    public Course(String courseCode,String courseName,int credits){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.credits=credits;
    }

    public String getCourseInfo(){
        return courseCode + ":" +courseName+"("+credits+" credits)";
    }
    public String getCourseCode(){
        return courseCode;
    }
}
