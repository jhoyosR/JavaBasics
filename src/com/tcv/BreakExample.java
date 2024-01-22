package com.tcv;

public class BreakExample {
    public static void main(String[] args) {
        // Ciclo for que imprime números hasta que encuentra el valor 3
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Found the value 3. Finishing the loop.");
                break;  // Sale del ciclo cuando i es igual a 3
            }
            System.out.println(i);
        }
    }

}
