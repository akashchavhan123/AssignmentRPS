package com.praactice;

import java.util.Scanner;

public class CaseOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice :"+"1.Sum 2.Mul 3.Div 4.Sub");
        int choice = sc.nextInt();
        System.out.println("Enter first no");
        int no1 = sc.nextInt();
        System.out.println("Enter first two");
        int no2 = sc.nextInt();
        int result;
        switch (choice){
            case 1:
                result=no1+no2;
                System.out.println("Addition is+" +result);
                break;
            case 2:
                result=no1*no2;
                System.out.println("Mul is"+" "+result);
                break;
            case 3:
                result=no1/no2;
                System.out.println("Div is"+" "+result);
                break;
            case 4:
                result=no1-no2;
                System.out.println("Sub is"+" "+result);
                break;
            default:
                System.out.println("Enter correct choice");
        }

    }
}
