package atividades;

public class atividade10 {
	
	static class Calculadora{
		   // Método para somar dois números
	    public double somar(double a, double b) {
	        return a + b;
	    }

	    // Método para somar três números
	    public double somar(double a, double b, double c) {
	        return a + b + c;
	    }		
			    
	    // Método principal para testar a classe
	    public static void main(String[] args) {
	        Calculadora calc = new Calculadora();

	        // Somando dois números
	        double resultado1 = calc.somar(5, 10);
	        System.out.println("Resultado da soma de dois números: " + resultado1);

	        // Somando três números
	        double resultado2 = calc.somar(5, 10, 15);
	        System.out.println("Resultado da soma de três números: " + resultado2);
	    }
	}
}
	


