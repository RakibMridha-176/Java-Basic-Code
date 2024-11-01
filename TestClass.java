package Inheritance_prob_6;
import  java.util.*;


public class TestClass {
    public static void main(String [] args){
        String regNum, color, OwnerNam, manufacturer;
        int speed, route;

        //BUS Details
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bus reg number: ");
        regNum = sc.nextLine();
        System.out.println("Enter Bus Color: ");
        color = sc.nextLine();
        System.out.println("Enter Bus Owner Name:  ");
        OwnerNam = sc.nextLine();
        System.out.println("Enter Bus Speed: ");
        speed = sc.nextInt();
        System.out.println("Enter Bus Route NUmber: ");
        route = sc.nextInt();
        Bus b =  new Bus(regNum, color, OwnerNam, speed, route);
        b.showData();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


        //Car Details
        System.out.println("Enter the Car reg number: ");
        regNum = sc.nextLine();
        System.out.println("Enter Car Color: ");
        color = sc.nextLine();
        System.out.println("Enter Car Owner Name:  ");
        OwnerNam = sc.nextLine();
        System.out.println("Enter Car Speed: ");
        speed = sc.nextInt();
        System.out.println("Enter Car Manufacturer Company NUmber: ");
        manufacturer= sc.nextLine();
        Car C =  new Car(regNum, color, OwnerNam, speed, manufacturer);
        C.showData();
    }

}
