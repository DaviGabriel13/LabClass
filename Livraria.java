import java.util.Scanner;

public class Livraria {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Livro[] livros = new Livro[50];
        int quantidade = 0;
        int opcao;

        do {
            System.out.println("\nLIVRARIA");
            System.out.println("1 - Inserir novo livro");
            System.out.println("2 - Listar todos os livros cadastrados");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {

                case 1:
                    if (quantidade < 50) {

                        System.out.println("\nCadastro de Livro");

                        System.out.print("Nome: ");
                        String nome = entrada.nextLine();

                        System.out.print("Autor: ");
                        String autor = entrada.nextLine();

                        System.out.print("Ano: ");
                        int ano = entrada.nextInt();
                        entrada.nextLine();

                        System.out.print("Descrição: ");
                        String descricao = entrada.nextLine();

                        System.out.print("Preço: ");
                        int preco = entrada.nextInt();
                        entrada.nextLine();

                        livros[quantidade] = new Livro(
                                nome,
                                autor,
                                ano,
                                descricao,
                                preco
                        );

                        quantidade++;

                        System.out.println("\nLivro cadastrado com sucesso!");

                    } else {
                        System.out.println("\nNão é possível cadastrar mais livros.");
                        System.out.println("Limite máximo de 50 livros atingido.");
                    }
                    break;

                case 2:
                    System.out.println("\nLivros Cadastrados");

                    if (quantidade == 0) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {

                        for (int i = 0; i < quantidade; i++) {

                            System.out.println("\nLivro " + (i + 1));
                            System.out.println("Nome: " + livros[i].nome);
                            System.out.println("Autor: " + livros[i].autor);
                            System.out.println("Ano: " + livros[i].ano);
                            System.out.println("Descrição: " + livros[i].descricao);
                            System.out.println("Preço: R$ " + livros[i].preco);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nPrograma encerrado.");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }

        } while (opcao != 3);

        entrada.close();
    }
}