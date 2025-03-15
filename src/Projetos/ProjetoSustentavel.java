package Sistema;

import java.util.ArrayList;

public class ProjetoSustentavel {
    private String nome;
    private String descricao;
    public ArrayList<Voluntario> voluntarios = new ArrayList<>();
    private RelatorioImpacto relatorioImpacto;

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

    public void gerarRelatorioImpacto(int arvoresPlantadas) {
        this.relatorioImpacto = new RelatorioImpacto(arvoresPlantadas);
    }

    public void exibirRelatorio() {
        if (relatorioImpacto != null) {
            relatorioImpacto.exibirRelatorio();
        } else {
            System.out.println("Relatório ainda não gerado.");
        }
    }

}
