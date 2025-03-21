package Sistema;

import Projetos.ProjetoSustentavel;
import java.util.ArrayList;

public class Ong {

    private String nome;
    private ArrayList<ProjetoSustentavel> listaProjetos;

    public Ong(String nome) {
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
        System.out.println("Ong: " + getNome());
        for (ProjetoSustentavel projeto : listaProjetos) {
            System.out.println("Projeto: " + projeto.getNome());
            System.out.println("Descrição: " + projeto.getDescricao());
        }
    }
}
