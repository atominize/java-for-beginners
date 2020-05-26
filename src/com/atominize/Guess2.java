package com.atominize;

import java.io.IOException;

public class Guess2 {
    public Guess2() throws IOException {
        char ch, answer = 'K';
        System.out.println("I'm thinking of a letter between A and Z");
        System.out.print("Can you guess it: ");
        ch = (char) System.in.read(); // get a char
        if (ch == answer) System.out.println("** Right **");
        else System.out.println("...Sorry, you're wrong.");
    }
}
