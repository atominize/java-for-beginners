package com.atominize;

public class SqrRoot {
    public SqrRoot() {
        double num, sRoot, rErr;
        for (num = 1.0; num < 100.0; num++) {
            sRoot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + sRoot);
            // compute rounding error
            rErr = num - (sRoot * sRoot);
            System.out.println("Rounding error is " + rErr);
            System.out.println();
        }
    }
}
