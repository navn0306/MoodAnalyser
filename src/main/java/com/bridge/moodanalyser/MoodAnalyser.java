package com.bridge.moodanalyser;


public class MoodAnalyser {

    public String analyseMood(String message) {
        if (message.toLowerCase().contains("sad"))
            return "sad";
        return "happy";
    }
}
