package com.generation;

import java.util.Scanner;

public class Codigo4
{
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in); //Se agrego argumento faltante y se importo Scanner

    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = scanner.nextLine();
    //Declaracion repetida de Scanner
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j2 = scanner.nextLine();
    //Variable sin uso eliminada
    if (j1 == j2)
    {
    System.out.println("Empate");
    }
    else
    {
        int g = 2;
        switch(j1)
        {
            case "piedra":
                if (j2 == "tijeras")
                {
                    g = 1;
                }
                break; //break faltante
        case "papel":
            if (j2 == "piedra") //Compara referencias, no es recomendado
            {
                g = 1;
            } // Llave de cierre faltante
                break;  //break faltante
        case "tijera":
              if (j2.equals("papel")) //compara contenido de las cadenas, recomendado
              {
                 g = 1;
              }
                    break;
            default:
        }
            System.out.println("Gana el jugador " + g);
        }
    }
}
