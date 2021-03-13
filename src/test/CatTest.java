package test;



import eu.senla.task3.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CatTest {
    private Cat cat2 = new Cat("Tim",3);
    private Cat cat3 = new Cat("Tor",4);

    @Test
    void notNullTest(){
        Assertions.assertNotNull(cat2);
        Assertions.assertNotNull(cat3);
    }

    @Test
    void notSame(){
        Assertions.assertNotSame(cat2,cat3);
    }

    @Test
    void nameAndAgeTest(){
        Assertions.assertEquals("Tim",cat2.getName());
        Assertions.assertEquals("Tor",cat3.getName());
        Assertions.assertEquals(3,cat2.getAge());
        Assertions.assertEquals(4,cat3.getAge());
    }
    @Test
    void getMock(){
        Cat catMock = Mockito.mock(Cat.class);
       // Mockito.when(cat2.getName()).thenReturn("Tim");
    }




}
