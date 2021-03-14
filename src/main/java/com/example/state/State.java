package com.example.state;

public interface State {
    void switchOn(Switcher switcher);//开
    void switchOff(Switcher switcher);//关
}
