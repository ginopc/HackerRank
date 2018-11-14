/*
    MIT License

    Copyright (c) 2018 Maurizio Aru

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
 */
package it.ginopc.hackerrank;

import java.util.Scanner;

/**
 *
 * @author Maurizio Aru
 * @version 20181114
 */
public class Practice {
    
    int vMajor = 0,
        vMinor = 0,
        vBuild = 1;
    
    Scanner scanner;
    
    public Practice(){
        scanner = new Scanner(System.in);
    }

    public String getVersion(){
        return String.format("%d.%d.%d", this.vMajor, this.vMinor, this.vBuild);
    }

    /**
     * Print two Welcome strings
     */
    public void welcome(){
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
    
    /**
     * make some I/O procedures
     */
    public void javaIO(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);    
    }
    
    /**
     * IfElse control
     */
    public void ifElse(){
        int N = scanner.nextInt();
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if ( N%2 == 0) {
            // even number
            if ((N >= 2) && (N <= 5))
                System.out.println("Not Weird");
            if ((N >= 6) && (N <= 20)) 
                System.out.println("Weird");
            if (N > 20) 
                System.out.println("Not Weird");
        }
        else {
            // odd number
            System.out.print("Weird");
        }
        scanner.close();
    }
    
    public static void main(String[] args){
        System.out.println("** HackerRank Practice Solutions **");

        Practice app  = new Practice();
        app.getVersion();
        app.welcome();
        app.javaIO();
        app.ifElse();
    }
}
