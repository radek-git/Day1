package com;

import java.util.ArrayList;
import java.util.List;

public class Listy {

    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("Jan");
//        list.add("Anna");
//        list.add("Ewa");
//        System.out.println(list.contains("Anna"));
//
//        System.out.println(list.size());
//
//        list.remove("Anna");
//        System.out.println(list.size());
//        System.out.println(list.contains("Anna"));

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            integers.add(i);
        }


        for (int i = 0; i <= integers.size(); i++) {
            if (i % 2 == 0) {
                integers.set(i, i * 2);
            }
        }

        for (Integer integer : integers) {
            System.out.print(integer+" ");
        }








    }
}
