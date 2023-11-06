package com.computerComponents;

import com.componentModels.*;

public class Monitor extends ComputerElementTemplate {

    private final String componentName = "Монітор";

    public Monitor(Models model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
