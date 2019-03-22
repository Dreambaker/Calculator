package com.galaxy.calculator.tools;

import org.junit.Before;
import org.junit.Test;

public class fileReaderTest {
    fileReader fileReader;
    @Before
    public void setUp() throws Exception {
        fileReader = new fileReader();
    }

    @Test
    public void processFile() {
        fileReader.processFile();
    }
}