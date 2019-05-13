package com.kgisl.task;

import java.io.File;

/**
 * FileLength
 */
public class FileLength {

    public static void main(String[] args) {
        File file = new File("D:\\nnn\\file.txt");

        long fileSize = file.length();

        System.out.println("File size in bytes is: " + fileSize);
        System.out.println("File size in    KB is : " + (double)fileSize/1000);
        System.out.println("File size in    MB is :" + (double)fileSize/(1000*1000));
    }
}