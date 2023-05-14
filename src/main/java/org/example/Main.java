package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Characters of a String
        String str = "Sneha";
        CharsOfString cos = new CharsOfString();
        cos.traverseString(str);

        //Traverse Thru a Map
        TraverseThruMap ttMap = new TraverseThruMap();
        ttMap.traverseThruMapMethod();

    }
}