package com.mindhub.homebanking.ejercitacion;

import java.util.Scanner;

public class Ejercicio2 {
    private int val1;
    private int val2;
    private int val3;

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int var1 = Integer.parseInt(var.nextLine());
        System.out.println("Ingrese otro numero entero:");
        int var2 = Integer.parseInt(var.nextLine());
        System.out.println("Ingrese el último numero:");
        int var3 = Integer.parseInt(var.nextLine());

        if(var1 > var2 && var1 > var3){
            System.out.println("el numero mas grande es: "+ var1);
        }
        if(var2 > var1 && var2 > var3){
            System.out.println("el numero mas grande es: "+ var2);
        }
        if(var3 > var1 && var3 > var2){
            System.out.println("el numero mas grande es: "+ var3);
        }
    }
}
