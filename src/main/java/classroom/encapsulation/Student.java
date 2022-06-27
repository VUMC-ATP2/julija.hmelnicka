package classroom.encapsulation;

import lombok.*;

import java.util.Calendar;
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person {

   @Getter
    public int graduationYear;
    private String mailDomain = "@lu.lv";
    @Getter
    private String mail = "";

    public Student(String accountName) {
        mail = accountName + mailDomain;
    }
    public void setMail(String mail) {
       if(this.mail.equals("@lu.lv") || this.equals("")) {
            this.mail = mail;
        } else {
            System.out.printf("your email is: %s which is correct one, and it wil be not changed\n", this.mail);
        }
    }



    public void setGraduationYear(int graduationYear) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (graduationYear > currentYear) {
            System.out.println("that Value cannot be set! Current year: " + currentYear);
        } else {
            this.graduationYear = graduationYear;
        }


    }
}
