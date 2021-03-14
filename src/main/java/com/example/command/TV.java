package com.example.command;

public class TV implements Device {
    @Override
    public void channelUp() {
        System.out.println("TV channelUp");
    }

    @Override
    public void channelDown() {
        System.out.println("TV channelUp");
    }

    @Override
    public void volumeUp() {
        System.out.println("TV volumeUp");
    }

    @Override
    public void volumeDown() {
        System.out.println("TV volumeDown");
    }

    @Override
    public void on() {
        System.out.println("TV on");
    }

    @Override
    public void off() {
        System.out.println("TV off");
    }
}
