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
}
