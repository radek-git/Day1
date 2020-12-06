package com;

import java.util.InputMismatchException;

public class Exception {

    public static void main(String[] args) {

        System.out.println("przed wyjątkiem: ");
        try {
            int a = 2 / 0;
        } catch (ArithmeticException e) {
            System.out.println("dupa" + e.getMessage());

//        } catch (InputMismatchException inputMismatchException) {
//            inputMismatchException.getMessage();
        }
    }
}
