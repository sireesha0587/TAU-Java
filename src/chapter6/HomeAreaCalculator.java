package chapter6;

public class HomeAreaCalculator {

    public static void main(String args []){

        /*
            REACTANGLE 01
         */

        Rectangle room1 = new Rectangle();
        room1.setLength(25);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();

        /********
            REACTANGLE 02
         */
        Rectangle room2 = new Rectangle(20,30);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("TotalArea is:" + totalArea);

    }
}
