/**
 *  Java program to demonstrate BigInteger class.
 */

package com.mybiginteger;

import java.math.BigInteger;

/**
 *  Main class.
 */
public class Main {

    // Entry point for JVM.
    public static void main(String[] args) {

        // Creating BigInteger values.
        BigInteger a = new BigInteger("700000000000000000000000000");
        BigInteger b = new BigInteger("200000000000000000000000000");

        // Printing values of a and b to console.
        System.out.println(a); // Output: 700000000000000000000000000
        System.out.println(b); // Output: 200000000000000000000000000

        // Creating BigInteger values.
        BigInteger c = new BigInteger("345");
        BigInteger d = new BigInteger("2");

        // Adding c and d.
        BigInteger f = c.add(d);

        // Printing values of f to console.
        System.out.println(f); // Output: 347

        // Subtracting d from c.
        BigInteger g = c.subtract(d);

        // Printing values of g to console.
        System.out.println(g); // Output: 343

        // Multiplying c and d.
        BigInteger h = c.multiply(d);

        // Printing values of g to console.
        System.out.println(h); // Output: 690

        // Dividing c by d.
        BigInteger i = c.divide(d);

        // Printing values of g to console.
        System.out.println(i); // Output: 172

    }
}