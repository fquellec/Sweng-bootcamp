package ch.epfl.sweng.bootcamp;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public final ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);
    @Test
    public void testCanGreetUsers() {
        Espresso.onView(ViewMatchers.withId(R.id.mainName)).perform(ViewActions.typeText("from my unit test")).perform(ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.mainButton)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.greetingMessage)).check(ViewAssertions.matches(ViewMatchers.withText("Hello from my unit test!")));
    }
}