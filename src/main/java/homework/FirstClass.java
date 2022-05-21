package homework;

public class FirstClass {
    public static void main(String[] args) {

        //country
        String countryName = "Turkey";
        System.out.println("Country name: " + countryName);

        int population = 84680273;
        System.out.println("Population: " + population + " people");

        double totalArea = 783.356;
        System.out.println("Total area in square kilometers: " + totalArea);

        String countryCapitalName = "Ankara";
        System.out.println("Capital of Turkey: " + countryCapitalName);

        String oficialLanguege = "Turkish";
        System.out.println("Oficial Laguege: " + oficialLanguege);

        boolean memberEU = false;
        boolean notMemberEU = true;

        if (memberEU) {
            System.out.println("Member country of EU");
        } else {
            System.out.println("Not a member country of EU");
        }

        char oficialCurrency = '₤';
        System.out.println("Oficial currency: " + oficialCurrency + " (Turkish lyra)");

        //about me
        String aboutMe = "Hi there! My name is Julia.";
        String aboutMeSecond = "I am 36 years old.";
        String aboutMeThird = "I am from Jurmala.";
        System.out.printf("%s %s %s\n", aboutMe, aboutMeSecond, aboutMeSecond);

        //operators

        int a = 2 + 2;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        int x = 666;
        int y = 22;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

        int z = 888;
        int q = 44;
        int p = z - q;
        int v = z + q;
        int r = z / q;
        int w = z * q;
        System.out.println("z - q = " + p);
        System.out.println("z + q = " + v);
        System.out.println("z / q = " + r);
        System.out.println("z * q = " + w);


        //using doubles
        double f = 1 + 1;
        double g = f * 3;
        double h = g / 4;
        double i = h - f;
        double j = -i;
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("j = " + j);











    }
}
