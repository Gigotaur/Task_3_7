package com.company;

public class Test {
    public boolean testProgram() {
        if (picture.getColor(-2, -2) != SimpleColor.GRAY) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (picture.getColor(-6, 0) != SimpleColor.BLUE) {
            System.out.println("Test 2 is not completed");
            return false;
        } else if (picture.getColor(-3, 2) != SimpleColor.BLUE) {
            System.out.println("Test 3 is not completed");
            return false;
        } else if (picture.getColor(-6, 1) != SimpleColor.WHITE) {
            System.out.println("Test 4 is not completed");
            return false;
        } else if (picture.getColor(2, 3) != SimpleColor.WHITE) {
            System.out.println("Test 5 is not completed");
            return false;
        } else if (picture.getColor(-1, 2) != SimpleColor.GREEN) {
            System.out.println("Test 6 is not completed");
            return false;
        } else if (picture.getColor(1, -1) != SimpleColor.YELLOW) {
            System.out.println("Test 7 is not completed");
            return false;
        } else {
            return true;
        }
    }

    private static final Picture picture = new Picture();
}
