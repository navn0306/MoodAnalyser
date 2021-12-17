package com.biz.exception;

public class MoodAnalyasisException extends Exception{

   public ExceptionType exceptionType;
    public String message;
   public enum ExceptionType {
        EMPTY,NULL
    }
    public  MoodAnalyasisException(String message, ExceptionType exceptionType){
        this.message=message;
        this.exceptionType=exceptionType;
    }
    public MoodAnalyasisException(String message) {
        this.message=message;
    }
}
