package com;

public class ForEach {


    public static void main(String[] args) {

//        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8};
//
//        for (int i : ints) {
//            System.out.println(i);
//        }

        int[] tab = new int[101];
        for (int i = 0; i <= 100; i++) {
            tab[i] = i;
        }

        for (int i : tab) {
            System.out.println(i*2);
        }
    }
}
