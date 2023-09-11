import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    private Person p1, p2, p3;

    @BeforeEach
    void setUp() {
        p1 = new Person("Josh", "Anness", "123123", "Mr.", 1999);
        p2 = new Person("Grisha", "Jaeger", "333444", "Dr.", 1940);
        p3 = new Person("Arthur", "Morgan", "190100", "Mr.", 1910);
    }
    @Test
    public void testFullName() {
        Person p1 = new Person("Josh", "Anness", "123123", "Mr.", 1999);
        assertEquals("Josh Anness", p1.fullName());
        Person p2 = new Person("Grisha", "Jaeger", "333444", "Dr.", 1940);
        assertEquals("Grisha Jaeger", p2.fullName());
        Person p3 = new Person("Arthur", "Morgan", "190100", "Mr.", 1910);
        assertEquals("Arthur Morgan", p3.fullName());
    }

    @Test
    public void testFormalName() {
        Person p1 = new Person("Josh", "Anness", "123123", "Mr.", 1999);
        assertEquals("Mr. Josh Anness", p1.formalName());
        Person p2 = new Person("Grisha", "Jaeger", "333444", "Dr.", 1940);
        assertEquals("Dr. Grisha Jaeger", p2.formalName());
        Person p3 = new Person("Arthur", "Morgan", "190100", "Mr.", 1910);
        assertEquals("Mr. Arthur Morgan", p3.formalName());

    }

    @Test
    public void testGetAge() {
        Person p1 = new Person("Josh", "Anness", "123123", "Mr.", 1999);
        assertEquals(24, p1.getAge(2023));
        Person p2 = new Person("Grisha", "Jaeger", "333444", "Dr.", 1940);
        assertEquals(83, p2.getAge(2023));
        Person p3 = new Person("Arthur", "Morgan", "190100", "Mr.", 1910);
        assertEquals(113, p3.getAge(2023));
    }
}
