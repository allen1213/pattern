package com.example.visitor;

public interface Visitor {// 访问者接口

    void visit(Candy candy);// 糖果重载方法

    void visit(Wine wine);// 酒类重载方法

    void visit(Fruit fruit);// 水果重载方法

}
