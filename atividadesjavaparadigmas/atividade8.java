package atividades;

import java.util.ArrayList;
import java.util.List;

public class atividade8 {
	
	static class Empresa{
		String nome;
		List<Empregado> empregados;
		
		public Empresa(String nome) {
			
			this.nome = nome;
			this.empregados = new ArrayList<>();
		}
		
		 // Método para adicionar um empregado
        public void adicionarEmpregado(Empregado empregado) {
            empregados.add(empregado);
        }
		
         // Método para listar os empregados
        public void listarEmpregados() {
            System.out.println("Empregados da empresa " + nome + ":");
            for (Empregado e : empregados) {
                System.out.println("- Nome: " + e.nome + ", Cargo: " + e.cargo + ", Salário: R$ " + e.salario);
            }
        }
	}
	
	static class Empregado{
		String nome;
		String cargo;
		double salario;
		
		public Empregado(String nome, String cargo, double salario) {
			super();
			this.nome = nome;
			this.cargo = cargo;
			this.salario = salario;
		}

		// Método principal para testar a classe
		public static void main(String[] args) {
		    // Criando a primeira empresa
		    Empresa empresa1 = new Empresa("Tech Solutions");

		    // Criando empregados para a primeira empresa
		    Empregado empregado1 = new Empregado("Ana", "Desenvolvedora", 5000.0);
		    Empregado empregado2 = new Empregado("Carlos", "Gerente de Projetos", 7000.0);
		    
		    // Adicionando empregados à primeira empresa
		    empresa1.adicionarEmpregado(empregado1);
		    empresa1.adicionarEmpregado(empregado2);
		    
		    // Listando os empregados da primeira empresa
		    empresa1.listarEmpregados();

		    // Criando a segunda empresa
		    Empresa empresa2 = new Empresa("Creative Solutions");

		    // Criando empregados para a segunda empresa
		    Empregado empregado3 = new Empregado("Maria", "Designer", 4000.0);
		    Empregado empregado4 = new Empregado("Pedro", "Analista de Sistemas", 6000.0);
		    
		    // Adicionando empregados à segunda empresa
		    empresa2.adicionarEmpregado(empregado3);
		    empresa2.adicionarEmpregado(empregado4);
		    
		    // Listando os empregados da segunda empresa
		    empresa2.listarEmpregados();
		}

		
	}
	
	

}
