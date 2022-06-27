package classroom.encapsulation;

public class Example {
    public static void main(String[] args) {

        Student nikita = new Student("nikita.milka");
        System.out.println(nikita.getMail());

        nikita.setMail("nmilka@lu.lv");
        nikita.setName("Nikita");
        nikita.setLastname("Milka");
        nikita.setHasMood(true);
        System.out.println(nikita);

        Student zanna = new Student("");
        System.out.println("zanna email: " + zanna.getMail());
        zanna.setMail("zanna@lu.lv");
        System.out.println("zanna email: " + zanna.getMail());
        zanna.setMail("zanna2@lu.lv");
        zanna.setGraduationYear(2020);
        System.out.println("zanna graduation year is: " + zanna.getGraduationYear());
        zanna.setGraduationYear(2023);
        System.out.println(zanna.getGraduationYear());



    }
}

