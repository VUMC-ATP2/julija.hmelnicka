package homework.classHomework;

public class Triangle {

    int sideA;
    int sideB;
    int sideC;
    double areaOfTriangle;

    public Triangle() {
        System.out.println("Triangle object is created");
    }

    public double triangleArea (int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        double p = (sideA + sideB + sideC) / 2; //semi perimetr
        areaOfTriangle = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return this.areaOfTriangle;
    }

    public boolean isEquilateral () {
        boolean equilateral = true;
        if (sideA == sideB && sideA == sideC && sideB == sideC) {
            System.out.println("Triangle is equilateral");
        }
        else {
            System.out.println("Triangle is not equilateral");
        }
        return equilateral;
    }

    public boolean isIsosceles () {
        boolean isosceles = true;
        if (sideA == sideB || sideA == sideC || sideB == sideC) {
            System.out.println("Triangle is isoceles");
        }
        else {
            System.out.println("Triangle is not isoceles");
        }
        return isosceles;
    }
}
