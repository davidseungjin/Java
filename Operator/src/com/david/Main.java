package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2;
        result += 5;
        System.out.println(result);

        result *= 5;
        System.out.println(result);
        result *= 2;
        System.out.println(result);
        result /= 2;
        System.out.println(result);
        result -= 5;
        System.out.println(result);
        result--;
        System.out.println(result);

        if(result < 50 && result > 10)
            System.out.println("result is between 10 and 50");
        else
            System.out.println("result is less than or equal to 10, or greater than or equal to 50");

        if(result < 50 || result > 10)
            System.out.println("result is less than 10 or greater than 50");
        else
            System.out.println("result is nor less than 10 nor greater than 50");

    }
}
