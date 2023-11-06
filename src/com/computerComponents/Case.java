package com.computerComponents;

import com.componentModels.*;

public class Case extends ComputerElementTemplate {

    private final String componentName = "Корпус";

    public Case(Models model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
