import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    private List<Pizza> pizzas;
    private String enderecoEntrega;
    private boolean cancelado;

    public Pedido() {
        this.pizzas = new ArrayList<>();
        this.cancelado = false;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void fornecerDetalhesPedido() {
        System.out.println("Pizzas no pedido:");
        for (Pizza pizza : pizzas) {
            System.out.println("- " + pizza.getNome() + " (" + pizza.getValor() + ")");
        }
        System.out.println("Endereço de entrega: " + enderecoEntrega);
    }

    public void cancelarPedido() {
        this.cancelado = true;
    }

    public double calcularValorTotalPizzas() {
        double total = 0.0;
        for (Pizza pizza : pizzas) {
            total += pizza.getValor();
        }
        return total;
    }

    // Getters e setters para os atributos
    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public boolean isCancelado() {
        return cancelado;
    }
}
