package com.generation;

import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class Codigo5 {

    public static void main(String[] args) { //main agregado
    Scanner scanner = new Scanner(System.in);//Completar importacion e instanciacion de Scanner
    System.out.print("Introduzca un número:");
    int ni = Integer.parseInt(scanner.nextLine());//Parse String into Int
    int c = ni;
    int afo = 0;
    int noAfo = 0;
	    while (ni > 0) {
        int digito = (int)(ni % 10);
        if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9))
        {
            afo++;
        } else {
            noAfo++;
        }
        ni /= 10;   //Condicion fuera del else para que se realice sin ciclarse, condicion de salida
        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");//Correccion de println
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }
    }
  scanner.close(); //Cierre de Scanner
  }
}
