package com.example.visitor;

import java.time.LocalDate;

public class Wine extends Product implements Acceptable{// 酒类

    public Wine(String name, LocalDate producedDate, float price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
