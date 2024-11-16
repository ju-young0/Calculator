package com.example.calculator.lv2;

public class SubstractOperation extends AbstractOperation{
    //빼기
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
