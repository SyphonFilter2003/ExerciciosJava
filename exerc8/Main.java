import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pizza margherita = new Pizza("Margherita", 25.0, Arrays.asList("Molho de tomate", "Muçarela", "Manjericão"));
        Pizza pepperoni = new Pizza("Pepperoni", 30.0, Arrays.asList("Molho de tomate", "Muçarela", "Pepperoni"));

        Pedido pedido = new Pedido();
        pedido.setEnderecoEntrega(solicitarEndereco(scanner));

        boolean continuarPedido = true;
        while (continuarPedido) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Margherita");
            System.out.println("2. Pepperoni");
            System.out.println("3. Montar pizza personalizada");
            System.out.println("0. Finalizar pedido");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    pedido.adicionarPizza(margherita);
                    break;
                case 2:
                    pedido.adicionarPizza(pepperoni);
                    break;
                case 3:
                    Pizza pizzaPersonalizada = montarPizzaPersonalizada(scanner);
                    pedido.adicionarPizza(pizzaPersonalizada);
                    break;
                case 0:
                    continuarPedido = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        pedido.fornecerDetalhesPedido();
        System.out.println("Valor total a ser pago: " + pedido.calcularValorTotalPizzas());

        scanner.close();
    }

    private static String solicitarEndereco(Scanner scanner) {
        System.out.print("Informe o endereço de entrega: ");
        return scanner.nextLine();
    }

    private static Pizza montarPizzaPersonalizada(Scanner scanner) {
        System.out.print("Informe o nome da pizza personalizada: ");
        String nomePizza = scanner.next();

        System.out.print("Informe o valor da pizza personalizada: ");
        double valorPizza = scanner.nextDouble();

        System.out.print("Informe os ingredientes da pizza personalizada (separados por vírgula): ");
        String ingredientesInput = scanner.next();
        List<String> ingredientes = Arrays.asList(ingredientesInput.split(","));

        return new Pizza(nomePizza, valorPizza, ingredientes);
    }
}
