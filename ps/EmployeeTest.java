class Employee {
    private int salary = 5000000;
    public int getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    @Override
    public int getSalary() {
        return 6000000;
    }
}

class Programmer extends Employee {
    @Override
    public int getSalary() {
        return 7000000;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Programmer programmer = new Programmer();

        System.out.println("관리자의 월급은: " + manager.getSalary());
        System.out.println("프로그래머의 월급은: " + programmer.getSalary());
    }
}
