package Projetos;

import Sistema.RelatorioImpacto;
import Sistema.Voluntario;

public class ProjetoEnergiaRenovavel extends ProjetoSustentavel {

    private double energiaGerada;

    public ProjetoEnergiaRenovavel(String nome, String descricao) {
        super(nome, descricao);
    }

    public double getEnergiaGerada() {
        return energiaGerada;
    }

    public void setEnergiaGerada(double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }

    @Override
    public void gerarRelatorioImpacto(double energiaGerada) {
        this.relatorioImpacto = new RelatorioImpacto(energiaGerada);
        for (Voluntario voluntario : voluntarios) {
            System.out.println(voluntario.getNome());
        }
    }

    @Override
    public void calcularImpacto() {
        System.out.println("Impacto: " + energiaGerada + " kWh de energia gerada");
    }
}
