package za.co.knuckles.testinganddebugging;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MainActivityPresenterTest {

    MainActivityPresenter presenter;

    @Mock
    MainActivityView view;

    @Before
    public void setUp() throws Exception {
        presenter = new MainActivityPresenter(view);
    }

    @Test
    public void calculateSuccessfulFizzBuzz() {
        //Arrange
        int numberToCountTill = 0;

        //Act
        presenter.calculateFizzBuzz(numberToCountTill);

        //Assert
        Mockito.verify(view).setErroneousFizzbuzz();
    }

    @Test
    public void calculateErroneousFizzBuzz() {
        //Arrange
        int numberToCountTill = 3;
        String answer = "12Fizz";

        //Act
        presenter.calculateFizzBuzz(numberToCountTill);

        //Assert
        Mockito.verify(view).setSuccessfulFizzbuzz(answer);

    }
}