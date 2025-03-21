package Projetos;

import Sistema.RelatorioImpacto;
import Sistema.Voluntario;

public class ProjetoReciclagem extends ProjetoSustentavel {

    private double toneladasRecicladas;

    public ProjetoReciclagem(String nome, String descricao) {
        super(nome, descricao);
    }

    public double getToneladasRecicladas() {
        return toneladasRecicladas;
    }

    public void setToneladasRecicladas(double toneladasRecicladas) {
        this.toneladasRecicladas = toneladasRecicladas;
    }

    @Override
    public void gerarRelatorioImpacto(double impacto) {
        impacto = toneladasRecicladas * 50;
        (this.relatorioImpacto = new RelatorioImpacto(impacto)).getImpacto();
        for (Voluntario voluntario : voluntarios) {
            System.out.println(voluntario.getNome());
        }
    }

    @Override
    public void calcularImpacto() {
        System.out.println("Impacto: " + toneladasRecicladas + " toneladas recicladas");
    }
}
