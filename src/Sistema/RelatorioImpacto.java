package Sistema;



public class RelatorioImpacto implements ImpactoAmbiental{
    private int arvoresPlantadas;
    public int carbonoPorArvore = 20;
    private double reducaoCO2;

    public RelatorioImpacto(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    public void exibirRelatorio() {
        System.out.println("----------Relatório de Impacto-----------");
        System.out.println("Árvores Plantadas: " + arvoresPlantadas);
        System.out.println("Impacto: " + calcularImpacto() + " toneladas de redução de C02");

    }

    @Override
    public double calcularImpacto() {
        return reducaoCO2 = arvoresPlantadas * carbonoPorArvore;
    }
}
