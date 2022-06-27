package classroom.encapsulation;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"lastname", "name"})
public class Person {


    protected String name = "John";
    protected String lastname = "Doe";
    protected String email = "john.doe@mail.com";
    private boolean hasMood;
}
