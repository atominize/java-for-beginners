package com.atominize;

public class BreakDemo {
    BreakDemo() {
        int num;
        num = 100;
        for (int i = 0; i < num; i++) {
            if (i*i >= num) break; // terminate loof if i*i >= 100
            System.out.print(i + " ");
        }
        System.out.println("Loop complete.");
    }
}
