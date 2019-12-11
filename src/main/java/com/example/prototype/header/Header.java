package com.example.prototype.header;

import java.io.*;

public class Header implements Cloneable, Serializable {

    private Long headerId;

    private String name;

    private Line line;

    public Header(Line line) {
        this.line = line;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "Header{" +
                "headerId=" + headerId +
                ", name='" + name + '\'' +
                ", line=" + line +
                '}';
    }

    @Override
    protected Header clone() throws CloneNotSupportedException {

        Header header = (Header) super.clone();

        Line line = header.getLine().clone();

        header.setLine(line);


        return header;
    }


    public Header deepClone () {

        ByteArrayOutputStream bos  = null;

        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;

        ObjectInputStream ois = null;

        try {

            bos = new ByteArrayOutputStream();

            oos = new ObjectOutputStream(bos);

            oos.writeObject(this);



            bis = new ByteArrayInputStream(bos.toByteArray());

            ois = new ObjectInputStream(bis);

            return (Header) ois.readObject();


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
