package atividades;

public class atividade1 {
	
	public static class Carro{
	 int ano;
	    String marca;
	    String modelo;

	    public Carro(int ano, String marca, String modelo){
	        this.ano = ano;
	        this.marca = marca;
	        this.modelo = modelo;
	    }
	}
	
	 public static void main(String[] args) {
	        // Instanciando três objetos da classe Carro
	        Carro carro1 = new Carro(1996, "Chevrolet", "Celta");
	        Carro carro2 = new Carro(2010, "Fiat", "Palio");
	        Carro carro3 = new Carro(2020, "Volkswagen", "Gol");

	        // Exibindo os detalhes de cada carro
	        System.out.println("Carro 1: Ano " + carro1.ano + ", Marca: " + carro1.marca + ", Modelo: " + carro1.modelo);
	        System.out.println("Carro 2: Ano " + carro2.ano + ", Marca: " + carro2.marca + ", Modelo: " + carro2.modelo);
	        System.out.println("Carro 3: Ano " + carro3.ano + ", Marca: " + carro3.marca + ", Modelo: " + carro3.modelo);
	    }
	}
