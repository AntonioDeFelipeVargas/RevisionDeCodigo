package com.generation;

import java.util.Scanner;

public class Codigo6 {
    public static void main(String[] args) { //main faltante
        Scanner scanner = new Scanner(System.in);//Scanner faltaba
        int[] n = new int[20];//Correccion a la declaracion del array de tipo int

        for (int i = 0; i < 20; i++)
        {
            n[i] = (int) (Math.random() * 381) + 20;
            System.out.print(n[i] + " ");       //Correccion de errores en System.out.print
        }

        System.out.println("\n¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");

        int opcion = Integer.parseInt(scanner.nextLine()); //Correccion del parse

        int multiplo = (opcion == 1) ? 5 : 7; //Correcion del operador ternario

        for (int e : n) //Correcion de la condicional
        {
            if (e % multiplo == 0)
            {
                System.out.print("[" + e + "] ");
            }
	       else
           {
               System.out.print(e + " ");
           }
        }
    }
}               //faltaban llaves
