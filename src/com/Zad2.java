package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zad2 {
    public static void main(String[] args) {


        int result = 0;

        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0) {
                result += i;
            }
        }
        System.out.println(result);


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                list.add(i);
            }
        }
        list = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list.get(list.size()-1));
    }
}
