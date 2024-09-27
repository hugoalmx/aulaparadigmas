package atividades;

import java.util.ArrayList;
import java.util.List;

public class atividade7 {
	
	static class Escola{
		private String nome;
		private int anofundacao;
		private String rua;
		private List<Professor> professores; //Criando lista de professores
		
		
		//Contrutor para escola
		public Escola(String nome, int anofundacao, String rua) {
			super();
			this.nome = nome;
			this.anofundacao = anofundacao;
			this.rua = rua;
			this.professores = new ArrayList<>(); // Inicializa a lista de professores
		}
		
		 // Método para adicionar um professor à escola
        public void adicionarProfessor(Professor professor) {
            if (!professores.contains(professor)) {
                professores.add(professor);
                professor.adicionarEscola(this); // Adiciona a escola ao professor
            }
				
	}

        public void listarProfessores() {
            System.out.println("Professores da escola " + nome + ":");
            for (Professor p : professores) {
                System.out.println("- " + p.getNome());
            }
        }
        
        public String getNome() {
			// TODO Auto-generated method stub
			return nome;
		}
	}
	
	static class Professor {
        private double salario;
        private String nome;
        private List<Escola> escolas; // Lista de escolas

        public Professor(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
            this.escolas = new ArrayList<>(); // Inicializa a lista de escolas
        }

        // Método para adicionar uma escola ao professor
        public void adicionarEscola(Escola escola) {
            if (!escolas.contains(escola)) {
                escolas.add(escola);
            }
        }

        public String getNome() {
            return nome;
        }

        public void listarEscolas() {
            System.out.println("Escolas onde o professor(a) " + nome + " leciona:");
            for (Escola e : escolas) {
                System.out.println("- " + e.getNome());
                
            }
        }
	}

// Método principal para testar a classe
public static void main(String[] args) {
	
                    // Criando escolas
                    Escola escola1 = new Escola("Escola Primária", 1990, "Rua A");
                    Escola escola2 = new Escola("Escola Secundária", 2000, "Rua B");

                    // Criando professores
                    Professor professor1 = new Professor("Maria", 3000.0);
                    Professor professor2 = new Professor("João", 4000.0);

                    // Associando professores às escolas
                    escola1.adicionarProfessor(professor1);
                    escola1.adicionarProfessor(professor2);
                    escola2.adicionarProfessor(professor1); // Maria leciona em ambas as escolas

                    // Listando professores da Escola Primária
                    escola1.listarProfessores();

                    // Listando escolas do Professor Maria
                    professor1.listarEscolas();
            }
            
     }

