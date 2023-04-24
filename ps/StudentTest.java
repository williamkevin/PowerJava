class Person {
    private String regNum;
    private double weight;
    protected int age;
    public String name;

    public String getRegNum() {
        return regNum;
    }
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }
}

class Student extends Person {
    int id;
}

public class StudentTest {
    public static void main(String [] args) {
        Student student = new Student();
        student.age = 23;
        System.out.println(student.age);    
    }
}
