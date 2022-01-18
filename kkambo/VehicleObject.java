package kkambo;

public class VehicleObject {
    public static void main(String[] args) {
        Vehicle objv = new Vehicle();
        objv.setChangeGear(3);
        objv.setSpeed(70);

        System.out.println("objv = " + objv);
    }
}
