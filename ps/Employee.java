class Person {
    String name;
    public Person() {}
    public Person(String name) {this.name = name;}
}

class Employe extends Person {
    String id;
    public Employe() { super(); }
    public Employe(String name) {
        super(name);
    }
    public Employe(String name, String id) {
        super(name);
        this.id = id;
    }
}

public class Employee {
    public static void main(String [] args) {
        Employe employee = new Employe("kim", "prepared");
        System.out.println(employee);
    }
}
