package APP;

import Sistema.Organizacoes;
import Sistema.ProjetoSustentavel;
import Sistema.RelatorioImpacto;
import Sistema.Voluntario;

import java.util.Scanner;

public class SistemadeGestaodeProjetosSustentáveis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Organizacoes organizacoes = new Organizacoes();

        System.out.print("Digite o nome da Organização: ");
        String nomeorg = input.nextLine();

        System.out.print("Digite o nome do Projeto: ");
        String nomeproj = input.nextLine();


        System.out.print("Digite uma Descrição ao Projeto: ");
        String descProj = input.nextLine();

        System.out.print("Digite o nome do voluntario: ");
        String nomeVolun = input.nextLine();

        System.out.print("Digite o email do voluntario: ");
        String emailVolun = input.nextLine();

        System.out.print("Quantas árvores foram plantadas: ");
        int arvoresPlantadas = input.nextInt();
        input.nextLine();

        System.out.print("Qual foi a diminuição de CO2: ");
        int diminuicaoCO2 = input.nextInt();
        System.out.println(" ");
        ProjetoSustentavel projeto = new ProjetoSustentavel(nomeproj, descProj);

        organizacoes.setNome(nomeorg);

        organizacoes.adicionarProjeto(projeto);

        Voluntario voluntario = new Voluntario(nomeVolun, emailVolun);

        voluntario.participarProjeto(projeto);

        projeto.gerarRelatorioImpacto(arvoresPlantadas, diminuicaoCO2);

        organizacoes.listarProjetos();

        projeto.exibirRelatorio();





    }
}
