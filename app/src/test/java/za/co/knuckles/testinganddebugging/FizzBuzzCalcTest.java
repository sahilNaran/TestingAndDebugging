package za.co.knuckles.testinganddebugging;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FizzBuzzCalcTest {

    FizzBuzzCalc fizzBuzzCalc;

    @Before
    public void setup() throws Exception {
        fizzBuzzCalc = new FizzBuzzCalc();
    }

    @Test
    public void GivenFizzBuzzCalc_WhenCalculatingFizz_ThenReturnsCorrectly() {
        //Arrange
        String givenOutput = "12Fizz";
        int numberToCalculateTIll = 3;

        //Act
        String actualOutput = fizzBuzzCalc.calculateFizzBuzz(numberToCalculateTIll);

        //Assert
        Assert.assertEquals(givenOutput, actualOutput);
    }

    @Test
    public void GivenFizzBuzzCalc_WhenCalculatingBuzz_ThenReturnsCorrectly(){
        //Arrange
        String givenOutput = "12Fizz4Buzz";
        int numberToCalculateTIll = 5;

        //Act
        String actualOutput = fizzBuzzCalc.calculateFizzBuzz(numberToCalculateTIll);

        //Assert
        Assert.assertEquals(givenOutput, actualOutput);
    }

    @Test
    public void GivenFizzBuzzCalc_WhenCalculatingFizzBuzz_ThenReturnsCorrectly(){
        //Arrange
        String givenOutput = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz";
        int numberToCalculateTIll = 15;

        //Act
        String actualOutput = fizzBuzzCalc.calculateFizzBuzz(numberToCalculateTIll);

        //Assert
        Assert.assertEquals(givenOutput, actualOutput);
    }

    @Test
    public void GivenFizzBuzzCalc_WhenCalculatingUsingZero_ThenReturnsCorrectly(){
        //Arrange
        String givenOutput = "";
        int numberToCalculateTIll = 0;

        //Act
        String actualOutput = fizzBuzzCalc.calculateFizzBuzz(numberToCalculateTIll);

        //Assert
        Assert.assertEquals(givenOutput, actualOutput);
    }

    @Test
    public void GivenFizzBuzzCalc_WhenCalculatingUsingNegativeNumber_ThenReturnsCorrectly(){
        //Arrange
        String givenOutput = "";
        int numberToCalculateTIll = -1;

        //Act
        String actualOutput = fizzBuzzCalc.calculateFizzBuzz(numberToCalculateTIll);

        //Assert
        Assert.assertEquals(givenOutput, actualOutput);
    }

}