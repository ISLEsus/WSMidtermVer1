package kz.iitu;

public class Subject {

    //    public String SubjectDay;
    //    public String SubjectGroup;
    //    public String SubjectTeacher;
    //    public String SubjectTime;
    //    public String SubjectName;

    private String SubjectDay;
    private String SubjectGroup;
    private String SubjectTeacher;
    private String SubjectTime;
    private String SubjectName;

    public Subject(String day, String subjectGroup, String teacher, String time, String subjectName) {
        this.SubjectDay = day;
        this.SubjectGroup = subjectGroup;
        this.SubjectTeacher = teacher;
        this.SubjectTime = time;
        this.SubjectName = subjectName;
    }

    public void Display() {
        System.out.println(SubjectDay + ": " + SubjectTime + " - " + SubjectName + "(" + SubjectTeacher + ") for the group " + SubjectGroup);
    }

//    public Subject(String Day, String Group, String Teacher, String Time, String SubjectName) {
//    this.Day = Day;
//    this.Group = Group;
//    this.Teacher = Teacher;
//    this.Time = Time;
//    this.Name = Name;
//    }

    //Setters
    public void setSubjectDay(String subjectDay) {
        SubjectDay = subjectDay;
    }
    public void setSubjectGroup(String subjectGroup) {
        SubjectGroup = subjectGroup;
    }
    public void setSubjectTeacher(String subjectTeacher) {
        SubjectTeacher = subjectTeacher;
    }
    public void setSubjectTime(String subjectTime) {
        SubjectTime = subjectTime;
    }
    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    //Getters
    public String getSubjectDay() {
        return SubjectDay;
    }
    public String getSubjectGroup() {
        return SubjectGroup;
    }
    public String getSubjectTeacher() {
        return SubjectTeacher;
    }
    public String getSubjectTime() {
        return SubjectTime;
    }
    public String getSubjectName() {
        return SubjectName;
    }
}
