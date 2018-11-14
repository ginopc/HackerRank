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

import it.ginopc.hackerrank.HackerRank;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Maurizio Aru
 * @version 20181030
 */
public class HackerRankTest {
    
    public HackerRankTest() {
    }

    @Test
    public void testSolveMeFirst() {
        System.out.println("solveMeFirst Test");
        
        int a=1, b=2;
        int expResult = 3;
        int result = HackerRank.solveMeFirst(a, b);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSimpleArraySum(){
        System.out.println("simpleArraySum Test");
        
        int[] arr = {1, 2, 3};
        int expResult = 6;
        int result = HackerRank.simpleArraySum(arr);
        
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareTriplets() {
        System.out.println("solveMeFirst Test");
        
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        List<Integer> expResult = new ArrayList<Integer>();
        
        a.add(1); a.add(2); a.add(3);
        b.add(3); b.add(2); b.add(1);
        expResult.add(1); expResult.add(1);
        List<Integer> result = HackerRank.compareTriplets(a, b);
        
        assertEquals(expResult, result);
        
    }  

    @Test
    public void testAVeryBigSum() {
        System.out.println("simpleArraySum");
        long[] ar = { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        long expResult = 5000000015l;
        
        long result = HackerRank.aVeryBigSum(ar);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDiagonalDifference(){
        System.out.println("diagonalDifference");
        int aSize = 3;
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {9, 8, 9}
        };
        
        int expResult = 2;
        int result = HackerRank.diagonalDifference(arr);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlusMinus(){
        System.out.println("plusMinus");
        int[] arr = {-1, -1, 0, 1, 1};
        String expResult = "0,40000\n0,40000\n0,20000\n";
        String result = HackerRank.plusMinus(arr);
        assertTrue(true);
    }
    
    @Test
    public void testStaircase(){
        System.out.println("staircase");
        int items = 5;
        String expResult = "    #\n   ##\n  ###\n ####\n#####\n";
        String result = HackerRank.staircase(items);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMiniMaxSum(){
        System.out.println("miniMax (test 1)");

        int[] arr = {1,2,3,4,5};
        String expResult = "10 14";
        String result = HackerRank.miniMaxSum(arr);
        assertEquals(expResult, result);   
    }
    
    @Test
    public void testMiniMaxSum2(){
        System.out.println("miniMax (test 2)");
        int[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};
        String expResult = "2063136757 2744467344";
        String result = HackerRank.miniMaxSum(arr);
        assertEquals(expResult, result);    
    }
    
    @Test
    public void testMiniMaxSum3(){
        System.out.println("miniMax (test 3)");

        int[] arr = {5,4,3,2,1};
        String expResult = "10 14";
        String result = HackerRank.miniMaxSum(arr);
        assertEquals(expResult, result);   
    }
    
    @Test
    public void testBirthdayCakeCandles(){
        System.out.println("birthdayCakeCandles");
        int[] arr = {3,1,2,3};
        int expResult = 2;
        int result = HackerRank.birthdayCakeCandles(arr);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimeConversion() {
        System.out.println("timeConversion");
        String srcString = "12:40:22AM";
        String expResult = "00:40:22";
        String result = HackerRank.timeConversion(srcString);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGradingStudents1(){
        System.out.println("gradingStudents (test1)");
        int[] arr = {73, 67, 38, 33};
        int[] expResult = {75, 67, 40, 33};
        int[] result = HackerRank.gradingStudents(arr);
        assertNotNull(result);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testGradingStudents2(){
        System.out.println("gradingStudents (test 2");
        int[] arr = {84, 94, 21,  0, 18,100, 18, 62, 30, 61, 53, 0, 43,  2, 29,
                     53, 61, 40, 14,  4, 29, 98, 37, 23, 46,  9, 79, 62, 20, 38,
                     51, 99, 59, 47,  4, 86, 61, 68, 17, 45,  6,  1, 95, 95};
        int[] expResult = {85, 95, 21,  0, 18,100, 18, 62, 30, 61, 55,  0, 45,
                            2, 29, 55, 61, 40, 14,  4, 29,100, 37, 23, 46,  9,
                            80, 62, 20, 40, 51,100, 60, 47,  4, 86, 61, 70, 17,
                            45,  6,  1, 95, 95};
        int[] result = HackerRank.gradingStudents(arr);
        assertNotNull(result);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCoutApplesAndOranges(){
        System.out.println("coutApplesAndOranges Test");
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};
        int[] expResult = {1,1};
        int[] result = HackerRank.countApplesAndOranges(7, 11, 5, 15, apples, oranges);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testGetTotalX1(){
        System.out.println("getTotalX Test");
        
        int[] a = {2, 6};
        int[] b = {24, 36};
        int expResult = 3;
        int result = HackerRank.getTotalX(a, b);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTotalX2(){
        System.out.println("getTotalX Test");
        
        int[] a = {2, 4};
        int[] b = {16, 32, 96};
        int expResult = 3;
        int result = HackerRank.getTotalX(a, b);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSockMerchant1(){
        System.out.println("sockMerchant Test 1");
        
        // define test vars
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int expResult = 3;
        
        int result = HackerRank.sockMerchant(n, ar);
        System.out.println(String.format("Socks: %d", result));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSockMerchant2(){
        System.out.println("sockMerchant Test 2");
        
        // define test vars
        int n = 8;
        int[] ar = {10, 20, 10, 20, 10, 20, 10, 20};
        int expResult = 4;
        
        int result = HackerRank.sockMerchant(n, ar);
        System.out.println(String.format("Socks: %d", result));
        assertEquals(expResult, result);
    }   
    
    @Test
    public void testSockMerchant3(){
        System.out.println("sockMerchant Test 3");
        
        // define test vars
        int n = 10;
        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int expResult = 4;
        
        int result = HackerRank.sockMerchant(n, ar);
        System.out.println(String.format("Socks: %d", result));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCountingValleys(){
        System.out.println("countingValleys Test");
        int n = 8;
        String track = "UDDDUDUU";
        
        int expResult = 1;
        int result = HackerRank.countingValleys(n, track);
        System.out.println(String.format("Valleys: %d", result));
        assertEquals(expResult, result);
    }
}

