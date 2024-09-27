package atividades;

public class atividade4 {
	
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
	}

	// Classe Cachorro (Subclasse de Animal)
	static class Cachorro extends Animal {
		public Cachorro(String nome) {
			super("Cachorro", nome);
		}

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

		@Override
		public String emitirSom() {
			return "Miau";
		}
	}

	// Teste
	public static void main(String[] args) {
		Animal cachorro = new Cachorro("Rex");
		Animal gato = new Gato("Mimi");

		System.out.println(cachorro.nome + " é um " + cachorro.especie + " e diz: " + cachorro.emitirSom());
		System.out.println(gato.nome + " é um " + gato.especie + " e diz: " + gato.emitirSom());
	}
}
