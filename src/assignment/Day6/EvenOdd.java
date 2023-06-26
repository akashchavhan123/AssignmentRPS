package assignment.Day6;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value :");
        int no = sc.nextInt();
        if ( no%2 == 0){
            System.out.println(no +" "+"is Even");
        }
        else {
            System.out.println(no +" "+"is Odd");
        }
    }
}
