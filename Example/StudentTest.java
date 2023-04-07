class Person {
    // private String regnumber;
    private double weight;
    protected int age;
    String name;

    double getWeight() {
        return weight;
    } 

    void setWeight(double weight) {
        this.weight = weight;
    }
}

class Student extends Person {
    int id;
}

public class StudentTest {
    public static void main(String args[]) {
        Student obj = new Student();

        // obj.regnumber = '123456 - 1234567'; // 오류
        // obj.weight = 70; // 오류
        obj.age = 23;
        obj.name = "Sewon Kim";
        obj.setWeight(70);

        System.out.println(obj.age + "세"); // 23세
        System.out.println(obj.name); // Sewon Kim
        System.out.println(obj.getWeight() + "kg"); // 70.0kg
    }
}
