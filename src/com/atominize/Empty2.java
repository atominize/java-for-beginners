package com.atominize;

public class Empty2 {
    Empty2() {
        int i;
        i = 0; // move initialization out of loop
        for ( ; i < 10; ) {
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }
    }
}
