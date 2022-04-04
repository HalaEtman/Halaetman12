package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int variable[] = new int[10];

        int k = 0;
        for (int i = variable.length; i >= 1; i--){
            variable[k] = i;
            k++;
        }

        System.out.println("Before: ");
        System.out.print(Arrays.toString(variable));

        int cons = 0;
        int c=0;
        boolean sort = true;
        for (int i = 1; i < variable.length && sort; i++) {
            sort = false;
            for (int j=0; j < variable.length - i; j++) {
                if (variable[j] > variable[j + 1]) {
                    cons = variable[j + 1];
                    variable[j + 1] = variable[j];
                    variable[j] = cons;
                    c++;
                    sort = true;
                }
                c++;
            }
            c++;

        }

        System.out.println("\nAfter: ");
        System.out.print(Arrays.toString(variable));
        System.out.println("\nNo. of actions: " + c);
    }
}
