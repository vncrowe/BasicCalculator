package io.veronicacrowe;

import java.util.Scanner;

/**
 * Created by veronicacrowe on 5/17/16.
 */

public class Calculator {


    public static int displayAnswer;
    boolean calculatorOn = true;
    calculatorOptions calculatorOptions;
    Calculator calculator;


    public static int add(int value1, int value2) {
        return value1 + value2; //sum values

    }

    public static int subtract(int value1, int value2) {
        return value1 - value2; //subtract values

    }

    public static int multiply(int value1, int value2) {
        return value1 * value2; //multiply values

    }

    public static int divide(int value1, int value2) {
        return value1 / value2; //divide values

    }

    public calculatorOptions askUserCalculationSelection() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the calculation you'd like to perform from the options below:\nADD\nSUBTRACT\nMULTIPLY\nDIVIDE");
        calculatorOptions selection = calculatorOptions.valueOf(sc.next().toUpperCase());
        return selection;
            }

    public int askForFirstNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstValue = sc.nextInt();
        return firstValue;
    }

    public int askForSecondNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter second number:");
        int secondValue = sc.nextInt();
        return secondValue;
    }

    public void pickAnOption(calculatorOptions calculatorOption){
        switch(calculatorOption){
            case ADD:
                System.out.println(calculator.add(askForFirstNumber(),askForSecondNumber()));
                break;
            case SUBTRACT:
                System.out.println(calculator.subtract(askForFirstNumber(),askForSecondNumber()));
                break;
            case MULTIPLY:
                System.out.println(calculator.multiply(askForFirstNumber(),askForSecondNumber()));
                break;
            case DIVIDE:
                System.out.println(calculator.divide(askForFirstNumber(),askForSecondNumber()));
                break;
            default:
                System.out.println("Please make a valid selection (ADD, SUBTRACT, MULTIPLY, DIVIDE");
        }
    }
    public void runCalculator(){
        calculator = new Calculator();
        while(calculatorOn){
            pickAnOption(askUserCalculationSelection());

            calculatorOn = false;
        }
    }
    }
