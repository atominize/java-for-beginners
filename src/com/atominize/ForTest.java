package com.atominize;

import java.io.IOException;

public class ForTest {
    ForTest() throws IOException {
        int i;
        System.out.println("Press S to stop.");
        for (i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Pass #" + i);
        }
    }
}
