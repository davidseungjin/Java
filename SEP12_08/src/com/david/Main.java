package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.name = "David";
//        player.health = 20;
//        player.weapon = "Swoard";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 300;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("David", 50, "Sword");
        System.out.println("Initial health is " + player.getHitPoints());



    }
}
