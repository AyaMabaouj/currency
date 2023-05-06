package com.example.currencyconverter;

public class Model {

    private String dataTitle;

    private int dataImage;

    public String getDataTitle() {
        return dataTitle;
    }



    public int getDataImage() {
        return dataImage;
    }

    public Model(String dataTitle, int dataImage) {
        this.dataTitle = dataTitle;

        this.dataImage = dataImage;
    }
}
