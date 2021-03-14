package com.example.visitor;

public interface Acceptable {
    // 主动接受拜访者
    void accept(Visitor visitor);

}
