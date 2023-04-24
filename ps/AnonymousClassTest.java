interface RemoteControl {
    public abstract void turnOn();
    public abstract void turnOff();
}

public class AnonymousClassTest {
    public static void main(String[] args) {
        RemoteControl ac = new RemoteControl() {
            public void turnOn() {
                System.out.println("turn on");
            }

            public void turnOff() {
                System.out.println("turn off");
            }
        };

        ac.turnOn();
        ac.turnOff();
    }
}
