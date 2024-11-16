package com.example.calculator.lv2;

import java.util.List;

public class Calculator {

    private AbstractOperation operation;

//    private List<Double> numbers;   //  입력된 숫자를 저장하는 컬렉션
//    private List<Double> results;   //  연산 결과를 저장하는 컬렉션

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }
    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate (int firstNumber, int secondNumber) {
        double results = 0;

        results = operation.operate(firstNumber,secondNumber);

        return results;
    }

}
