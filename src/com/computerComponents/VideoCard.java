package com.computerComponents;

import com.componentModels.*;

public class VideoCard extends ComputerElementTemplate {

    private final String componentName = "Відеокарта";

    public VideoCard(Models model) {
        super(model);
    }

    @Override
    public String toString() {
        return componentName;
    }
}
