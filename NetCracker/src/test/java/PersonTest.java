import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PersonTest {

    Person personTest1 = null;


    @Before
    public void initialize(){
        personTest1 = new Person(8, "Иванов Иван Иванович", 'м', new LocalDate(1961, 11, 14));
    }

    @Test
    public void getAgeTest() {
        int actualAge = personTest1.AgeOfPerson();
        assertEquals(57, actualAge);
    }

    @Test
    public void getNamePerson() throws Exception {
        String name = personTest1.getFIO();
        assertEquals("Иванов Иван Иванович", name);
    }

    @Test
    public void getBirthDate() throws Exception {
        LocalDate date = new LocalDate(1961, 11, 14);
        assertEquals(date, personTest1.getDateOfBirth());
    }
}
