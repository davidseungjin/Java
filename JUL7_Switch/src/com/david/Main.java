package com.david;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value ==1){
            System.out.println("Value was 1");
        }else if(value == 2){
            System.out.println("Value was 2");
        }else{
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 1;

        switch(switchValue){
            case 1:
                System.out.println("switchValue was 1");
                break;
            case 2:
                System.out.println("switchValue was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("switchValue should be 3 or 4 or 5");
                break;
            default:
                System.out.println("it was not 1 or 2");
                break;
        }
    }
}
