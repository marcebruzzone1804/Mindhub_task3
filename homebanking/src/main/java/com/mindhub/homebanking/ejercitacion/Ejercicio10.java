package com.mindhub.homebanking.ejercitacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {
    public boolean espar(int valor){
        if(valor%2==0){
            return true;
        }else{
            return false;
        }
    }

    protected boolean esprimo(int valor){
        ArrayList<Integer> array = new ArrayList<Integer>();
        if (valor>0 && valor!=1){
            for(int i=valor;i>0;i--){
                if(valor%i==0){
                    array.add(i);
                }
            }
        }
        if(array.toArray().length>2){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        Ejercicio10 ej = new Ejercicio10();
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> pares = new ArrayList<Integer>();
        Scanner var = new Scanner(System.in);
        int valor;
        int primos = 0;
        do {
            System.out.println("Ingrese un numero (cero para terminar):");
            String var1 = var.nextLine();
            valor = Integer.parseInt(var1);
            if (valor != 0) {
                array.add(valor);
            } else {
                break;
            }
        } while (valor != 0);
        for(int i=0;i<array.size();i++){
            int val = array.get(i);
            if(ej.esprimo(val)){
                primos = primos + val;
            }
            if(ej.espar(val)){
                pares.add(val);
            }
        }
        System.out.println("La suma de los numeros primos es: "+Integer.valueOf(primos));
        System.out.println("");
        System.out.println("Numeros pares");
        System.out.println("");
        for(int i=0;i<pares.size();i++){
            int val = pares.get(i);
            System.out.println(Integer.valueOf(val));
        }
    }
}
