package com.kgisl.task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ABCD
 */
public class ABCD {

    public static void main(String[] args) throws FileNotFoundException {
        String inputFile = "D:\\i.txt";
       

        FileReader fileReader = new FileReader(inputFile);
        BufferedReader b = new BufferedReader(fileReader);
        String inputLine;
        List<String> lineList = new ArrayList<String>();
        try {
            while ((inputLine = b.readLine()) != null) {
                lineList.add(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Collections.sort(lineList);
        System.out.println(lineList);
		FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("D:\\o.txt");
    
		PrintWriter o = new PrintWriter(fileWriter);
		for (String outputLine : lineList) {
			o.println(outputLine);
        }
    }
  
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	
    }
}