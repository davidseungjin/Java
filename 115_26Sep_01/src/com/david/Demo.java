package com.david;

import java.util.Iterator;
import java.util.LinkedList;

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

        printList(placesToVisit);

        placesToVisit.add(1, "PyeongYang");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===========================");
    }
}
