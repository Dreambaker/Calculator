package com.galaxy.calculator.tools;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputFileProcessorTest {
    InputFileProcessor InputFileProcessor;
    @Before
    public void setUp() throws Exception {
        InputFileProcessor = new InputFileProcessor();
    }

    @Test
    public void processFile() {
        InputFileProcessor.processFile();
    }
}