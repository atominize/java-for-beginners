package com.atominize;

public class Break4 {
    Break4() {
        int i;
        for (i = 1; i < 4; i++) {
            one: {
            two: {
                three: {
                    System.out.println("\ni is " + i);
                    if (i == 1) break one;
                    if (i == 2) break two;
                    if (i == 3) break three;
                    // the following statement is never executed
                    System.out.println("won't print");
                }
                System.out.println("After block three.");
            }
                System.out.println("After block two.");
            }
            System.out.println("After block one.");
        }
        // the following statement executes on termination of the for loop
        System.out.println("After for.");
    }
}
