package com.generation;

//Falta importar el Scanner para funcionar
import java.util.Scanner;

public class Codigo4 {
	//Falta el metodo Main para ejecutar
	public static void main(String[] args) {
	
	//Falta el System.in
    Scanner s = new Scanner(System.in);
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    //Scanner s2 = new Scanner(); se comenta no tiene utilidad
    String j2 = s.nextLine();
    
    
    if (j1 == j2) { // tiene un parentesis extra
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) { //Se utiliza equals para comparar y evaluar el valor
            g = 1;
          }
          break; // Se añade break
        case "papel":
          if (j2.equals("piedra")) { //Se utiliza equals para comparar y evaluar el valor
            g = 1;
          }	// No tenia cierre de llave
          break; // Se añade break
        case "tijeras": // se completo con una s para que pueda comparar y evaluar tijeras
          if (j2.equals("papel")) { //Se utiliza equals para comparar y evaluar el valor
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  
   }

}