package com.atominize;

import java.io.IOException;

public class Break2 {
    Break2() throws IOException {
        char ch;
        for ( ; ; ) {
            ch = (char) System.in.read(); // get a char
            if (ch == 'q') break;
        }
        System.out.println("You pressed q!");
    }
}
