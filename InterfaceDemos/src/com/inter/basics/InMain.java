package com.inter.basics;

public class InMain {
    public static void main(String[] args) {
        IEntertainment entertainment = new ManagerDetails();
        entertainment.showGames("indoor");
        entertainment.showActivity();

        entertainment = new DeveloperDetails();
        entertainment.showGames("outdoor");
        entertainment.showActivity();
        ICompressor compressor = new ZipCompressor();
       // String[] zip = compressor.compressFiles("file1.doc,")

    }
}
