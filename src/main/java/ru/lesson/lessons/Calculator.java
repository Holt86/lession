package ru.lesson.lessons;


public class Calculator {
    private int result;
    private boolean isClear = true;

       /*Calculated the sum of param*/
    public void sum(int...param){
        result = param[0] + param[1];
    }

    public void subtraction(int... param){
        result = param[0] - param[1];
    }

    public void multiplication(int...param){
        result = param[0] * param[1];
    }

    public void divide(int... param){
        result = param[0] / param[1];
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public boolean isClear() {
        return isClear;
    }

    public void setClear(boolean clear) {
        isClear = clear;
    }

    public void clearResult(){
        result = 0;
        setClear(true);
    }
}