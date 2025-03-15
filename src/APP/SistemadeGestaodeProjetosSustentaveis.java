package APP;

import Sistema.Organizacoes;
import Projetos.ProjetoSustentavel;
import Sistema.Voluntario;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemadeGestaodeProjetosSustentaveis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Organizacoes organizacoes = new Organizacoes("Padrão", new ArrayList<>());

        System.out.println("--------------App De Gestão De Projetos Sustentaveis--------------");

        System.out.print("Digite a Ong que você deseja cadastrar: ");
        String ong = input.nextLine();

        System.out.print("Agora o nome da Empresa: ");
        String empresa = input.nextLine();

        System.out.println("CNPJ da Empresa: ");
        String cnpj = input.nextLine();
        System.out.println(" ");

        while (true){
            System.out.println("Empresam cadastrada!!");
            System.out.println(" ");
            System.out.println("Que Projeto você deseja participar");
        }


    }
}
