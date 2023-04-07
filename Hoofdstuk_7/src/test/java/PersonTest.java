import nl.corne.Gender;
import nl.corne.Person;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testPerson() {
        Person p = new Person("Jan", 45);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());

        System.out.println(p.getAge());
        System.out.println(Person.universalRights);
    }
}
