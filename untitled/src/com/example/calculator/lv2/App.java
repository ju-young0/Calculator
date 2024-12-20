package com.example.calculator.lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            String two = sc.nextLine();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();

            Calculator calculator = new Calculator(operator);  // 캐릭터(사칙연산자)
            System.out.println("결과: " + calculator.getOperation().operate(firstNumber,secondNumber));
            System.out.println("더 계산하시겠습니까? 아무거나 입력해주세요.(exit 입력 시 종료)");

            if (sc.next().equals("exit") == true) {
                System.out.println("계산기가 종료됩니다.");
                break;
            }
        }
    }


}
