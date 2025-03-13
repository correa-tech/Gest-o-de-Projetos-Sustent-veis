package Sistema;
import java.util.ArrayList;



public class Organizacoes {

    private String nome;
    private ArrayList<ProjetoSustentavel> listaProjetos = new ArrayList<ProjetoSustentavel>();
    ProjetoSustentavel projetoSustentavel = new ProjetoSustentavel("asfas", "sa");


    public void Organizacao(String nome) {
        this.nome = nome;
        this.listaProjetos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarProjeto(ProjetoSustentavel projeto) {
        listaProjetos.add(projeto);
    }

    public void listarProjetos() {
        for (ProjetoSustentavel projeto : listaProjetos) {
            System.out.println(projeto.getNome() + " - " + projeto.getDescricao());
                for (Voluntario voluntario: projeto.voluntarios ){
                    System.out.println("Voluntário: " + voluntario.getNome());
                }
        }
    }
}