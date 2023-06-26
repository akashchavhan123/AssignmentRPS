package assignment.Day6;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Divisor");
        int no = sc.nextInt();
        System.out.println("Enter Dividend");
        int dividend = sc.nextInt();
        int rem = dividend%no;
        System.out.println("Remainder is"+" "+rem);
        int quet = dividend/no;
        System.out.println("Quotient is"+" "+quet);
        }
    }
