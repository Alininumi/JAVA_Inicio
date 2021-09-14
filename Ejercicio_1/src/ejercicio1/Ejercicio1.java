package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	
	public int numUno= 0;
	public int numDos= 0;

	public Ejercicio1() {	
	}
	
	public int suma() {
		
		return numUno+numDos; 
	
	}

	
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			Ejercicio1 valores= new Ejercicio1();
			
			
			System.out.print("Introduce los dos numeros para sumarlos..");
			
			valores.numUno=input.nextInt(); 
			valores.numDos=input.nextInt();
			
			System.out.print("El resultado es: "+valores.suma());
		}
		catch(Exception e) {
			System.out.print("Error");
		}
		
		
	}

}
