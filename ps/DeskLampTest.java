class DeskLamp {
    private boolean isOn;

    public void turnOn() {isOn = true;}
    public void turnOff() {isOn = false;}
    public String print() {
        return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
    }
}

public class DeskLampTest {
    public static void main(String [] args) {
        DeskLamp deskLamp = new DeskLamp();

        deskLamp.turnOn();
        System.out.println(deskLamp);
        
        deskLamp.turnOff();
        System.out.println(deskLamp.print());
    }
}
