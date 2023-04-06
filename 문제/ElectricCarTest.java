public class ElectricCarTest {
    public static void main(String args[]) {
        ElectricCar obj = new ElectricCar();
        obj.speed = 10; // 부모 클래스의 필드에 접근한다.
        obj.setSpeed(60); // 부모 클래스의 메소드에 접근한다.
        obj.charge(10); // 자체 메소드에 접근한다.
    }
}
