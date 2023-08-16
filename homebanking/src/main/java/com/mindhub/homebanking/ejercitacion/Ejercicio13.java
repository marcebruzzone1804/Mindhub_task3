package com.mindhub.homebanking.ejercitacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        double descuento = 1;
        double precio = 0;
        Ejercicio10 ej = new Ejercicio10();
        Scanner var = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Integer> edades = new ArrayList<Integer>();
        ArrayList<Integer> documentos = new ArrayList<Integer>();
        ArrayList<String> pases = new ArrayList<String>();
        ArrayList<Double> pagos = new ArrayList<Double>();
        int capacidad_max = 500;
        String var1;
        String tipo_pase = "";
        do {
            System.out.println("Ingrese '1' para realizar la carga de datos (cero para terminar):");
            System.out.println("Ingrese '2' para ver la capacidad disponible (cero para terminar):");
            System.out.println("Ingrese '3' para ver el dinero recaudado (cero para terminar):");
            var1 = var.nextLine();
            switch (var1) {
                case "1":
                    System.out.println("Usted ingresó la opcion de cargar datos");
                    System.out.println("Ingrese el nombre de la persona:");
                    String nombre = var.nextLine();
                    System.out.println("Ingrese la edad de la persona:");
                    int edad = Integer.parseInt(var.nextLine());
                    if (edad <= 21) {
                        System.out.println("Solo pueden ingresar mayores de 21 años al boliche");
                        break;
                    } else {
                        System.out.println("Ingrese el Dni de la persona:");
                        int dni = Integer.parseInt(var.nextLine());
                        System.out.println("Si la persona posee pase vip, ingrese '1' si posee pase con descuento, ingrese '2'");
                        System.out.println("Si la persona no posee pase, ingrese '3'");
                        int pase = Integer.parseInt(var.nextLine());
                        switch (pase) {
                            case 1:
                                tipo_pase = "vip";
                                descuento = 0;
                                break;
                            case 2:
                                tipo_pase = "descuento";
                                descuento = 0.5;
                                break;
                            case 3:
                                tipo_pase = "ninguno";
                                descuento = 1;
                                break;
                        }
                        System.out.println("Si la persona desea una entrada vip, ingrese '1' si desea una comun, ingrese '2'");
                        int tipo_entrada = Integer.parseInt(var.nextLine());
                        switch (tipo_entrada) {
                            case 1:
                                precio = 2000 * descuento;
                                break;
                            case 2:
                                precio = 1500 * descuento;
                                break;
                        }
                        nombres.add(nombre);
                        edades.add(edad);
                        documentos.add(dni);
                        pases.add(tipo_pase);
                        pagos.add(precio);
                        System.out.println("Bienvenido");
                        break;
                    }
                case "2":
                    int restante = capacidad_max - nombres.size();
                    System.out.println("Capacidad restante : " + restante);
                    break;
                case "3":
                    double total = 0;
                    for (int i = 0; i < pagos.size(); i++) {
                        total = total + pagos.get(i);
                    }
                    System.out.println("total de dinero recaudado :" + String.valueOf(total));
                    break;
            }
        } while (Integer.parseInt(var1) != 0);
    }
}