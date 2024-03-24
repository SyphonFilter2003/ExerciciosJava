import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> estoque = new ArrayList<>();

        while(true){
            System.out.println("Informe o nome do produto (ou digite 'sair para encerrar.'): ");
            String nome = scanner.nextLine();

            if(nome.equalsIgnoreCase("sair")){
                break;
            }

            System.out.println("Informe o código do produto: ");
            int codigo = scanner.nextInt();

            System.out.println("Informe o preco do produto: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Informe a quantidade em estoque: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            Produto novoProduto = new Produto(nome, codigo, preco, quantidade);
            estoque.add(novoProduto);
        }

        System.out.println("\nRelatório de Estoque:");
        for (Produto produto : estoque) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Preço: R$" + produto.getPreco());
            System.out.println("Quantidade em estoque: " + produto.getQuantidadeemEstoque());
            System.out.println("Valor total em estoque: R$" + (produto.getPreco() * produto.getQuantidadeemEstoque()));
            System.out.println();
        }

        scanner.close();
    }
}

