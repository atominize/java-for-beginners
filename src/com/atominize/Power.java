package com.atominize;

public class Power {
    Power() {
        int e;
        int result;
        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 to the power of " + i + " is " + result);
        }
    }
}
