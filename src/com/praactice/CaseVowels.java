package com.praactice;

import java.util.Scanner;

public class CaseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Char :");
        char ch = sc.nextLine().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch +" "+"is Vowels");
                break;
            default:
                System.out.println("Consolidate");
        }
    }
}
