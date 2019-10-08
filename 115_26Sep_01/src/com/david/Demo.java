package com.david;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Seoul");
        placesToVisit.add("Tokyo");
        placesToVisit.add("Beijing");
        placesToVisit.add("New York");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Taipei");
        addInOrder(placesToVisit, "Hwasung");
        addInOrder(placesToVisit, "Seoul");

        printList(placesToVisit);
        addInOrder(placesToVisit, "Hwasung");
        addInOrder(placesToVisit, "Seoul");

        printList(placesToVisit);

        placesToVisit.add(1, "PyeongYang");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

        addInOrder(placesToVisit, "Dongtan");
        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
//                equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0){
//                new City should appear before this one
//                Brisbane --> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0){
//                move on next city

            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cites in the itenarary");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday vatation is over");
                    quit = true;
                    break;
                case 1:
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Rached the end of the list");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }else{
                        System.out.println("we are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions\npress ");
        System.out.println("0 - to quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previous city");
        System.out.println("3 - print menu options");
    }









}
