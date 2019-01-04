package za.co.knuckles.testinganddebugging;

public class MainActivityPresenter {

    private MainActivityView view;
    private final FizzBuzzCalc fizzBuzzCalc;

    public MainActivityPresenter(MainActivityView view){
        this.view = view;
        this.fizzBuzzCalc = new FizzBuzzCalc();
    }

    public void calculateFizzBuzz(int numberToCalculateTo){
        String answer = fizzBuzzCalc.calculateFizzBuzz(numberToCalculateTo);
        if(answer.equals("")){
            view.setErroneousFizzbuzz();
            return;
        }
        view.setSuccessfulFizzbuzz(answer);
    }
}
