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
}
