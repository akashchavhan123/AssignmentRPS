package assignment.Day6;

import java.util.Scanner;

public class SwapNo {
    public static void main(String[] args) {
    swapping();
    }
    public static void swapping(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value :");
        int no1 = sc.nextInt();
        System.out.println("Enter B value :");
        int no2 = sc.nextInt();
        System.out.println("Enter B Value :");
        System.out.println("Before Swapping value of A no is"+no1);
        System.out.println("Before Swapping value of B no is"+no2);
        int temp = no1;
        no1 = no2;
        no2 = temp;
        System.out.println("--------------After swapping-------------------");
        System.out.println("After Swapping value of A no is"+no1);
        System.out.println("After Swapping value of B no is"+no2);
    }
}
