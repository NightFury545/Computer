package com.computerComponents;

import com.componentModels.*;

public class Keyboard extends ComputerElementTemplate {

    private final String componentName = "Клавіатура";

    public Keyboard(Models model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
