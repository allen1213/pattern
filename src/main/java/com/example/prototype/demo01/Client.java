package com.example.prototype.demo01;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        DeepProto deepProto = new DeepProto();
        deepProto.setName("HeBo")
                .setTarget(new DeepCloneTarget("Love","You"));

        DeepProto p1 = (DeepProto)deepProto.deepClone();

        System.out.println("d1 : " + deepProto.getName() + "  hashCode : " + deepProto.hashCode());
        System.out.println("p1 : " + p1.getName() + "  hashCode : " + p1.hashCode());



    }

    private static void test01() throws CloneNotSupportedException {
        DeepProto deepProto = new DeepProto();
        deepProto.setName("HeBo")
                .setTarget(new DeepCloneTarget("Love","You"));

        DeepProto p1 = (DeepProto)deepProto.clone();

        System.out.println("d1 : " + deepProto.getName() + "  hashCode : " + deepProto.hashCode());
        System.out.println("p1 : " + p1.getName() + "  hashCode : " + p1.hashCode());
    }
}
