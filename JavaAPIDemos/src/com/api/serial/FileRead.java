package com.api.serial;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRead {
    public static void main(String[] args) {
        InputStreamReader iReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(iReader);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("demo.txt");
            char c = (char) bufferedReader.read();
            while (c != 'q') {
                System.out.print(c);
                fileOutputStream.write(c);
                c = (char) bufferedReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
            }
        }
    }
}
