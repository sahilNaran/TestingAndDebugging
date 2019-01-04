package za.co.knuckles.testinganddebugging;

import android.graphics.drawable.ColorDrawable;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config()
public class MainActivityTest {

    MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void buttonProcessesFizzBuzzSuccessfulCase() throws Exception {
        //Arrange
        int expectedColor = activity.getResources().getColor(R.color.colorSuccess);
        int numberToCalculateTill = 3;
        String expectedFizzBuzz = "12Fizz";

        //Act
        activity.mEditTextNumberToCalculate.setText(String.valueOf(numberToCalculateTill)); //cant use int, as it will reference a resource
        activity.mButtonCalculate.callOnClick();

        //Assert
        Assert.assertEquals(expectedFizzBuzz, activity.mTextViewAnswer.getText());
        Assert.assertEquals(expectedColor, ((ColorDrawable) activity.mParentLayout.getBackground()).getColor());

    }

    @Test
    public void buttonProcessesFizzBuzzErroneousCase() throws Exception {
        //Arrange
        int expectedColor = activity.getResources().getColor(R.color.colorError);
        int numberToCalculateTill = 0;
        String expectedFizzBuzz = "";

        //Act
        activity.mEditTextNumberToCalculate.setText(String.valueOf(numberToCalculateTill)); //cant use int, as it will reference a resource
        activity.mButtonCalculate.callOnClick();

        //Assert
        Assert.assertEquals(expectedFizzBuzz, activity.mTextViewAnswer.getText());
        Assert.assertEquals(expectedColor, ((ColorDrawable) activity.mParentLayout.getBackground()).getColor());

    }

}