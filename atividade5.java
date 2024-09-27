package atividades;

import java.util.ArrayList;
import java.util.List;

public class atividade5 {
	
	// Classe Animal (Superclasse)
	public static class Animal {
		protected String especie;
		protected String nome;

		public Animal(String especie, String nome) {
			this.especie = especie;
			this.nome = nome;
		}

		public String emitirSom() {
			return ""; // Método a ser sobrescrito pelas subclasses
		}
		
		public void informacoes() {
			 System.out.println("Nome: " + nome + ", Espécie: " + especie);
		}
		
		
	}
	
	

	// Classe Cachorro (Subclasse de Animal)
	static class Cachorro extends Animal {
		public Cachorro(String nome) {
			super("Cachorro", nome);
		}
		//Reescrevendo o emitir som para cachorros
		@Override
		public String emitirSom() {
			return "Au Au";
		}
	}

	// Classe Gato (Subclasse de Animal)
	static class Gato extends Animal {
		public Gato(String nome) {
			super("Gato", nome);
		}
		
		//Reescrevendo o emitir som para gatos
		@Override
		public String emitirSom() {
			return "Miau";
		}
	}
	
	//Método para chamar o som de cada um
	public static void mostrarsons(List<Animal> animais) {
		for (Animal animal : animais) {
			animal.informacoes();
			System.out.println(animal.nome + " diz: " + animal.emitirSom()); // Chama o método emitirSom
		}
	}

	// Teste
	public static void main(String[] args) {
		 List<Animal> listaDeAnimais = new ArrayList<>();
	        listaDeAnimais.add(new Cachorro("Rex"));
	        listaDeAnimais.add(new Gato("Mimi"));

	        mostrarsons(listaDeAnimais);
	}
}
