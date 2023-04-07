class Person {
    String name;
    public Person() { };
    public Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    String id;
    public Employee() {
        super();
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, String id) {
        super(name);
        this.id = id;
    }
}

public class EmployeeTest {
    public static void main(String args[]) {
        Employee obj = new Employee("Sewon", "2022440025");

        System.out.println("Employ [id: " + obj.id + ", name: " + obj.name + "]"); // Employ [id: 2022440025, name: Sewon]
    }
}
