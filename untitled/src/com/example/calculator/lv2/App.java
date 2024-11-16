package com.example.calculator.lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddOperation()); // +
        calculator.setOperation(new DivideOperation()); // /
        calculator.setOperation(new MultiplyOperation()); // *
        calculator.setOperation(new SubstractOperation()); //  -

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = sc.next();

            String two = sc.nextLine();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();

            int result = 0;
            switch (operator){
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
                default:    //오류출력
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? 아무거나 입력해주세요.(exit 입력 시 종료)");

            if (sc.next().equals("exit") == true) {
                System.out.println("계산기가 종료됩니다.");
                break;
            }
        }
    }


}
