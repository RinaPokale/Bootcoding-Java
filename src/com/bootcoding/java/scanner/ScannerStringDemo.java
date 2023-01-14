package com.bootcoding.java.scanner;

import java.util.Scanner;

public class ScannerStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word:- ");
        String word = sc.next();

        char output = findDuplicateChar(word);
        System.out.println("Duplicate character in " + word + " is " + output);
    }

    private static char findDuplicateChar(String word){
        char[] chars = word.toCharArray();
//        char duplicateChar = ' ';

        for(int i = 0; i < chars.length; i++){
            for(int j = i + 1; j < chars.length; j++){
                if(chars[i] == chars[j]){
                    return chars[i];
                }
            }
        }
        return 0;
    }
}

//    String str = sc.next();
//        System.out.println(str);
//        String str2 = sc.nextLine();
//        System.out.println(str2);