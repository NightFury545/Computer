package com.computerComponents;

import com.componentModels.*;

public class Mouse extends ComputerElementTemplate {

    private final String componentName = "Мишка";

    public Mouse(Models model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
