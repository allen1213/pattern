package com.example.factory.simple;

public class OperationFactory {

    public Operation createOperation(String s) {

        Operation operation = null;

        switch (s) {
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Sub();
                break;
            case "*":
                operation = new Mul();
                break;
            case "/":
                operation = new Div();
                break;
        }

        return operation;

    }

}
