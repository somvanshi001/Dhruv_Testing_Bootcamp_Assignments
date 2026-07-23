package ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExceptionsExampleTest {

    @Test
    public void catchANullPointerException() {

        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        }

        System.out.println(age);
        System.out.println(ageAsString);

        String yourAge = "You are " + age + " years old";

        assertEquals("You are 18 years old", yourAge);
    }
}