public class Vehicle {
    int speed;
    int heading;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void turn(int angle) {
        heading = angle;
    }
}

class Car extends Vehicle {
    int price;
}

class Truck extends Vehicle {
    int payload;
}

class Bus extends Vehicle {
    int seat;
}


