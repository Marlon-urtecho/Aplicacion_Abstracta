package aplicacionReservaciones;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

        String nombre;
        int cantidadPersonas;
        int tipoHabitacion;
        boolean habitacionOcupada;
        
  System.out.print("Ingrese el nombre del huésped: ");
  nombre = scanner.nextLine();
        
//Dando valor a las varibles atraves de los metodos 
    cantidadPersonas = obtenerEnteroValidado(scanner, "Ingrese la cantidad de personas: ");
    tipoHabitacion = obtenerEnteroValidado(scanner, "Ingrese el tipo de habitación (1: Sencilla, 2: Doble, 3: Triple): ");
        
//validando tipo de habitacion 
 while (tipoHabitacion < 1 || tipoHabitacion > 3) {
           
        	System.out.println("Tipo de habitación inválido. Por favor, ingrese un valor válido (1, 2 o 3).");
            
        	tipoHabitacion = obtenerEnteroValidado(scanner, "Ingrese el tipo de habitación (1: Sencilla, 2: Doble, 3: Triple): ");
  }

   habitacionOcupada = obtenerBooleanoValidado(scanner, "¿La habitación está ocupada? (true/false): ");
 
 //instanciamos objeto de huespedesHabitaciones
  HuespedHabitaciones huesped = new HuespedHabitaciones(nombre, cantidadPersonas, tipoHabitacion, habitacionOcupada);
  huesped.presupuestarEstadia();//llamamos ala funcion 

 }

private static int obtenerEnteroValidado(Scanner scanner, String mensaje) {
       
    	int numero;
        boolean entradaValida = false;
        
        do {
            System.out.print(mensaje);
            try {
                
            	numero = Integer.parseInt(scanner.nextLine());
                entradaValida = true;
            
            } catch (NumberFormatException e) {
               
            	System.out.println("Ingrese un número válido.");
                entradaValida = false;
                numero = 0;
                
            }
        
        } while (!entradaValida);
        return numero;
   
}

private static boolean obtenerBooleanoValidado(Scanner scanner, String mensaje) {
        
    	boolean valor;
        boolean entradaValida = false;
       
        do {
            System.out.print(mensaje);
            String entrada = scanner.nextLine().toLowerCase();
            
            if (entrada.equals("true")) {
                valor = true;
                entradaValida = true;
           
            } else if (entrada.equals("false")) {
                valor = false;
                entradaValida = true;
           
            } else {
                System.out.println("Ingrese 'true' o 'false'.");
                entradaValida = false;
                valor = false;
            }
        
        } while (!entradaValida);
        return valor;
        
        
        
    }
}
