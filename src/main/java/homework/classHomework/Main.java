package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        //1 uzdevums

        Triangle newTriangle = new Triangle();
        newTriangle.sideA = 8;
        newTriangle.sideB = 10;
        newTriangle.sideC = 8;

        System.out.println("Area of new triangle is: " + newTriangle.triangleArea(newTriangle.sideA, newTriangle.sideB, newTriangle.sideC));

        newTriangle.isEquilateral();
        newTriangle.isIsosceles();

        //2 uzdevums

        Triangle nextTriangle = new Triangle();
        System.out.println("This triangle area is: " + nextTriangle.triangleArea(10,10,10));
        nextTriangle.isEquilateral();
        nextTriangle.isIsosceles();
    }
}
