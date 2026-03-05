package com.hmtc.practice;

//import com.hmtc.practice.ejercicios.Ejercicio;
//import com.hmtc.practice.ejercicios.EjercicioOperaciones01;
import com.hmtc.practice.ejercicios.BinarySearch;

public class Main {
    public static void main (String[] args){
        //HMTC: Instancia de Ejercicio
        //Ejercicio ejercicio = new EjercicioOperaciones01();
        //ejercicio.ejecutar();

        int[] nums = {1, 4, 7, 9, 13, 20};
        int target = 9;
        int indice = BinarySearch.binarySearch(nums, target);
        System.out.println("El indice de la búsqueda es: " + indice);
        
    }
}
