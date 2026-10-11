import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TextCounterTest {
    @Test
    public void testCountRows3(){
        //Arrange
        TextCounter counter = new TextCounter();
        String text = "";

        //Act
        counter.count(text);
        counter.count(text);
        counter.count(text);

        int actual = counter.getAntalRader();
        int expected = 3;

        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testCountLetters (){
        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.count("Hej");
        int actual = counter.getAntalTecken();
        int expected = 3;

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testEmptyText (){
        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.count("");
        int actual = counter.getAntalTecken();
        int expected = 0;

        //Assert
        assertEquals(expected, actual);
    }



}

