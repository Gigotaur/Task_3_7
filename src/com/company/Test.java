package com.company;

public class Test {
    public boolean testProgram() {
        if (picture.getColor(-2, -2) != SimpleColor.GRAY) {
            System.out.println("Gray-Test is not completed");
            return false;
        } else if (picture.getColor(-6, 0) != SimpleColor.BLUE) {
            System.out.println("Blue-Test_1 is not completed");
            return false;
        } else if (picture.getColor(-3, 2) != SimpleColor.BLUE) {
            System.out.println("Blue-Test_2 is not completed");
            return false;
        } else if (picture.getColor(-6, 1) != SimpleColor.WHITE) {
            System.out.println("White-Test_1 is not completed");
            return false;
        } else if (picture.getColor(2, 3) != SimpleColor.WHITE) {
            System.out.println("White-Test_2 is not completed");
            return false;
        } else if (picture.getColor(-1, 2) != SimpleColor.GREEN) {
            System.out.println("Green-Test is not completed");
            return false;
        } else if (picture.getColor(1, -1) != SimpleColor.YELLOW) {
            System.out.println("yellow-Test is not completed");
            return false;
        } else {
            return true;
        }
    }

    private static final Picture picture = new Picture();
}
