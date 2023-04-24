interface RemoteControl {
    public abstract void turnOn();
    public abstract void turnOff();
    public default void printBrand() { System.out.println("Remote Contral이 가능한 TV"); };
}

class Television implements RemoteControl {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("켜짐");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("꺼짐");
    }

    @Override
    public void printBrand() {
        System.out.println("PowerJava TV");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        RemoteControl remoteControl = new Television();

        remoteControl.turnOn();
        remoteControl.turnOff();
        remoteControl.printBrand();
    }
}