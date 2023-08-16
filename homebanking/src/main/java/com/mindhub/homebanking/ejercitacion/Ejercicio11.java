package com.mindhub.homebanking.ejercitacion;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        String var1;
        do {
            System.out.println("Ingrese '1' para realizar una suma (cero para terminar):");
            System.out.println("Ingrese '2' para realizar una resta (cero para terminar):");
            System.out.println("Ingrese '3' para realizar una multiplicacion (cero para terminar):");
            System.out.println("Ingrese '4' para realizar una division (cero para terminar):");
            var1 = var.nextLine();
            if(Integer.parseInt(var1)==1){
                System.out.println("Usted ingresó la opcion de suma");
            }
            if(Integer.parseInt(var1)==2){
                System.out.println("Usted ingresó la opcion de resta");
            }
            if(Integer.parseInt(var1)==3){
                System.out.println("Usted ingresó la opcion de Multiplicación");
            }
            if(Integer.parseInt(var1)==4){
                System.out.println("Usted ingresó la opcion de División");
            }
        } while (Integer.parseInt(var1) != 0);
        System.out.println("Usted ingresó '0'");
    }
}
