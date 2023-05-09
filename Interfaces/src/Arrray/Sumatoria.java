package Arrray;

import java.util.Arrays;

public class Sumatoria {
    public static void main(String[] args) {
        int [] numeros = { 87 ,68,94,100,83,78,85,91,76,87 };
        int [] ordenados = numeros;
        int sumatoria = 0;

        Arrays.sort(numeros);

        for (int i = 0;i<numeros.length;i++){
            sumatoria = numeros [i];

        }

        System.out.println("Se sumaron "+numeros.length+ "Elementos");
        System.out.println("La sumatoria de los elementos del arreglo es: "+ sumatoria);
        System.out.println(" Los elementos del arreglo ordenados son: "+Arrays.toString(ordenados));
    }
}
