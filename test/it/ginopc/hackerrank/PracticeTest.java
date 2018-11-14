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

import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author maurizio
 */
public class PracticeTest {
    
    Practice practice = new Practice();
    
    private ByteArrayInputStream iStream;
    private ByteArrayOutputStream oStream;
    private String iString = "";
    
    @Before
    public void setUpStreams(){
        iStream = new ByteArrayInputStream(iString.getBytes());
        System.setIn(iStream);
        oStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(oStream));
    }
    
    @After
    public void cleanUpStreams(){
        System.setIn(null);
        System.setOut(null);
    }
    
    @Test
    public void testGetVersion(){
        String expResult = String.format("%d.%d.%d", practice.vMajor, practice.vMinor, practice.vBuild);
        String result = practice.getVersion();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testWelcome() {
        String expResult = "Hello, World.\nHello, Java.\n";
        practice.welcome();
        assertEquals(expResult, oStream.toString());
    }
    
  
    @Test
    public void testJavaIO(){
        iString = "42\n100\n125";
        String expResult = "42\n100\n125\n";
        
        practice.javaIO();
        assertEquals(expResult, oStream.toString());
    }
    
    @Test
    public void testIfElse(){
        iString = "3";
        String expResult = "Weird\n";
        
        practice.ifElse();
        assertEquals(expResult, oStream.toString());
    }
}
