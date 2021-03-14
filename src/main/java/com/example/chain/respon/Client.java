package com.example.chain.respon;

public class Client {

    public static void main(String[] args) {
        Approver jay = new Staff("jay");
        jay.setNextApprover(
                new Manager("joe")
        )
                .setNextApprover(
                new CEO("tay")
        );
        jay.approve(90000);

    }
}
