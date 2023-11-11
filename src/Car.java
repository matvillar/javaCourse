public class Car {
    // object = an instance of a class that may contain attributes and methods.

 String make = "Toyota";
 String model = "Camry";
 int year = 2020;
 String color ="blue";
 double price = 34000.99;

 void drive(){
     System.out.println("You drive the car");
 }

 void brake() {
     System.out.println("You are stepping on the brakes");

 }

 public String toString(){
  String myStr = make + ", " + model;
  return myStr;
 }
}
