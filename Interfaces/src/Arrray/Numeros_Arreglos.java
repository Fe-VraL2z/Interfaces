package Arrray;

import java.util.Scanner;

public class Numeros_Arreglos {
    public static void main(String[] args) {
        int[] Numeros = new int[10];
        Scanner sc = new Scanner(System.in);
        int Mayor = 0;

        System.out.println("escribe 10 numeros mayores oue 0" );
        for (int i = 0;i<10;i++) {
            System.out.println("Doma el numero " + (i+1));
            Numeros[i] = sc.nextInt();
        }


        for (int i =0;i<10;i++) {
            if (Numeros[i] > ++Mayor){
                Mayor = Numeros [i];

        }
        }
        System.out.println("El numero mayor es "+ Mayor);
        }

    }

