package com.mindhub.homebanking.ejercitacion;

import java.util.Scanner;

public class Ejercicio3 {
    private int var1;
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int var1 = Integer.parseInt(var.nextLine());
        if(var1%2==0){
            System.out.println(var1+" es numero par");
        }else{
            System.out.println(var1+" no es numero par");
        }
    }
}
