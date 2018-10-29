package com.ctrip.ops.app.designpattern.state;

/**
 * Created by Paul on 2017-09-16
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}
