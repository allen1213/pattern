package com.example.component;

public abstract class Node {

    protected String name;

    public Node(String name) {
        this.name = name;
    }

    protected abstract void add(Node child);

    protected void ls(int space) {
        for (int i = 0; i < space; i++) {
            System.out.println(" ");
        }
        System.out.println(name);
    }

    //无参重载方法，默认从第0列开始显示
    protected void ls() {
        this.ls(0);
    }
}
