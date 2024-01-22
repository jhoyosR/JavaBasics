package com.tcv;

public class ContinueExample {
    public static void main(String[] args) {
        // Ciclo for que imprime solo los números impares
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                // Salta a la siguiente iteración si i es par
                continue;
            }
            System.out.println("Even Number: " + i);
        }
    }
}
