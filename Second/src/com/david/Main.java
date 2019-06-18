package com.david;

public class main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 1000;

//        int has a width of 32
        int myMinvalue = -2_147_483_648;
        int myMaxvalue = 2_147_483_647;

//        int error = myMaxvalue + 1; <=== this is error becuase it exceeds integer limit

//        byte has a width of 8
        byte myByteMax = 127;
        byte myByteMin = -128;
        byte asdf = (byte) (myByteMax/myValue);

//        short has a width of 16
        short myShort = 32767;

//        Long has a width of 64 2 to the power of 64.
        long myLong = 100L;

        double asasas = 1.25;

        System.out.println("long value myLong is " + myLong);
        System.out.println("asdf value is " + asdf);
        System.out.println("double value is " + asasas);

        /*
        int is 32 bit (4 bytes),
        float is samely 32bits.
        double is 64bits (8 bytes.)

         */


    }
}
