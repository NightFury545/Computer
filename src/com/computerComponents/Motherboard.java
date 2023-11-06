package com.computerComponents;

import com.componentModels.*;

public class Motherboard extends ComputerElementTemplate {

    private final String componentName = "Материнська плата";
    private final Processor processor;
    private final RAM ram;

    private Motherboard(Models model, MotherboardBuilder motherboardBuilder) {
        super(model);
        this.processor = motherboardBuilder.processor;
        this.ram = motherboardBuilder.ram;
    }

    @Override
    public String toString() {
        return componentName;
    }

    public static class MotherboardBuilder {

        private Processor processor;
        private RAM ram;

        public MotherboardBuilder setProcessor(Processor processor) {
            this.processor = processor;
            return this;
        }

        public MotherboardBuilder setRAM(RAM ram) {
            this.ram = ram;
            return this;
        }

        public Motherboard build(Models model) {
            if (processor != null && ram != null) {
                return new Motherboard(model, this);
            } else {
                System.out.println("Не вистачає деякого компонента...");
                return null;
            }
        }
    }


}
