package com.galaxy.calculator.tools;
import java.io.*;

public class fileReader {
    private lineProcessor lineProcessor;

    public fileReader(){
        lineProcessor = new lineProcessor();
    }
    public void processFile(){
        String pathname = "./resource/input.txt"; //
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                lineProcessor.processLine(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
