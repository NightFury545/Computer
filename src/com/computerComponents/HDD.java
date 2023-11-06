package com.computerComponents;

import com.componentModels.*;

public class HDD extends ComputerElementTemplate {

    private final String componentName = "HDD";

    public HDD(Models model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
