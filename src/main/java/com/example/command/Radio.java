package com.example.command;

public class Radio implements Device {
    @Override
    public void channelUp() {
        System.out.println("Radio channelUp");
    }

    @Override
    public void channelDown() {
        System.out.println("Radio channelDown");
    }

    @Override
    public void volumeUp() {
        System.out.println("Radio volumeUp");
    }

    @Override
    public void volumeDown() {
        System.out.println("Radio volumeDown");
    }

    @Override
    public void on() {
        System.out.println("Radio on");
    }

    @Override
    public void off() {
        System.out.println("Radio off");
    }
}
