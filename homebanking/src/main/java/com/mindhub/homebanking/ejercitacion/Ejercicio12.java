package com.mindhub.homebanking.ejercitacion;

import java.util.Scanner;

public class Ejercicio12 {
    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Ejercicio12 ej = new Ejercicio12();
        Scanner var = new Scanner(System.in);
        String var1;
        do {
            System.out.println("Ingrese '1' para realizar una suma (cero para terminar):");
            System.out.println("Ingrese '2' para realizar una resta (cero para terminar):");
            System.out.println("Ingrese '3' para realizar una multiplicacion (cero para terminar):");
            System.out.println("Ingrese '4' para realizar una division (cero para terminar):");
            var1 = var.nextLine();
            switch (var1) {
                case "1":
                    System.out.println("Usted ingresó la opcion de suma");
                    System.out.println("Ingrese el primer numero a sumar:");
                    int sum1 = Integer.parseInt(var.nextLine());
                    System.out.println("Ingrese el segundo numero a sumar:");
                    int sum2 = Integer.parseInt(var.nextLine());
                    System.out.println("resultado: " + ej.suma(sum1, sum2));
                    break;
                case "2":
                    System.out.println("Usted ingresó la opcion de resta");
                    System.out.println("Ingrese el primer numero a restar:");
                    int res1 = Integer.parseInt(var.nextLine());
                    System.out.println("Ingrese el segundo numero a restar:");
                    int res2 = Integer.parseInt(var.nextLine());
                    System.out.println("resultado: " + ej.resta(res1, res2));
                    break;
                case "3":
                    System.out.println("Usted ingresó la opcion de multiplicación");
                    System.out.println("Ingrese el primer numero a multiplicar:");
                    int mul1 = Integer.parseInt(var.nextLine());
                    System.out.println("Ingrese el segundo numero a multiplicar:");
                    int mul2 = Integer.parseInt(var.nextLine());
                    System.out.println("resultado: " + ej.multiplicacion(mul1, mul2));
                    break;
                case "4":
                    System.out.println("Usted ingresó la opcion de división");
                    System.out.println("Ingrese el dividendo:");
                    int div1 = Integer.parseInt(var.nextLine());
                    System.out.println("Ingrese el divisor:");
                    int div2 = Integer.parseInt(var.nextLine());
                    if (div2 == 0) {
                        System.out.println("Sos Idiota que dividís por cero???");
                    } else {
                        System.out.println("resultado: " + ej.division(div1, div2));
                    }
                    break;
            }
        }
        while (Integer.parseInt(var1) != 0) ;
        System.out.println("Usted ingresó '0'");
    }
}
