package assignment.Day6;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        leap();
    }
    static void leap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();
        if (year%4 == 0 && year !=100 || year %400 ==0){
            System.out.println(year+"is leap Year");
        }
        else {
            System.out.println(year+"Is not leap year");
        }
    }
}
