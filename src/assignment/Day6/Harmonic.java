package assignment.Day6;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result=0;
        System.out.println("Enter the values u want to print series :");
        int no = sc.nextInt();
            for (int i=1; i<=no; i++){
                result = result + (double)1 / i;
                System.out.print(result + ", ");
            }
        }
    }

