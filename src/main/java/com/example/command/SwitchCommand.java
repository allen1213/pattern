package com.example.command;

public class SwitchCommand implements Command {

    private Device device;

    public SwitchCommand(Device device) {
        this.device = device;
    }

    @Override
    public void exe() {
        device.on();
    }

    @Override
    public void unexe() {
        device.off();
    }
}
