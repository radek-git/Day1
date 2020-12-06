package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Zad5 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int testNumber = sc.nextInt();

        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < testNumber; i++) {
            int numbers = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < numbers; j++) {
                sum += sc.nextInt();

            }
            results.add(sum);
        }
        System.out.println(results);
    }
}





//    W pierwszym wierszu znajduje się liczba t testów (0 < t < 100) Każdy test opisany jest w następujący sposób. W pierwszym wierszu dana jest liczba n - liczba liczb do zsumowania. Następnie podanych jest n liczb pooddzielanych spacją.
//
//        Przykład
//        Input:
//        2
//        5
//        1 2 3 4 5
//        2
//        -100 100
//
//        Output:
//        15
//        0
