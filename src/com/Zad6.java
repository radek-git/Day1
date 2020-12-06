package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int counter = 0;

        int firstNumber = scanner.nextInt();
        list.add(firstNumber);

        do {
            System.out.println("Podaj kolejna liczbe");
            int number = scanner.nextInt();
            list.add(number);

            if (number == 42 && list.get(list.size() - 2) != 42) {
                counter++;
            }
        } while (counter != 3);

        System.out.println(list);

        list.forEach(System.out::println);
    }
}


//PP0601A2 - Test 3
//        Przepisz dane z wejścia na wyjście. Dane wejściowe są dwucyfrowymi liczbami naturalnymi. Zakończ działanie programu, gdy na wejściu pojawi się, trzecia liczba 42 poprzedzona jakąkolwiek inną liczbą, różną od 42.
//
//        Wejście
//        W każdej linii jedna liczba dwucyfrowa.
//
//        Wyjście
//        W każdej linii jedna liczba dwucyfrowa. Odczytane wartości 42 również powinny się pojawić.
//
//        Przykład
//        Wejście:
//        42
//        42
//        12
//        13
//        42
//        11
//        42
//        43
//        42
//        42
//        99
//        01
//        Wyjście:
//        42
//        42
//        12
//        13
//        42
//        11
//        42
//        43
//        42
