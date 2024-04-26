package com.example.bmi_calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void calculateBMI(){
        float weight = 70;
        float height = 182;
        double expectedBMI = 21.13;

        // z funkcji calcBMI()
        double bmi = weight / Math.pow((height/100), 2);

        assertEquals(expectedBMI, bmi, 0.1);
    }

}