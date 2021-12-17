package com.biz.service;


import com.biz.exception.MoodAnalyasisException;

public class MoodAnalyser {

   private String message;

    public MoodAnalyser() {

    }
    public MoodAnalyser(String message) {

        this.message = message;
    }

    public String analyseMood() throws MoodAnalyasisException {
        try {
            if(this.message.length()==0){
                throw new MoodAnalyasisException("EmptyMood", MoodAnalyasisException.ExceptionType.EMPTY);
            }
            if (this.message.toLowerCase().contains("sad"))
                return "sad";
            return "happy";
        }
        catch (NullPointerException e){
            throw new MoodAnalyasisException("null", MoodAnalyasisException.ExceptionType.NULL);

        }



    }
}
