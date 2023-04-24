class Animal {
    private int age;
    public void eat() {System.out.println("먹는다.");}
}

class Dog extends Animal {
    public void bark() {System.out.println("짖는다.");}
}

public class DogTest {
    public static void main(String [] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
