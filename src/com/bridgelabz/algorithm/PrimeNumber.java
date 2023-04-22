package com.bridgelabz.algorithm;

import java.util.Scanner;

public class PrimeNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PrimeNumber prime = new PrimeNumber();
        prime.primeMethod();
    }

    public void primeMethod() {
        System.out.println("PrimeNumber series is :");
        System.out.println("Enter the lower limit");
        int a = scanner.nextInt();
        System.out.println("Enter the upper limit");
        int b = scanner.nextInt();
        for (int i = a; i < b; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
