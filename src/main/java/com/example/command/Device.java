package com.example.command;

public interface Device extends Switchable {

    // 频道+
    void channelUp();
    // 频道-
    void channelDown();
     // 音量+
     void volumeUp();
     // 音量-
      void volumeDown();

}
