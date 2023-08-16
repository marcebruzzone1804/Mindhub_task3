package com.mindhub.homebanking.ejercitacion;

import java.util.Scanner;

public class Ejercicio7 {
    public String espar(int valor){
        String mensaje;
        if(valor%2==0){
            mensaje="Es par";
        }else{
            mensaje="No es par";
        }
        return mensaje;
    }

    public static void main(String[] args) {
        Ejercicio7 ej = new Ejercicio7();
        Scanner var = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int var1 = Integer.parseInt(var.nextLine());
        System.out.println(ej.espar(var1));
    }
}
