package com.example.component;

public class File extends Node {

    public File(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        System.out.println("不能添加子节点");
    }

    @Override
    protected void ls(int space) {
        super.ls(space);
    }
}
