package com.darkace.javabrains;

/**
 * Created by rumman on 11/5/16.
 */
public class Triangle {

    private int height;
    private String type;

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw() {
        System.out.println("Triangle Drawn of type: " + type + " of height: " + height);
    }

}
