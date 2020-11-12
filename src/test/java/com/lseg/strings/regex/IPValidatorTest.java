package com.lseg.strings.regex;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IPValidatorTest {

    private IPValidator sut = new IPValidator();

    @Test
    public void isValidIpTest() {
        //given
        String ip = "000.12.12.034";

        //When
        boolean result = sut.isValidIp(ip);

        //Then
        assertTrue(result);
    }

    @Test
    public void isValidIpTest1() {
        //given
        String ip = "121.234.12.12";

        //When
        boolean result = sut.isValidIp(ip);

        //Then
        assertTrue(result);
    }

    @Test
    public void isValidIpTest2() {
        //given
        String ip = "23.45.12.56";

        //When
        boolean result = sut.isValidIp(ip);

        //Then
        assertTrue(result);
    }

    @Test
    public void isValidIpTest3() {
        //given
        String ip = "00.12.123.123123.123";

        //When
        boolean result = sut.isValidIp(ip);

        //Then
        assertFalse(result);
    }

    @Test
    public void isValidIpTest4() {
        //given
        String ip = "122.23";

        //When
        boolean result = sut.isValidIp(ip);

        //Then
        assertFalse(result);
    }

    @Test
    public void isValidIpTest5() {
        //given
        String ip = "Hello.ip";

        //When
        boolean result = sut.isValidIp(ip);

        //Then
        assertFalse(result);
    }

    @Test
    public void isValidIpTest6() {
        //given
        String ip = "122.23.455.999";

        //When
        boolean result = sut.isValidIp(ip);

        //Then
        assertFalse(result);
    }
    @Test
    public void isValidIpTest7() {
        //given
        String ip = "...";

        //When
        boolean result = sut.isValidIp(ip);

        //Then
        assertFalse(result);
    }
}
