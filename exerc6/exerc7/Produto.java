import java.util.ArrayList;
import java.util.List;

class Produto{
    private String nome;
    private int codigo;
    private double preco;
    private int quantidadeemEstoque;

    public Produto(String nome, int codigo, double preco, int quantidadeemEstoque){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeemEstoque = quantidadeemEstoque;
    }

    public String getNome(){
        return nome;
    }

    public int getCodigo(){
        return codigo;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidadeemEstoque(){
        return quantidadeemEstoque;
    }

    public void setQuantidadeEmEstoque(int qutidade){
        this.quantidadeemEstoque = quantidade;
    }
}