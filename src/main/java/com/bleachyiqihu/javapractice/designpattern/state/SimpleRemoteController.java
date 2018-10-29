package com.ctrip.ops.app.designpattern.state;

/**
 * Created by Paul on 2017-09-16
 */
public class SimpleRemoteController {

    private Command slot;


    void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
