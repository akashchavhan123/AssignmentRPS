package assignment.Day6;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Char :");
        char c = sc.nextLine().charAt(0);
        switch (c){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println(c+" "+"is Vowels");
                break;
            default:
                System.out.println(c+" "+"is Consonant");

        }
    }
}
