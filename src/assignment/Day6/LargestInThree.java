package assignment.Day6;

import java.util.Scanner;

public class LargestInThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no");
        int no1 = sc.nextInt();
        System.out.println("Enter 1st no");
        int no2 = sc.nextInt();
        System.out.println("Enter 1st no");
        int no3 = sc.nextInt();
        if (no1 > no2 && no1 > no3) {
            System.out.println(no1+" "+"is Greater");
        } else if (no2 > no1 && no2 > no3) {
            System.out.println(no2+" "+"is Greater");
        }else
            System.out.println(no3+" "+"is Greater");
    }
}