package assignment.Day6;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Power of (n) you want to calculate :");
        int no = sc.nextInt();
        for (int i=1;i<=no;i++){
            if (i<31){
                System.out.println((int)(Math.pow(2,i)));
            }
        }
    }
}
