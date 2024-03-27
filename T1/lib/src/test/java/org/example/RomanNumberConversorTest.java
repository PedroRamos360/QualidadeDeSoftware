package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanNumberConversorTest {
    private void compareExpectedReceived(int expected, int received) {
        System.out.println("Expected: " + expected + " Received: " + received);
        assertEquals(expected, received);
    } 

    @Test
    public void testNumberI() {
        int expected = 1;
        int received = RomanNumberConversor.fromRoman("I");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberV() {
        int expected = 5;
        int received = RomanNumberConversor.fromRoman("V");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberX() {
        int expected = 10;
        int received = RomanNumberConversor.fromRoman("X");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberL() {
        int expected = 50;
        int received = RomanNumberConversor.fromRoman("L");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberC() {
        int expected = 100;
        int received = RomanNumberConversor.fromRoman("C");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberD() {
        int expected = 500;
        int received = RomanNumberConversor.fromRoman("D");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberM() {
        int expected = 1000;
        int received = RomanNumberConversor.fromRoman("M");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberII() {
        int expected = 2;
        int received = RomanNumberConversor.fromRoman("II");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberIII() {
        int expected = 3;
        int received = RomanNumberConversor.fromRoman("III");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberIV() {
        int expected = 4;
        int received = RomanNumberConversor.fromRoman("IV");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberVI() {
        int expected = 6;
        int received = RomanNumberConversor.fromRoman("VI");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberVII() {
        int expected = 7;
        int received = RomanNumberConversor.fromRoman("VII");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberVIII() {
        int expected = 8;
        int received = RomanNumberConversor.fromRoman("VIII");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberIX() {
        int expected = 9;
        int received = RomanNumberConversor.fromRoman("IX");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberXI() {
        int expected = 11;
        int received = RomanNumberConversor.fromRoman("XI");
        compareExpectedReceived(expected, received);
    }

    @Test
    public void testNumberXII() {
        int expected = 12;
        int received = RomanNumberConversor.fromRoman("XII");
        compareExpectedReceived(expected, received);
    }
}
