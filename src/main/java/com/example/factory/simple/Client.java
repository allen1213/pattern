package com.example.factory.simple;

public class Client {

    public static void main(String[] args) {
        OperationFactory factory = new OperationFactory();
        Operation operation = factory.createOperation("-");
        System.out.println(operation.getResult(10L,10L));


    }

    private static void test01() {
        OperationFactory factory = new OperationFactory();

        Operation add = factory.createOperation("+");
        Operation sub = factory.createOperation("-");
        Operation mul = factory.createOperation("*");
        Operation div = factory.createOperation("/");

        System.out.println(add.getResult(10L,10L));
        System.out.println(sub.getResult(10L,10L));
        System.out.println(mul.getResult(10L,10L));
        System.out.println(div.getResult(10L,10L));
    }
}
