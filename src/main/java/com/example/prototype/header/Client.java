package com.example.prototype.header;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Header header = new Header(new Line());

        Header header1 = header.deepClone();

        System.out.println(header == header1);

        System.out.println(header.getLine() == header1.getLine());


    }

    private static void test01() throws CloneNotSupportedException {
        Header header = new Header(new Line());

        Header clone = header.clone();

        System.out.println(header == clone);

        System.out.println("hashCode : " + header.hashCode());
        System.out.println("hashCode : " + clone.hashCode());

        System.out.println(header.getLine() == clone.getLine());

        System.out.println("line hashCode : " + header.getLine().hashCode());
        System.out.println("line hashCode : " + clone.getLine().hashCode());
    }
}
