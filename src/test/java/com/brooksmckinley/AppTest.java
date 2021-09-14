/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testUnderweight() {
        String expected = "Your BMI is 7.03.\n" +
                "You are underweight. You should see your doctor.";
        String actual = App.bmiReport(100, 100);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOverweight() {
        String expected = "Your BMI is 84.36.\n" +
                "You are overweight. You should see your doctor.";
        String actual = App.bmiReport(300, 50);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIdeal() {
        String expected = "Your BMI is 19.527777777777775.\n" +
                "You are within the ideal weight range.";
        String actual = App.bmiReport(100, 60);
        Assertions.assertEquals(expected, actual);
    }
}