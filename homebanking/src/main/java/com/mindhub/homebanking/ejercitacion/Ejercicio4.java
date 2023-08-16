package com.mindhub.homebanking.ejercitacion;

import java.util.Scanner;

public class Ejercicio4 {
    private String cadena1, cadena2;

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres:");
        String cadena1 = var.nextLine();
        System.out.println("Ingrese otra cadena de caracteres:");
        String cadena2 = var.nextLine();
        if(cadena1.equals(cadena2)){
            System.out.println("Ambas cadenas son iguales:");
        }else{
            System.out.println("las cadenas son desiguales:");
        }
    }
}
