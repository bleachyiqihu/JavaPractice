package com.ctrip.ops.app.designpattern.state;

/**
 * Created by Paul on 2017-09-16
 */
public class SimpleRemoteControllerTest {
    public static void main(String[] args) {
        SimpleRemoteController simpleRemoteController = new SimpleRemoteController();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        simpleRemoteController.setCommand(lightOnCommand);
        simpleRemoteController.buttonWasPressed();
    }
}
