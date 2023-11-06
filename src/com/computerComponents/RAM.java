package com.computerComponents;

import com.componentModels.*;

public class RAM extends ComputerElementTemplate {

    private final String componentName = "RAM";

    public RAM(Models model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
