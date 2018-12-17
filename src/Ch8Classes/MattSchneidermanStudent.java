package Ch8Classes;

public class MattSchneidermanStudent{
    private String name;
    private int grade;
    private String school;
    private int studID;
    private int DOB;
    private String[] schedule;
    private String address;
    private String counselor;
    private char gender;

    //constructor
    public MattSchneidermanStudent(String name, int grade, int DOB,
                                   String address, char gender) {
        this.name = name;
        this.grade = grade;
        this.DOB = DOB;
        this.address = address;
        this.gender = gender;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getSchool() {
        return school;
    }

    public int getDOB() {
        return DOB;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public String getAddress() {
        return address;
    }

    public String getCounselor() {
        return counselor;
    }

    public char getGender() {
        return gender;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCounselor(String counselor) {
        this.counselor = counselor;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString(){
        return "This is " + name + " student profile. They go to"
        + school + "Their address is" + address +
                ". Their schedule is " + schedule + ".";
    }
}
