package com.computerComponents;

import com.componentModels.*;

public class Processor extends ComputerElementTemplate {

    private final String componentName = "Процесор";

    public Processor(Models model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
