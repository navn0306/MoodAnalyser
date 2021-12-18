package com.bridge.moodanalyser;

import com.biz.exception.MoodAnalyasisException;
import com.biz.service.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessageWhenItContainsSadItShouldReturnSadMood() throws MoodAnalyasisException {
        MoodAnalyser mood = new MoodAnalyser("I am in sad mood");
        String actualMood = mood.analyseMood();
        String expectedMood = "sad";
        Assert.assertEquals(actualMood, expectedMood);

    }

    @Test
    public void givenMessageWhenItContainsInAnyMoodItShouldReturnHappyMood() throws MoodAnalyasisException {
        MoodAnalyser mood = new MoodAnalyser("I am in any mood");
        String actualMood = mood.analyseMood();
        String expectedMood = "happy";
        Assert.assertEquals(actualMood, expectedMood);

    }

    @Test
    public void givenMessageWhenItContainsInHappyMoodItShouldReturnHappyMood() throws MoodAnalyasisException {
        MoodAnalyser mood = new MoodAnalyser("I am in happy mood");
        String actualMood = mood.analyseMood();
        String expectedMood = "happy";
        Assert.assertEquals(actualMood, expectedMood);

    }

    @Test
    public void givenMessageWhenNullItShouldReturnHappy() throws MoodAnalyasisException {
        MoodAnalyser mood = new MoodAnalyser(null);
        String actualMood;
        try {
            actualMood = mood.analyseMood();
       }
        catch (MoodAnalyasisException e){
            MoodAnalyasisException.ExceptionType expectedMood=MoodAnalyasisException.ExceptionType.NULL;
            System.out.println(e);
            Assert.assertEquals(expectedMood,e.exceptionType);

        }

    }

    @Test
    public void givenMessageWhenEmptyItShouldReturnHappy()  {
        MoodAnalyser mood = new MoodAnalyser("");
        String actualMood;
        try {
            actualMood = mood.analyseMood();
        } catch (MoodAnalyasisException e) {
            MoodAnalyasisException.ExceptionType expectedMood=MoodAnalyasisException.ExceptionType.EMPTY;
            System.out.println(e);
            Assert.assertEquals(expectedMood,e.exceptionType);
        }

    }
}

