package com.mindhub.homebanking.ejercitacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner var = new Scanner(System.in);
        int valor;
        do {
            System.out.println("Ingrese un numero entero:");
            String var1 = var.nextLine();
            valor = Integer.parseInt(var1);
            if (valor == 0) {
                System.exit(0);
            } else {
                array.add(valor);
            }
        } while (valor != 0);
    }
}
