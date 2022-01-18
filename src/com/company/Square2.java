package com.company;

public class Square2 {
    public double x0;
    public double y0;
    public double x1;
    public double y1;

    public Square2(double x0, double y0, double x1, double y1){
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    public boolean isPointInsideSquare2(double x, double y){
        return (y>=y0 && y<y1) && (x>=x0 && x<x1);
    }
}