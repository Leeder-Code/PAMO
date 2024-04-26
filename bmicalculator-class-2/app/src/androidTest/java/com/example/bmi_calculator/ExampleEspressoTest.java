package com.example.bmi_calculator;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ExampleEspressoTest {
    @Rule
    public ActivityScenarioRule<BMI_Calculator> activityRule =
            new ActivityScenarioRule<>(BMI_Calculator.class);

    @Test
    public void testCalculateBMI() {
        // Enter weight
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber))
                .perform(ViewActions.typeText("182"), ViewActions.closeSoftKeyboard());

        // Enter height
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber2))
                .perform(ViewActions.typeText("70"), ViewActions.closeSoftKeyboard());

        //Calculate
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());

        // Check result
        Espresso.onView(ViewMatchers.withId(R.id.textView2))
                .check(ViewAssertions.matches(ViewMatchers.withText("BMI: 21.13")));
    }
}
