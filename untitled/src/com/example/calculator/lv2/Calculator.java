package com.example.calculator.lv2;

import java.util.List;

public class Calculator {

    private AbstractOperation operation;

    public Calculator(char operation) {
        this.operation = setOperation(operation);
    }

    AbstractOperation setOperation(char operator) {
        switch (operator){
            case '+':
                return new AddOperation();
            case '-':
                return new SubstractOperation();
            case '*':
                return new MultiplyOperation();
            case '/':
                return new DivideOperation();
            default:
                throw new RuntimeException();   // exception으로 빠져나가기
        }
    }

    public AbstractOperation getOperation() {
        return operation;
    }


    public double calculate (int firstNumber, int secondNumber) {
        double results = 0;

        results = operation.operate(firstNumber,secondNumber);

        return results;
    }

}
