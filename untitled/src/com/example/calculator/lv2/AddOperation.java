package com.example.calculator.lv2;

public class AddOperation extends AbstractOperation{
    //더하기
    @Override
    public double operate(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
