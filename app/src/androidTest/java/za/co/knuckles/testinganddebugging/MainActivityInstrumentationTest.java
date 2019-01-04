package za.co.knuckles.testinganddebugging;

import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.matcher.BoundedMatcher;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.content.ContextCompat;
import android.view.View;

import org.hamcrest.Description;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getTargetContext;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void buttonProcessesFizzBuzzSuccessfulCase() throws Exception {
        // Arrange
        final int expectedColor = R.color.colorSuccess;

        onView(withId(R.id.inputNumberToCalc)).perform(typeText("3"));

        // Act
        onView(withId(R.id.buttonCalculate)).perform(click());

        // Assert

        BoundedMatcher<View, ConstraintLayout> withColorMatcher = new BoundedMatcher<View, ConstraintLayout>(ConstraintLayout.class) {
            @Override
            protected boolean matchesSafely(ConstraintLayout item) {
                return ContextCompat.getColor(getTargetContext(), expectedColor) == ((ColorDrawable) item.getBackground()).getColor();
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("The colour was expected to be:" + expectedColor);
            }
        };

        onView(withId(R.id.textViewAnswer)).check(matches(withText("12Fizz")));
        onView(withId(R.id.parentLayout)).check(matches(withColorMatcher));

    }

    @Test
    public void buttonProcessesFizzBuzzUsuccessfulCase() throws Exception {
        // Arrange
        final int expectedColor = R.color.colorError;

        onView(withId(R.id.inputNumberToCalc)).perform(typeText("0"));

        // Act
        onView(withId(R.id.buttonCalculate)).perform(click());

        // Assert

        BoundedMatcher<View, ConstraintLayout> withColorMatcher = new BoundedMatcher<View, ConstraintLayout>(ConstraintLayout.class) {
            @Override
            protected boolean matchesSafely(ConstraintLayout item) {
                return ContextCompat.getColor(getTargetContext(), expectedColor) == ((ColorDrawable) item.getBackground()).getColor();
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("The colour was expected to be:" + expectedColor);
            }
        };

        onView(withId(R.id.textViewAnswer)).check(matches(withText("")));
        onView(withId(R.id.parentLayout)).check(matches(withColorMatcher));

    }


}
