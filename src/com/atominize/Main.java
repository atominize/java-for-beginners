package com.atominize;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Comma comma = new Comma();
//        DecreaseFor decrease = new DecreaseFor();
//        SqrRoot sqrRoot = new SqrRoot();
//        Help help = new Help();
//        SwitchDemo switchDemo = new SwitchDemo();
//        NoZeroDiv noZeroDiv = new NoZeroDiv();
//        int val = 3;
//        int absVal = val < 0 ? -val : val;
//        Guess3 guess3 = new Guess3();
//        Guess2 guess2 = new Guess2();
//        Guess guess = new Guess();

//        int var1 = 15;
//        int var2 = 6;
//        System.out.println(var1 + var2);
//        System.out.println(var1 - var2);
//        System.out.println(var1 * var2);
//        System.out.println(var1 / var2);
//        System.out.println(var1 % var2);

        /* Example 4 */
//        int iResult, iRem;
//        double dResult, dRem;
//        iResult = 10 / 3;
//        iRem = 10 % 3;
//        dResult = 10.0 / 3.0;
//        dRem = 10.0 % 3.0;
//        System.out.println("Integer result and remainder of 10/3: " + iResult + " " + iRem);
//        System.out.println("Double result and remainder of 10/3: " + dResult + " " + dRem);

        /* Example 5 */
//        int n, d;
//        n = 10;
//        d = 2;
//        if (d != 0 && (n % d) == 0)
//            System.out.println(d + " is a factor of " + n);
//        d = 0; // now, set d to zero
//        // Since d is zero, the second operand is not evaluated.
//        if (d != 0 && (n % d) == 0)
//            System.out.println(d + " is a factor of " + n);
//        /* Now, try same thing without short-circuit operator.
//        This will cause a divide-by-zero error.
//         */
//        if (d != 0 & (n % d) == 0)
//            System.out.println(d + " is a factor of " + n);

        /* Example 6 */
//        System.out.println("First line \nSecond line");
//        System.out.println("A\tB\tC");
//        System.out.println("D\tE\tF");

        /* Logical Table */
//        boolean p, q;
//        System.out.println("P\t\tQ\t\tP AND Q\t\tP OR Q\t\tP XOR Q\t\tNOT P");
//        p = true; q = true;
//        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t\t" + (p|q) + "\t\t" + (p^q) + "\t\t" + (!p));
//        p = true; q = false;
//        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t\t" + (p|q) + "\t\t" + (p^q) + "\t\t" + (!p));
//        p = false; q = true;
//        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t\t" + (p|q) + "\t\t" + (p^q) + "\t\t" + (!p));
//        p = false; q = false;
//        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t\t" + (p|q) + "\t\t" + (p^q) + "\t\t" + (!p));

        /* Example 9 */
//        char ch;
//        ch = 'X';
//        System.out.println("ch contains " + ch);
//        ch++; //increment ch
//        System.out.println("ch is now " + ch);
//        ch = 90; // give ch the value Z
//        System.out.println("ch is now " + ch);

        /* Example 10 */
//        boolean b;
//        b = false;
//        System.out.println("b is " + b);
//        b = true;
//        System.out.println("b is " + b);
//        // a boolean value can control the if statement
//        if (b) System.out.println("This is executed");
//        b = false;
//        if (b) System.out.println("This is not executed");
//        // outcome of a relational operator is a boolean value
//        System.out.println("10 > 9 is " + (10 > 9));

        /* Example 11 */
//        int a, b, c;
//        a = 2;
//        b = 3;
//        c = a - b;
//        if (c >= 0) System.out.println("c is a positive number");
//        if (c < 0) System.out.println("c is a negative number");
//        System.out.println();
//        c = b - a;
//        if (c >= 0) System.out.println("c is a positive number");
//        if (c < 0) System.out.println("c is a negative number");

        /* Example 12 */
//        int count;
//        for (int count = 0; count < 5; count++)
//            System.out.println("This is count: " + count);
//        System.out.println("Done!");

        /* Euro Converter 10 */
//        double eu;
//        System.out.println("Euro conversion table:");
//        System.out.println();
//        for (eu = 1; eu < 101; eu++) {
//            System.out.println(eu + " Euro is equivalent to Lm " + (eu*0.43));
//        }

        /* Example 15 */
//        double x, y, z;
//        x = 3;
//        y = 4;
//        z = Math.sqrt(x*x + y*y);
//        System.out.println("Hypotenuse is " + z);

        /* Example 16 */
//        int x; // known to all code within main
//        x = 10;
//
//        if (x == 10) { // start new scope
//            int y = 20; // known only to this block
//            // x and y both known here.
//            System.out.println("x and y: " + x + " " + y);
//            x = y * 2;
//        }
//        // y = 100; // Error! y not known here
//        // x is still known here.
//        System.out.println("x is " + x);

        /* Example 18 */
//        long L;
//        double D;
//        L = 100123285L;
//        D = L; // L = D is impossible
//        System.out.println("L and D: " + L + " " + D);

        /* Example 19 */
//        double x, y;
//        byte b;
//        int i;
//        char ch;
//        x = 10.0;
//        y = 3.0;
//        i = (int) (x / y); // cast double to int
//        System.out.println("Integer outcome of x / y: " + i);
//        i = 100;
//        b = (byte) i;
//        System.out.println("Value of b: " + b);
//        i = 257;
//        b = (byte) i;
//        System.out.println("Value of b: " + b);
//        b = 88; //ASCII code of X
//        ch = (char) b;
//        System.out.println("ch: " + ch);

        /* Example 20 */
//        byte b;
//        int i;
//        b = 10;
//        i = b*b; // OK, no cast needed
//        b = 10;
//        b = (byte) (b*b); // cast needed!! as cannot assign int to byte
//        System.out.println("i and b: " + i + " " + b);

        /* ScannerInput */
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int a = input.nextInt();
//        System.out.print("Enter second number: ");
//        int b = input.nextInt();
//        System.out.print("Enter last number: ");
//        int c = input.nextInt();
//        System.out.println("Average is " + (a+b+c) / 3);

        /* SwingInput */
//        String temp; // Temporary storage for input.
//        temp = JOptionPane.showInputDialog(null, "First number");
//        int a = Integer.parseInt(temp); // String to int
//        temp = JOptionPane.showInputDialog(null, "Second number");
//        int b = Integer.parseInt(temp);
//        temp = JOptionPane.showInputDialog(null, "Third number");
//        int c = Integer.parseInt(temp);
//        JOptionPane.showMessageDialog(null, "Average is " + (a+b+c) / 3);
    }
}
