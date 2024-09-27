package atividades;

public class atividade6 {
    
    // Classe Motor
    static class Motor {
        private String tipo;
        private int potencia;

        public Motor(String tipo, int potencia) {
            this.tipo = tipo;
            this.potencia = potencia;
        }

        public void ligar() {
            System.out.println("O motor está ligado.");
        }

        public void desligar() {
            System.out.println("O motor está desligado.");
        }
        
        // Método para mostrar informações do motor
        public String informacoes() {
            return "Tipo: " + tipo + ", Potência: " + potencia + " CV";
        }
    }

    // Classe Carro
    static class Carro {
        private String marca;
        private String modelo;
        private Motor motor;  // Composição: Carro tem um Motor
        
        public Carro(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
            this.motor = new Motor("Gasolina", 400); // Instanciando um Motor
        }

        public void ligar() {
            motor.ligar(); // Chama o método ligar da classe Motor
            System.out.println("O carro está pronto para rodar.");
        }

        public void desligar() {
            motor.desligar(); // Chama o método desligar da classe Motor
            System.out.println("O carro foi desligado.");
        }

        // Método para mostrar informações do carro
        public void informacoes() {
            System.out.println("Marca: " + marca + ", Modelo: " + modelo);
            System.out.println("Informações do Motor: " + motor.informacoes());
        }
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Mustang"); // Criando um novo carro
        carro.informacoes(); // Mostra as informações do carro
        carro.ligar(); // Liga o carro
        carro.desligar(); // Desliga o carro
    }
}
