package org.example;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class SequenceCollection {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.addFirst(0);
        arrayList.addLast(4);

        System.out.println("ARRAY LIST: ");
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());
        System.out.println(arrayList.reversed());

        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.addFirst(0);
        linkedHashSet.addLast(4);

        System.out.println("LINKED HASH SET");
        System.out.println(linkedHashSet.getFirst());
        System.out.println(linkedHashSet.getLast());
        System.out.println(linkedHashSet.reversed());

        LinkedHashMap linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,1);
        linkedHashMap.put(2,2);
        linkedHashMap.put(3,3);

        System.out.println("LINKED HASH MAP");
        System.out.println(linkedHashMap.firstEntry());
        System.out.println(linkedHashMap.lastEntry());
        System.out.println(linkedHashMap.reversed());
        System.out.println(linkedHashMap.sequencedEntrySet());
        System.out.println(linkedHashMap.sequencedValues());
        System.out.println(linkedHashMap.sequencedKeySet());
    }
}
