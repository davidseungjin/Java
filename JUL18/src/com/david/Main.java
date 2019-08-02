package com.david;

public class Main {
    public static boolean isEvenNumber(int abc){
        if ((abc % 2) == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
	// write your code here
        for(int number = 1; number < 7; number += 2){
            System.out.println("number= " + number);
        }
        int initial = 1;
        int finish = 20;
        while(initial <= finish){
            initial++;
            if(!isEvenNumber(initial)){
                continue;
            }
            System.out.println("Even number= " + initial);
        }

        int i = 1;
        int f = 50;
        do{
            i++;
            if(!isEvenNumber(i)){
                continue;
            }
            System.out.println("The second iteration of Even number = " + i);
        }while(i <= f);

        System.out.print(hasSharedDigit(12,13));
    }

    public static boolean hasSharedDigit(int a, int b){
        if(a<10){
            return false;
        }
        if(a>99){
            return false;
        }
        if(b<10){
            return false;
        }
        if(b>99){
            return false;
        }
//        int temp = 0;
        // if (a >= b){
        //     temp = a;
        //     a = b;
        //     b = temp;
        // }
        // int b_temp = b;
        int temp_a = a % 10;
        while(temp_a > 0){
            int temp_b = b;
            while(temp_b > 0){
                temp_b = temp_b % 10;
                if (temp_a == temp_b){
                    return true;
                }
                temp_b = (b - temp_b) / 10;
            }
            temp_a = (a - temp_a) / 10;
        }
        return false;
    }
}
