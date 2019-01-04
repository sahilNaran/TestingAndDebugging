package za.co.knuckles.testinganddebugging;

public class FizzBuzzCalc {

    public String calculateFizzBuzz(int numberToCountTill){
        if(numberToCountTill <= 0){
            return "";
        }
        StringBuilder fizzBuzz = new StringBuilder();
        for(int i = 1; i <= numberToCountTill; i++){
            if(i % 15 == 0){
                fizzBuzz.append("FizzBuzz");
            }
            else if(i % 3 == 0){
                fizzBuzz.append("Fizz");
            }
            else if(i % 5 == 0){
                fizzBuzz.append("Buzz");
            }
            else{
                fizzBuzz.append(i);
            }

        }
        return fizzBuzz.toString();
    }

}
