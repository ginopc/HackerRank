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
package it.ginopc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Maurizio Aru
 * @version 20181030
 */
public class HackerRank {
    
    /**
     * Return a+b
     * @param a first item to sum
     * @param b second item to sum
     * @return sum(a+b)
     */
    static int solveMeFirst(int a, int b){
        return a+b;
    }
    
    /**
     * Sum all items on array
     * @param ar array of items
     * @return sum of items
     */
    static int simpleArraySum(int[] ar) {
        int result = 0;
        
        for (int i=0; i<ar.length; i++){
            result += ar[i];
        }
        
        return result;
    }
    
    /**
     * Compare triplets and assign a score follow this rule:
     *  if a[i] > b[i] then +1 to a
     *  if a[i] < b[i] then +1 to b
     *  if a[i] = b[i] nothing to do
     * 
     * @return List<Integer> scores
     */ 
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int ap = 0; // Alice's rating
        int bp = 0; // Bob's rating
        Integer av = 0; // current Alice value
        Integer bv = 0; // current Bob value
        List<Integer> result = new ArrayList<Integer>();

        Iterator ai = a.iterator();
        Iterator bi = b.iterator();
        while(ai.hasNext()){
            av = (Integer) ai.next();
            bv = (Integer) bi.next();
            
            if (av > bv)
                ap += 1;
            else if (av < bv)
                bp += 1;
            
        }
        
        result.add(ap);
        result.add(bp);
        return result;
    }    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("** HackerRank Problem Solve Library **");
    }
    
}
