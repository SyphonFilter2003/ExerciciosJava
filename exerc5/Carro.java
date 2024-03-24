public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("Acelerando. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Valor inválido para aceleração.");
        }
    }

    public void frear(double decremento) {
        if (decremento > 0 && velocidadeAtual >= decremento) {
            velocidadeAtual -= decremento;
            System.out.println("Freando. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Valor inválido para frenagem ou velocidade muito baixa.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}