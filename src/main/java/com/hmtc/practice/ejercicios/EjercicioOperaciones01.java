package com.hmtc.practice.ejercicios;

import java.util.Scanner;

public class EjercicioOperaciones01 implements Ejercicio {
    @Override
    public void ejecutar(){
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Ingresa el primer numero: ");
        //double a = scanner.nextDouble();

        //System.out.print("Ingresa el segundo numero: ");
        //double b = scanner.nextDouble();

        double a = leerNumeroValido(scanner, "Ingresa el primer numero: ");
        double b = leerNumeroValido(scanner, "Ingresa el segundo numero: ");

        System.out.println("Suma: " + (a+b));
        System.out.println("Resta: " + (a-b));
        System.out.println("Multiplicación: " + (a*b));

        if (b != 0){
            System.out.println("DIvision: " + (a/b));
        }else{
            System.out.println("División no permitida (división por cero)");
        }
    }    

       private double leerNumeroValido(Scanner sc, String mensaje){
        while(true){
            System.out.print(mensaje);

            if (sc.hasNextDouble()){
                return sc.nextDouble();
            }else{
                System.out.println("Ingrese un número válido: ");
                sc.next();
            } 
                
        }

    }
}
