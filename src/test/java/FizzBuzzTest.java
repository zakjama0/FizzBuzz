import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    @Test

    public void canReturnFizz(){
        //Arrange
        String result = FizzBuzz.getFizzBuzz(3);

        assertThat(result).isEqualTo("Fizz");
        //Act
        //Assert
    }

    @Test
 public void canReturnBuzz(){
        //Arrange
     String result = FizzBuzz.getFizzBuzz(5);
     assertThat(result).isEqualTo("Buzz");
 }


    @Test
    public void canReturnFizzBuzz(){
        String result = FizzBuzz.getFizzBuzz(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void ifNeither(){
        String result =FizzBuzz.getFizzBuzz(2);
        assertThat(result).isEqualTo("2");
    }
}

