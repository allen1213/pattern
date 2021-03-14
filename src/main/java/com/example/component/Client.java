package com.example.component;

public class Client {

    public static void main(String[] args) {
        Node drive = new Folder("D://");

        Node doc = new Folder("doc");
        doc.add(new File("simple.doc"));
        doc.add(new File("proj-info.ppt"));

        drive.add(doc);

        Node lover = new Folder("lover");

        Node boer = new Folder("boer");
        boer.add(new File("boer.jpg"));
        boer.add(new File("boer.png"));

        Node xin = new Folder("xin");
        xin.add(new File("xin.jpg"));
        xin.add(new File("xin.png"));

        lover.add(boer);
        lover.add(xin);

        drive.add(lover);
        drive.ls();


    }
}
