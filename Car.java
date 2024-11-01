package Inheritance_prob_6;

class Car extends Vehicles {
    String manufacturer;

    public Car(String regNum, String color, String ownerName, int speed, String manufacturer) {
        super(regNum, color, ownerName, speed);
        this.manufacturer = manufacturer;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Manufacturer: " + manufacturer);
    }
}
