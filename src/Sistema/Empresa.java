package Sistema;

import Projetos.ProjetoSustentavel;
import java.util.ArrayList;

public class Empresa{


    private String nome;
    private String cnpj;
    private ArrayList<ProjetoSustentavel> listaProjetos;


    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.listaProjetos = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void adicionarProjeto(ProjetoSustentavel projeto) {
        listaProjetos.add(projeto);
    }

    public void listarProjetos() {
        System.out.println("Empresa: " + getNome());
        System.out.println("CNPJ: " + getCnpj());
        for (ProjetoSustentavel projeto : listaProjetos) {
            System.out.println("Projeto: " + projeto.getNome());
            System.out.println("Descrição: " + projeto.getDescricao());

        }
    }
}
