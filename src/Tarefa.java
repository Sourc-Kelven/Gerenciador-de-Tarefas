
public class Tarefa {

    public String titulo;
    public String descricao;
    public String status;

    public Tarefa(String titulo, String descricao, String status){
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public String getStatus(){
        return status;
    }


    public String toString(){
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}
