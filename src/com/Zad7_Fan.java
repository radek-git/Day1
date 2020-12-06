package com;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Zad7_Fan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sets = Integer.parseInt(scanner.nextLine());
        int[] tab = new int[sets];
        for(int i =0;i<sets;i++){
            tab[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int j =0 ; j<sets;j++){
            Fan fan = new Fan(sets,tab[j]);
        }

    }
}

class Fan {
    Scanner scanner = new Scanner(System.in);
    private int sets;
    private int fanSize;

    public Fan(int sets,int fanSize) {
        this.sets = sets;
        this.fanSize = fanSize;
        fanMaker(fanSize);
    }

    public void fanMaker(int fanSize) {

        int charSize = abs(fanSize);
        char[][] tab = new char[2 * charSize][2 * charSize];
        if (fanSize >= 0) {
            for (int j = 0; j < 2 * fanSize; j++) {
                tab[j] = new char[200];
                for (int k = 0; k < 2 * fanSize; k++) {
                    if (k == j || k + j == 2 * fanSize - 1 || (j < fanSize && k < fanSize && j > k) || (j < fanSize && k >= fanSize && j < 2 * fanSize - 1 - k)
                            || (j >= fanSize && k < fanSize && k > 2 * fanSize - 1 - j) || (j >= fanSize && k >= fanSize && j < k))
                        tab[j][k] = '*';
                    else tab[j][k] = '.';

                    System.out.print(tab[j][k]);
                }
                System.out.println();
            }

        }else
            for (int j=0; j<2*charSize; j++)
            {
                tab[j]=new char [200];
                for (int k=0; k<2*charSize; k++)
                {
                    if (k==j || k+j==2*charSize-1 || (j<charSize && k<charSize && k>j)|| (j<charSize && k>=charSize && k>2*charSize-1-j)
                            || (j>=charSize && k<charSize && j<2*charSize-1-k) || (j>=charSize && k>=charSize && j>k))
                        tab[j][k]= '*' ;
                    else tab[j][k]='.';

                    System.out.print(tab[j][k]);
                }
                System.out.println();
            }
        System.out.println();
    }
}
