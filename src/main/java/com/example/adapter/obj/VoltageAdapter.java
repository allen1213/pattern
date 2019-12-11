package com.example.adapter.obj;

public class VoltageAdapter  implements Voltage5V {

    private Voltage220 voltage220;

    public VoltageAdapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5V() {
        System.out.println("5V");
        return voltage220.output220()/44;
    }
}
