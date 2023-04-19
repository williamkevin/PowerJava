class B {
    public void c() {
        System.out.println("메소드");
    }
}

public class A extends B{
    public static void main(String [] args) {
        B b = new B();
        System.out.println(b);
    }
}
