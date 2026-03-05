package com.hmtc.practice.ejercicios;

public class BinarySearch {
    public static int binarySearch(int [] arr, int target){
        int lo=0;
        int hi = arr.length -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] > target){
                hi = mid - 1; //Busca a la izquierda
            }else {
                lo = mid + 1; //Busca a la derecha
            }
            
        }
        return -1;
    }

}
