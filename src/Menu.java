import java.util.Scanner;

public class Menu {

    public int listar;
    public int adicionarTarefa;
    public int buscar;
    public int remover;

    public void menu(){

        ListaDeTarefas adicionaTarefas = new ListaDeTarefas();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("##--Menu da lista de tarefa-##\n\n");
            System.out.print("|------------------------------|\n");
            System.out.print("| Opção 1 - Nova Tarefa        |\n");
            System.out.print("| Opção 2 - Listar Tarefas     |\n");
            System.out.print("| Opção 3 - Remover Tarefas    |\n");
            System.out.print("| Opção 4 - Sair               |\n");
            System.out.print("|------------------------------|\n");
            System.out.print("Digite uma opção: ");
            int opcao = scan.nextInt();

            if (opcao == 4){
                menu();
            }
            switch (opcao){
                case 1:
                    adicionaTarefas.adicionar();
                    break;
                case 2:
                    adicionaTarefas.listarTarefas();
                    break;
                case 3:
                    adicionaTarefas.removerTarefas();
                    break;
                default:
                    System.out.println("Escolha invalida");
            }
        }


    }

}
