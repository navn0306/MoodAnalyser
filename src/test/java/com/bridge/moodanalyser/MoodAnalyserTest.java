package com.bridge.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessageWhenItContainsSadItShouldReturnSadMood() {
        MoodAnalyser mood = new MoodAnalyser();
        String actualMood = mood.analyseMood("I am in sad mood");
        String expectedMood = "sad";
        Assert.assertEquals(actualMood, expectedMood);

    }

    @Test
    public void givenMessageWhenItContainsInAnyMoodItShouldReturnHappyMood() {
        MoodAnalyser mood = new MoodAnalyser();
        String actualMood = mood.analyseMood("I am in any mood");
        String expectedMood = "happy";
        Assert.assertEquals(actualMood, expectedMood);

    }

    @Test
    public void givenMessageWhenNullItShouldReturnNull() {
        MoodAnalyser mood = new MoodAnalyser();
        String actualMood = mood.analyseMood(null);
        Assert.assertNull(actualMood);

    }
}

}
