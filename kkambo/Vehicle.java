package kkambo;

public class Vehicle {

    int speed;
    int changeGear;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setChangeGear(int changeGear) {
        this.changeGear = changeGear;
    }

    public String toString(){
        return "Speed : " + speed + "Gear : " + changeGear;
    }

}
