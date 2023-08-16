package com.mindhub.homebanking.ejercitacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    protected boolean esprimo(int valor){
        //establecemos un array con los numeros por los cuales el resto se hace cero
        ArrayList<Integer> array = new ArrayList<Integer>();
        //comprobamos que el numero sea mayor a cero y distinto de 1
        if (valor>0 && valor!=1){

            //hacemos un for, que vaya desde el valor hasta cero, y obtenemos el resto de cada uno de los valores
            for(int i=valor;i>0;i--){
                //veo si el resto del valor ingresado dividido el valor de i da 0
                if(valor%i==0){
                    array.add(i);
                }
            }
        }
        //despues de toda esta galleta, compruebo el tamaño del array, en el caso que sea mayor a 2 el numero no es primo
        if(array.toArray().length>2){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        Ejercicio8 ej = new Ejercicio8();
        Scanner var = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int var1 = Integer.parseInt(var.nextLine());
        if(ej.esprimo(var1)){
            System.out.println("el numero ingresado es primo");
        }else{
            System.out.println("el numero ingresado no es primo");
        }
    }
}
