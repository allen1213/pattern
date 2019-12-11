package com.example.prototype.header;

import java.io.Serializable;

public class Line implements Cloneable, Serializable {

    private Long lineId;

    private Long headerId;

    private String name;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
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

    @Override
    public String toString() {
        return "Line{" +
                "lineId=" + lineId +
                ", headerId=" + headerId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line)super.clone();
    }
}
