package com.mindhub.homebanking.ejercitacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {
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
        Ejercicio9 ej = new Ejercicio9();
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner var = new Scanner(System.in);
        int valor;
        int impares = 0;
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
            if(!ej.espar(val)){
                impares = impares + val;
            }
        }
        System.out.println("La suma de los numeros impares es: "+Integer.valueOf(impares));
    }
}