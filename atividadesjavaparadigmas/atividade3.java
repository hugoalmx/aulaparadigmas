package atividades;

public class atividade3 {
	
	//Implementando a classe ContaBancária
	
	public static class Contabancaria{
		//Atributos saldo e titular
		String titular;
		//Encapsulando saldo
		private double saldo;
		
		
		//Construtor padrão
		public Contabancaria(String titular, double saldo) {
			this.saldo = saldo;
			this.titular = titular;
			
		}
		
		
		//Getter para saldo
		
		public double getSaldo() {
			return saldo;
		}


		//Metodo depositar 
		public void Depositar(double quantidade) {
			saldo += quantidade;
			System.out.println("Depósito feito com sucesso! \nAgora o saldo é: " + this.saldo );
			
		}
		
		//Metodo sacar
		public String Sacar(double quantidade) {
			
			if (saldo < quantidade) {
					return "saldo insuficiente";
			}
			else {
				saldo -= quantidade;
				return "Saque realizado com sucesso! Saldo restante: " + saldo;
			
			}
		}
						
		
		  public static void main(String[] args) {
		        // Criando uma conta bancária
		        Contabancaria conta = new Contabancaria("João", 1000.0);

		        // Fazendo um depósito
		        conta.Depositar(200.0);

		        // Tentando sacar mais do que o saldo disponível
		        System.out.println(conta.Sacar(1500.0));  // Deve exibir "Saldo insuficiente"

		        // Realizando um saque bem-sucedido
		        System.out.println(conta.Sacar(500.0));  // Deve exibir "Saque realizado com sucesso! Saldo restante: 700.0"
		        
		        // Acessando o saldo diretamente através do método getter
		        System.out.println("Saldo atual: " + conta.getSaldo()); // Exibe o saldo atual
		  
		  }
		}
}