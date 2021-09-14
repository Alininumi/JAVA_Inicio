package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	private String name;
	
	public Ejercicio2() {
		this.name="";
	}
	
	public String showMe(String nombre){
		
		this.name=nombre;
		
		return  name ;
	}
	

	public static void main(String[] args) {
		
		try(Scanner input = new Scanner(System.in)){
			
			Ejercicio2 valor = new Ejercicio2();
			
			System.out.print("Introduce el nombre: ");
			String nombre =input.next();
			
			valor.showMe(nombre);
			
			System.out.print("Este es el nombre: "+nombre);;
			
			
		}
		
		
	}

}
