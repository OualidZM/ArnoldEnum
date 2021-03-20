package edu.pingpong.arnoldenum.kata;
import edu.pingpong.arnoldenum.kata.Planeta;


public class ArnoldMain {
	
	 public static void main(String[] args) {
		 
		 double peso = 175.0; // kg
		 
         for(Planeta planeta : Planeta.values()){
        	 System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
         }
         
         System.out.println("\nYour weight only on the terrestrial planets: ");
         for(Planeta planeta: Planeta.getPlanetasTerrestres()){
        	 System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));//que pesa en el "Planeta" y "Nuestro Peso"[array de nuestro peso]
         }
         
         System.out.println("\nYour weight only on the gas giant planets: ");
         for(Planeta planeta: Planeta.getGigantesGaseosos()){
        	 System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));//nuestro peso en el "Planeta" y el "Nuestro Peso" [array Planeta]
         }
	 }

}
