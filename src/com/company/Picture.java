package com.company;

public class Picture {
    public final Parabola PARABOLA = new Parabola(-3, 3, -1);
    public final Square SQUARE1 = new Square(-5, 2, 1, 7);
    public final Square SQUARE2 = new Square(1, 2, 8, 9);
    public final Circle CIRCLE = new Circle(-5, 2, 3);

    public SimpleColor getColor(double x, double y){
        if ((PARABOLA.isPointInsideOfParabola(x, y) && CIRCLE.isPointInsideCircle(x, y)) || (CIRCLE.isPointInsideCircle(x, y) && SQUARE1.isPointInsideSquare1(x, y))){
            return SimpleColor.BLUE;
        }

        if ((PARABOLA.isPointInsideOfParabola(x, y) && !CIRCLE.isPointInsideCircle(x, y))) {
            return SimpleColor.GRAY;
        }

        if ((!PARABOLA.isPointInsideOfParabola(x, y) && !SQUARE1.isPointInsideSquare1(x, y) && CIRCLE.isPointInsideCircle(x, y)) || (SQUARE2.isPointInsideSquare2(x, y))) {
            return SimpleColor.WHITE;
        }

        if ((SQUARE1.isPointInsideSquare1(x,y) && !CIRCLE.isPointInsideCircle(x,y))) {
            return SimpleColor.GREEN;
        }

        else{
            return SimpleColor.YELLOW;
        }
    }
}
