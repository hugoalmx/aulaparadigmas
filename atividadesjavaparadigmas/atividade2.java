package atividades;

public class atividade2 {
	
	public static class Carro{
		
		 	int ano;
		    String marca;
		    String modelo;
  		    int velocidade;
		   
  		    
  		  public Carro(int ano, String marca, String modelo, int velocidade){
		        this.ano = ano;
		        this.marca = marca;
		        this.modelo = modelo;
		        this.velocidade = velocidade;
		    }
		   	    
		    public int Mostrarvelocidade() {
		    	
		    	return velocidade;
		    }
		    
		    public String Acelerar() {
		        velocidade += 10;
		        return "\nO carro acelerou! e agora a velocidade é: " + velocidade;
		    }
		    
		    public String Freiar() {
		        velocidade -= 10;
		        return "O carro freiou! e agora a velocidade é: " + velocidade;
		    }
		    
		    
		}
		
		 public static void main(String[] args) {
		        // Instanciando três objetos da classe Carro
		        Carro carro1 = new Carro(1996, "Chevrolet", "Celta", 80);
		        Carro carro2 = new Carro(2010, "Fiat", "Palio", 90);
		        Carro carro3 = new Carro(2020, "Volkswagen", "Gol", 10);

		        // Exibindo os detalhes de cada carro
		        System.out.println("Carro 1: Ano " + carro1.ano + ", Marca: " 
		        + carro1.marca + ", Modelo: " + carro1.modelo + " Velocidade: " + carro1.velocidade);
		        System.out.println("Carro 2: Ano " + carro2.ano + ", Marca: " 
		        + carro2.marca + ", Modelo: " + carro2.modelo + " Velocidade: " + carro2.velocidade);
		        System.out.println("Carro 3: Ano " + carro3.ano + ", Marca: " 
		        + carro3.marca + ", Modelo: " + carro3.modelo + " Velocidade: " + carro3.velocidade);
		        
		        
		        System.out.println("Vamos Acelerar o Celtinha!" +  carro1.Acelerar());
		        System.out.println("Vamos Freiar o Celtinha!" +  carro3.Freiar());

		        System.out.println("Vamos Acelerar o Palio!" +  carro2.Acelerar());
		        System.out.println("Vamos Freiar o Palio!" +  carro2.Freiar());
		        
		        
		        System.out.println("Vamos Acelerar o Gol!" +  carro3.Acelerar());
		        System.out.println("Vamos Freiar o Gol!" +  carro3.Freiar());
		        
		        System.out.println(carro1.Mostrarvelocidade());
		        
		    }
		 
		}