package assignment.Day6;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random  = new Random();
        int toss = random.nextInt(2);
        flip(toss);

    }
    public static void flip(int toss){
        System.out.println("Random value get"+toss);
        if (toss<0.5){
            System.out.println("Tails");
        }
        else
            System.out.println("Heads");
    }
}
