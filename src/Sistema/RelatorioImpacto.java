package Sistema;

public class RelatorioImpacto {
    private double impacto;
    public int carbonoPorArvore = 20;

    public RelatorioImpacto(double impacto) {
        this.impacto = impacto;
    }

    public double getImpacto() {
        return impacto;
    }

    public void exibirRelatorio() {
        System.out.println("---------- Relatório de Impacto -----------");
        System.out.println("Impacto: " + impacto + " unidades.");

    }
}
