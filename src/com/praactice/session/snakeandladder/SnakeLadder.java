package com.praactice.session.snakeandladder;

import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        Random random = new Random();
        int singlePlayer = 0;
         int dice = random.nextInt(7);
        System.out.println(dice);
        int option = random.nextInt(3);
        switch (option){
            case 0:
                singlePlayer = singlePlayer+dice;
                System.out.println("player moved by"+dice);
                System.out.println("player position"+singlePlayer);
                break;
            case 1:
                singlePlayer = singlePlayer+dice;
                System.out.println("player moved by"+dice);
                System.out.println("player position"+singlePlayer);
                break;
            case 2:
                singlePlayer = singlePlayer+0;
                System.out.println("player moved by"+dice);
                System.out.println("player position"+singlePlayer);
                break;
        }
    }
}
