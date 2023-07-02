package assignment.day7;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term that you want to reverse");
        int no = sc.nextInt();
        for (int i=no;i>=0;i--){
            System.out.println(i);
        }
    }
}
