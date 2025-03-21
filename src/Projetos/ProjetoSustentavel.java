package Projetos;

import Sistema.RelatorioImpacto;
import Sistema.Voluntario;

import java.util.ArrayList;
import java.util.List;

public abstract class ProjetoSustentavel {

    private String nome;
    private String descricao;
    public ArrayList<Voluntario> voluntarios;
    protected RelatorioImpacto relatorioImpacto;

    public ProjetoSustentavel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.voluntarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public void adicionarVoluntario(Voluntario voluntario) {
        voluntarios.add(voluntario);
    }

    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void gerarRelatorioImpacto() {

    }

    public void exibirRelatorio() {
        if (relatorioImpacto != null) {
            relatorioImpacto.exibirRelatorio();
            calcularImpacto();
        } else {
            System.out.println("Relatório ainda não gerado.");
        }
    }



    public abstract void gerarRelatorioImpacto(double impacto);

    public abstract void calcularImpacto();
}
