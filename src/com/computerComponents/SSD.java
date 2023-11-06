package com.computerComponents;

import com.componentModels.*;

public class SSD extends ComputerElementTemplate {

    private final String componentName = "SSD";

    public SSD(Models model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
