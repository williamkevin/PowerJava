class Base {
    Base() {
        System.out.println("Base() 생성자 호출");
    }

    Base(int x) {
        System.out.println("Base(int x) 생성자 호출");
    }
};

class Derived extends Base {
    Derived() {
        super(100);
        System.out.println("Derived() 생성자 호출");
    }
};

public class Test {
    public static void main(String args[]) {
        Derived obj = new Derived();
    }
}

/*
Base(int x) 생성자 호출
Derived() 생성자 호출
 */
