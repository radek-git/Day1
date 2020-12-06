package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 1; i <= 1000; i++) {
            if (number % i == 0) {
                list.add(i);
            }
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
