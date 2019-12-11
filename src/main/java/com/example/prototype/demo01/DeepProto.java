package com.example.prototype.demo01;

import java.io.*;

public class DeepProto implements Serializable,Cloneable {

    private String name;

    private DeepCloneTarget target;

    public String getName() {
        return name;
    }

    public DeepProto setName(String name) {
        this.name = name;
        return this;
    }

    public DeepCloneTarget getTarget() {
        return target;
    }

    public DeepProto setTarget(DeepCloneTarget target) {
        this.target = target;
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object deep =  super.clone();

        DeepProto deepProto = (DeepProto) deep;

        deepProto.target = (DeepCloneTarget) target.clone();


        return deepProto;
    }


    //序列化方式实现深拷贝
    public Object deepClone() {

        ByteArrayOutputStream bos = null;

        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;

        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前对象以流的方式输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProto deepProto = (DeepProto) ois.readObject();

            return deepProto;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return null;

    }


}
