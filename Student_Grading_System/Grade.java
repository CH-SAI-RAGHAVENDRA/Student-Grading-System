package Student_Grading_System;

public class Grade {
    private String courseCode;
    private double percentage;
    private String letterGrade;
    private double gradePoints;
    public Grade(String courseCode,double percentage){
        this.courseCode=courseCode;
        this.percentage=percentage;
        this.letterGrade=calculateLettergrade(percentage);
        this.gradePoints=calculateGradePoints(letterGrade);
    }

    private String calculateLettergrade(double percentage){
        if(percentage>=90)
        return "O";
        else if(percentage>=80)
        return "A+";
        else if(percentage>=70)
        return "A";
        else if(percentage>=60)
        return "B+";
        else if(percentage>=50)
        return "B";
        else if(percentage>=40)
        return "C";
        else
        return "F";
    }

    private double calculateGradePoints(String lettergrade){
        switch(letterGrade){
            case "O":
            return 10;
            case "A+":
            return 9;
            case "A":
            return 8;
            case "B+":
            return 7;
            case "B":
            return 6;
            case "C":
            return 5;
            default: return 0;
        }
    }

    public double getGradePoints()
    {
        return gradePoints;
    }
    public String getCourseCode(){
        return courseCode;
    }
    public double getPercentage(){
        return percentage;
    }
    public String getLetterGrade(){
        return letterGrade;
    }
}
