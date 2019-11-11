package chapter6;

public class HomeAreaCalculator {
    public static void main(String args[]){

        // Create in instance of Rectangle class

        // Rectangle 1
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(40);
        double areaOfRoom1 = room1.calculateArea();

        // Rectangle 2
        Rectangle room2 = new Rectangle(30,45);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms: " + totalArea);

    }
}
