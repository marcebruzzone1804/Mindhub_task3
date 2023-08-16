package com.mindhub.homebanking.ejercitacion;

import java.util.Scanner;

public class Ejercicio1 {
    private String nombre;
    private String apellido;
    private int edad;

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = var.nextLine();
        System.out.println("Ingrese su Apellido:");
        String apellido = var.nextLine();
        System.out.println("Ingrese su edad:");
        String edad = var.nextLine();
        System.out.println("Su nombre y apellido es: "+nombre.toString()+" "+apellido.toString()+" y su edad es: "+edad.toString()+".");
    }
}
