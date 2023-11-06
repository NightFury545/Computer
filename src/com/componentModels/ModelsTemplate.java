package com.componentModels;

abstract class ModelsTemplate {

    protected final String model;
    protected final int price;
    protected final String producer;


    protected ModelsTemplate(String model, int price, String producer) {
        this.model = model;
        this.price = price;
        this.producer = producer;
    }

    @Override
    public String toString()
    {
        return "Модель: " + model + "\n" + "Ціна: " + price + "\n" + "Виробник: " + producer;
    }
}
