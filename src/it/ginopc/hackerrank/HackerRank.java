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
     * Seem to simpleArraySum but for long
     * @param ar items array
     * @return sum result
     */
    static long aVeryBigSum(long[] ar) {
        long result = 0;
        
        for (int i=0; i < ar.length; i++){
            result += ar[i];
        }
        
        return result;
    }
    
    /**
     * Sum diagonal elements and return absolute difference of this diagonals
     * @param arr 2 dims array of values
     * @return absolute difference of diagonals
     */
    static int diagonalDifference(int[][] arr) {
        int result = 0;
        int aSize = arr[0].length;
        int d1=0, d2=0;
        
        
        for (int i=0; i<aSize; i++){
            d1 += arr[i][i];
            d2 += arr[i][aSize-1-i];
        }
        result = Math.abs(d1-d2);
        
        return result;
    }

    // Complete the plusMinus function below.
    static String plusMinus(int[] arr) {
        int cPositive;
        int cNegative;
        int cZeros;
        String result;

        // init counters
        cPositive = cNegative = cZeros = 0;
        
        for (int i=0; i<arr.length; i++){
            if (arr[i]>0) {
                cPositive += 1;
            }
            else if (arr[i] < 0) {
                cNegative += 1;
            }
            else {
                cZeros +=1;
            }
            
        }
        
        // Print results
        result = String.format("%.5f\n", (float) cPositive / arr.length);
        result += String.format("%.5f\n", (float) cNegative / arr.length);
        result += String.format("%.5f", (float) cZeros / arr.length);
        System.out.println(result);
        
        return result;
    }

    /** 
     * Print a staircase
     * @param n rows
     */
    static String staircase(int n) {
        String row;
        String result = "";
        
        for (int i=1; i<=n; i++){
            row = "";
            for (int j=1; j<=n; j++) {
                if ( j <= (n-i) ){
                    // print spaces
                    row += " ";
                }
                else {
                    // print tags
                    row += "#";
                }    
            }
            
            System.out.println(row);
            result += row + "\n";
        }
        
        return result;
    }
    
    /**
     * Calculate min and max sum of items array
     * @param arr items
     */
    static String miniMaxSum(int[] arr) {
        int minValue=arr[0], maxValue=arr[0];
        long total=0;
        String result = "";
        
        
        // sort items list
        for (int i=0; i<arr.length; i++){
            total += arr[i];
            if (arr[i] < minValue) { 
                minValue = arr[i]; 
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i]; 
            }
        }
        
        result = String.format("%d %d", total-maxValue, total-minValue);
        System.out.println(result);
        
        return result;
    }

    /**
     * Return how many candles your niece can blow out
     * @param array of candle's tall
     * @return number of candles your niece can blow out
     */
    static int birthdayCakeCandles(int[] ar) {
        int max = ar[0];
        int result = 0;
        
        for (int i=0; i<ar.length; i++){
            if (ar[i] > max) {
                max = ar[i];
                result = 1;
            }
            else if (ar[i] == max){
                result++;
            } 
        }
        return result;
    }    
    
    /**
     * Convert time from 12H format to 24H format
     * Midnight is 12:00:00AM => 00:00:00, Noon is 12:00:00PM => 12:00:00
     * @param s time string
     * @return converted time string
     */
    static String timeConversion(String src) {
        String result = "";
        
        // it is morning or afternoon?
        String demi = src.substring(8);
        Integer H12 = Integer.parseInt(src.substring(0,2));
        String MMSS = src.substring(2,8);
        
        int delta = 0;
        int H24 = 0;
        switch (demi){
            case "AM":
                H24 = (H12 < 12) ? H12 : 0;
                break;
                
            case "PM":
                H24 = (H12 < 12) ? 12 + H12 : 12;
                break;
        }
        
        String H24s = (H24 < 10) ? String.format("0%d", H24) : String.format("%d", H24);
        
        result = String.format("%s%s", H24s, MMSS);
        return result;
    }
     /*
     * Round grades follow this rules:
     *  if (grade > 38 and grade next to next multiple of 5)
     *      round to this multiple
     *  else
     *       nothing to do
     */
    static int[] gradingStudents(int[] grades) {
        int[] result = new int[grades.length];
        
        for (int i=0; i<grades.length; i++){
            if (grades[i] < 38){
                // under 38 nothing to do
                result[i] = grades[i];
            } else if (grades[i] % 5 > 2) {
                // if grade is near to next multiple of 5, round grade
                result[i] = grades[i] + (5 - (grades[i] % 5));
            } else {
                // else nothing to to
                result[i] = grades[i];
            }
        }
        
        return result;
    }
    
    /**
     * Return how many values fall between s and t
     * @param s min value of interval
     * @param t max value of interval
     * @param a starting point from first group of values
     * @param b starting point from second group of values
     * @param apples first group fall values
     * @param oranges second group fall values
     */
    static int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesHoused = 0;
        int orangesHoused = 0;
        int[] result = new int[2];

        // Check apples
        for (int i=0; i<apples.length; i++)
            if ((a + apples[i] >= s) && (a + apples[i] <= t))
                applesHoused++;
        System.out.println(String.format("%d", applesHoused));
        
        // Check oranges
        for (int j=0; j<oranges.length; j++)
            if ( (b + oranges[j] >= s) && (b + oranges[j] <= t) )
                orangesHoused++;
        System.out.println(String.format("%d", orangesHoused));

        return new int[]{ applesHoused, orangesHoused };
    }
    
    /**
     * Calculate Minimum Common Divisor
     * @param a
     * @param b
     * @return 
     */
    static int mcd(int a, int b){
        int r = 0;
        while (b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    /**
     * Calculate Max Common Multiple for two items
     * @param a first item
     * @param b second item
     * @return Calculated value
     */
    static int mcm(int a, int b){
        return a * b / mcd(a, b);
    }
    
    /**
     * Calculate Max Common Multiple of array of integer
     * @param arr items
     * @return calculate value
     */
    static int mcm(int[] arr){
        int a = arr[0];
        
        if (arr.length == 1) return arr[0];
        
        int[] newArr = new int[arr.length -1];
        for (int i=1; i<arr.length; i++)
            newArr[i-1] = arr[i];
        int b = mcm(newArr);
        
        return mcm(a,b);
    }
    
    /**
     * Calculate the number of integers that are between th sets
     * @param a first integer set
     * @param b second integer set
     * @return count of numbers
     */
    static int getTotalX(int[] a, int[] b) {
        int result = 0;
        int minSet=a[0], maxSet=b[0];

        // calcolo il mcm degli elementi di a
        int minimum = mcm(a);
        for (int i=0; i<b.length; i++){
            if (b[i] < maxSet) maxSet = b[i];
        }
        
         // Calcolo quanti multipli di mcm sono divisori degli elementi di b
        int factor = minimum;
        int count = 1;
        boolean isDivider = true;
        while (factor <= maxSet){
            
            // check if factor is dividend for b items
            for (int i=0; i<b.length; i++){
                if (b[i] % factor != 0)
                    isDivider = false;
            }
            
            if (isDivider) result++;
            count++;
            factor = minimum * (count);
            isDivider = true; // reset status
        }
        
        return result;
    }
    
    
    /**
     * Count numbers of pairs
     * @param n number of items
     * @param ar items array
     * @return number of pairs
     */
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        List<Integer> temp = new ArrayList<Integer>();
        
        for (int i=0; i<n; i++){
            if (temp.contains(ar[i])) {
                result++;
                temp.remove((Integer) ar[i]);
            }
            else {
                temp.add(ar[i]);
            }
        }
        
        return result;
    }
    
    static int countingValleys(int n, String s) {
        int result = 0;
        int altitude = 0;
        String tmpMove = "_";
        
        for (int i=0; i<s.length(); i++){
            tmpMove = s.substring(i, i+1);
            if (tmpMove.equals("U")){
                altitude++;
                if (altitude == 0)
                    result++; // end of valley
            }
            else {
                altitude--;
            }    
        }
        return result;
    }    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("** HackerRank Problem Solve Library **");
    }
    
    public static void Test(){
        int n = 8;
        String s = "UDDDUDUU";
        
        int result = countingValleys(n, s);
        System.out.println(String.format("Valleys: %d", result));
    }
}
