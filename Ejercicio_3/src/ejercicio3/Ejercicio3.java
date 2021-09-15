package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	private int numOne;
	private int numTwo;
		
	public Ejercicio3(int valueOne, int valueTwo) {
		
		numOne= valueOne;
		numTwo= valueTwo;
		
	}
	
	public void showValue() {
		int suma=numOne+numTwo;
		
		System.out.print("El valor de la suma es: "+suma);
	}
	
	

	public static void main(String[] args) {
	
			try(Scanner sc = new Scanner(System.in)){
				
				int[] array= new int[2];
				
				
				for(int y=0;y<array.length;y++) {
					System.out.print("Asigna valores: ");
					
					array[y]= sc.nextInt();
					
				}
				
				Ejercicio3 ej= new Ejercicio3(array[0],array[1]);
				
				ej.showValue();
				
			}
		
	}

}
