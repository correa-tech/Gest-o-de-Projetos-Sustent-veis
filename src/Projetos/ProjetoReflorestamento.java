package Projetos;

import Sistema.ImpactoAmbiental;
import Sistema.RelatorioImpacto;
import Sistema.Voluntario;

public class ProjetoReflorestamento extends ProjetoSustentavel implements ImpactoAmbiental {

    private int arvoresPlantadas;

    public ProjetoReflorestamento(String nome, String descricao) {
        super(nome, descricao);
    }

    public int getArvoresPlantadas() {
        return arvoresPlantadas;
    }

    public void setArvoresPlantadas(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    @Override
    public void gerarRelatorioImpacto(double impacto) {
        impacto = arvoresPlantadas * 20; // 20 é o impacto por árvore
        this.relatorioImpacto = new RelatorioImpacto(impacto);
    }

    @Override
    public void calcularImpacto() {
        System.out.println("Impacto: " + arvoresPlantadas + " Árvores plantadas");
    }
}
