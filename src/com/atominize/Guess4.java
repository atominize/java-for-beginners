package com.atominize;

import java.io.IOException;

public class Guess4 {
    Guess4() throws IOException {
        char ch, answer = 'K';
        do {
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.print("Can you guess it: ");
            // read a letter, but skip cr/If
            do {
                ch = (char) System.in.read(); // get a char
            } while (ch == '\n' | ch == '\r');
            if (ch == answer) System.out.println("** Right **");
            else {
                System.out.print("...Sorry, you're ");
                if (ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again!\n");
            }
        } while (answer != ch);
    }
}
