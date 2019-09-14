package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] myIntArray = new int[10];
//        myIntArray[5] = 50;
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < 10 ; i ++){
            System.out.println(myIntArray[i] + "\n");
        }

        double[] myDoubleArray = new double[10];
        myDoubleArray[0] = 1.0;
        System.out.println(myDoubleArray[0]);

        for(int i = 0; i < 10 ; i ++){
            myDoubleArray[i] = i * 0.2;
        }

        for(int i = 0; i < 10 ; i ++){
            System.out.println(myDoubleArray[i] + "\t");
        }

        for(int i = 0; i < myIntArray.length ; i ++){
            System.out.println("This is with new paramether/method int.length");
            System.out.println(myDoubleArray[i] + "\t");
        }


    }
}
