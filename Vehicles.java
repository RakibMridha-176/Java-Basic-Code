package Inheritance_prob_6;

public class Vehicles{
    String regNum, color, OwnerNam;
    int speed;

    public Vehicles(String regNum, String color, String ownerNam, int speed) {
        
    }

    void MyOwnVehicles(String regNum, String Color, String OwnerNam, int  Speed){
        this.regNum = regNum;
        this.color = color;
        this.OwnerNam= OwnerNam;
        this.speed = speed;
    }
    public void showData(){

        System.out.println("This is a Vehicles:  ");
        System.out.println("Registration Number: " + regNum);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + OwnerNam);
        System.out.println("Speed: " + speed);
    }

}
