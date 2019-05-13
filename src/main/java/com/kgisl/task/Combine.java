package com.kgisl.task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Combine
 */
public class Combine {

    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("D:\\f3.txt"); 
        
        BufferedReader br= new BufferedReader(new FileReader("D:\\f1.txt")); 
          
        String line = br.readLine(); 
        while (line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
          
        br = new BufferedReader(new FileReader("D:\\f2.txt")); 
          
        line = br.readLine(); 
        while(line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
          
        pw.flush(); 
        br.close();
        pw.close(); 
          
        System.out.println("Merged f1.txt and f2.txt into f3.txt"); 

    }
}