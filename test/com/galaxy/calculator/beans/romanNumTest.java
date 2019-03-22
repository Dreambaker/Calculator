package com.galaxy.calculator.beans;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class romanNumTest {
    romanNum roman ;

    @Before
    public void setUp() throws Exception {
        roman = new romanNum("VIII");
    }

    @Test
    public void getarabic() {
        System.out.println(roman.getarabic());
    }
}