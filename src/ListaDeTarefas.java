import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    ArrayList<Tarefa> tarefas = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Tarefa adicionar(){

        System.out.println("Digite o titulo da tarefa");
        String titulo = scan.nextLine();
        System.out.println("Digite a descricao da tarefa");
        String descricao = scan.nextLine();;
        System.out.println("Digite o status da tarefa");
        String status = scan.nextLine();

        Tarefa novaTarefa = new Tarefa(titulo, descricao, status);
        tarefas.add(novaTarefa);
        return novaTarefa;

    }

    public void listarTarefas(){
        if (tarefas.isEmpty()){
            System.out.println("Lista de tarefas vazia");
        }else {
            for (int i = 0; i < tarefas.size(); i++){
                Tarefa tarefa = tarefas.get(i);
                System.out.println("Tarefa: " + " " + (i + 1) +":" );
                System.out.println("Titulo da tarefa" + "\n " + tarefa.getTitulo());
                System.out.println("Descricao da tarefa" + "\n " + tarefa.getDescricao());
                System.out.println("Status da tarefa" + "\n " + tarefa.getStatus());
                System.out.println(" ");
                System.out.println(" ");
            }
        }
    }

    public void removerTarefas(){

        if (tarefas.isEmpty()){
            System.out.println("A lista de tarefas esta vazia");
        }else {
            listarTarefas();
            System.out.println("Digite o numero da tarefa que deseja remover: ");
            int indice = scan.nextInt();
            scan.nextLine();


            if (indice > 0 && indice <= tarefas.size()){
                Tarefa removido = tarefas.remove(indice -1);
                System.out.println("Tarefa removida com sucesso");
                System.out.println("Titulo da tarefa removida" + " " +removido.getTitulo());
            }else {
                System.out.println("Indice selecionado e invalido");
            }

        }
    }


}
