interface RemoteControl {
    void turnOn();
    void turnOff();
}

public class AnonymousClassTest1 {
    public static void main(String args []) {
        RemoteControl ac = new RemoteControl() {
            public void turnOn() {
                System.out.println("TV turn on");
            }

            public void turnOff() {
                System.out.println("TV turn off");
            }
        };
        ac.turnOn();
        ac.turnOff();
    }
}
