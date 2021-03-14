package com.example.command;

public class Controller {

    private Command okCommand;

    private Command verticalCommand;

    private Command horizontalCommand;

    public void bindOKCommand(Command okCommand) {
        this.okCommand = okCommand;
    }

    public void bindVerticalCommand(Command verticalCommand) {
        this.verticalCommand = verticalCommand;
    }

    public void bindHorizontalCommand(Command horizontalCommand) {
        this.horizontalCommand = horizontalCommand;
    }

    public void buttonOKHold() {
        System.out.print("长按OK按键……");
        okCommand.exe();
    }

    public void buttonOKClick() {
        System.out.print("单击OK按键……");
        okCommand.unexe();
    }

    public void buttonUpClick() {
        System.out.print("单击↑按键……");
        verticalCommand.exe();
    }

    public void buttonDownClick() {
        System.out.print("单击↓按键……");
        verticalCommand.unexe();
    }

    public void buttonLeftClick() {
        System.out.print("单击←按键……");
        horizontalCommand.unexe();
    }

    public void buttonRightClick() {
        System.out.print("单击→按键……");
        horizontalCommand.exe();
    }

}
