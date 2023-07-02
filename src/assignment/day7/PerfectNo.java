package assignment.day7;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int no = sc.nextInt();
        int sum = 0;
        int temp = no;
        while (no>0){
            sum = sum+(no%10)*(no%10)*(no%10);
            System.out.println(sum);
            no= no/10;
            System.out.println(no);
        }
        if (sum == no){
            System.out.println("Perfect no");
        }
        else {
            System.out.println("Not Perfect");
        }

    }
    }

