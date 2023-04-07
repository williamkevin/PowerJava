class Parent {
    public Parent() {
        System.out.println("Parent default constructor");
    }

    public Parent(int x) {
        System.out.println("Parent constructor with int parameter: " + x);
    }
}

class Child extends Parent {
    public Child() {
        super();
        System.out.println("Child default constructor");
    }

    public Child(int x) {
        super(x);
        System.out.println("Child constructor with int parameter: " + x);
    }
}

public class Main {
    public static void main(String args[]) {
        Child obj = new Child(50);
    }
}
