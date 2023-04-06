class Animal {
    int age;
    void eat() {
        System.out.println("먹음");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("짖음");
    }
}

public class DogTest {
    public static void main(String args[]) {
        Dog obj = new Dog();
        obj.eat(); // 먹음
        obj.bark(); // 짖음
    }
}
