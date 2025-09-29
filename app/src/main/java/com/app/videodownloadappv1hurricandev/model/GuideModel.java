/*
 * Copyright (c) 2021.  Hurricane Development Studios
 */

package com.app.videodownloadappv1hurricandev.model;

public class GuideModel {

    private String number;
    private String message;
    private int image;

    public GuideModel(String number, String message, int image) {
        this.number = number;
        this.message = message;
        this.image = image;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
