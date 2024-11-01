package Inheritance_prob_6;

class Bus extends Vehicles {
    int route;

    public Bus(String regNum, String color, String ownerName, int speed, int route) {
        super(regNum, color, ownerName, speed);
        this.route = route;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Route Number: " + route);
    }
}