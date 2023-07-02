package assignment.day7;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int no = sc.nextInt();
        if (no%2 != 0 && no/2 !=0){
            System.out.println("Prime no");
        }
        else
            System.out.println("Not Prime");
    }
}
