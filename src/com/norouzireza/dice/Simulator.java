package com.norouzireza.dice;

import java.util.Random;

public class Simulator {
    public static void main(String[] args) {
        Random rand = new Random();
        var x = rand.nextInt(6)+1;
        System.out.println(x);
        System.out.println(display(x));

    }
    static String display(int value){
        switch (value){
            case 1 : return "------\n|     |\n|  o  |\n|     |\n------";
            case 2 : return "------\n|     |\n|o   o|\n|     |\n------";
            case 3 : return "------\n|o   o|\n|  o  |\n|     |\n------";
            case 4 : return "------\n|o   o|\n|     |\n|o   o|\n------";
            case 5 : return "------\n|o   o|\n|  o  |\n|o   o|\n------";
            case 6 : return "------\n|o   o|\n|o   o|\n|o   o|\n------";
            default: return  "we don't have schema";
        }
    }
}
