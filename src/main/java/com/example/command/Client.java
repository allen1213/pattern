package com.example.command;

public class Client {

    public static void main(String[] args) {


        Device tv = new TV();
        Device radio = new Radio();
        Controller controller = new Controller();

        controller.bindOKCommand(new SwitchCommand(tv));
        controller.bindVerticalCommand(new VolumeCommand(tv));
        //controller.bindHorizontalCommand(new Horizo);

        controller.buttonOKHold();
        controller.buttonUpClick();
        controller.buttonUpClick();
        controller.buttonDownClick();
        controller.buttonRightClick();

    }
}
