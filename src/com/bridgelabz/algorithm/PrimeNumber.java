package com.bridgelabz.algorithm;

import java.util.Scanner;

public class PrimeNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        primeNumber(number);
    }

    static void primeNumber(int number) {
        int temp = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 0)
            System.out.println(number + " is not prime number");
        else
            System.out.println(number + " is prime number");
    }
}
