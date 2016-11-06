package com.darkace.javabrains;

import java.util.List;

/**
 * Created by rumman on 11/5/16.
 */
public class Triangle {

    List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        for (Point point: points) {
            System.out.println(point);
        }
    }
}
