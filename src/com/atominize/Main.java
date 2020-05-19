package com.atominize;

public class Main {

    public static void main(String[] args) {
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
        int x; // known to all code within main
        x = 10;

        if (x == 10) { // start new scope
            int y = 20; // known only to this block
            // x and y both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Error! y not known here
        // x is still known here.
        System.out.println("x is " + x);
    }
}
