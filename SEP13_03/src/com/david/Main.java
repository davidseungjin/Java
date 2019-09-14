package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagePrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagePrinted + " new total print count for printer = " + pagePrinted);
        pagePrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagePrinted + " new total print count for printer = ");
    }
}
