package com.computerComponents;

import com.componentModels.*;

abstract class ComputerElementTemplate {

    protected final Models model;

    protected ComputerElementTemplate(Models model) {
        this.model = model;
    }

    public Models getModel() {
        return model;
    }
}
