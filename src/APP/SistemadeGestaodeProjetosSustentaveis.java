package APP;

import Projetos.ProjetoEnergiaRenovavel;
import Projetos.ProjetoReciclagem;
import Projetos.ProjetoReflorestamento;
import Sistema.Empresa;
import Sistema.Ong;
import Sistema.Organizacoes;
import Sistema.Voluntario;
import java.util.Scanner;

public class SistemadeGestaodeProjetosSustentaveis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Exibição inicial
        System.out.println("--------------App De Gestão De Projetos Sustentaveis--------------");


        // Coletando informações da ONG e Empresa
        System.out.println("Qual Cadastro está sendo feito? ");
        System.out.println("1- ONG");
        System.out.println("2- Empresa");
        System.out.print("Digite aqui: ");
        int opcaoCadastral = input.nextInt();
        input.nextLine();


        switch (opcaoCadastral) {

            case 1:
                System.out.println("Digite o nome da Organização");
                String nomeOrga = input.nextLine();

                System.out.println("Digite o nome da ONG: ");
                String NomeOng = input.nextLine();

                Ong ong = new Ong(NomeOng);


                Organizacoes organizacoes = new Organizacoes(nomeOrga, null, ong);


                while (true) {

                    System.out.println(" ");
                    System.out.println("------------------------");
                    System.out.println("ONG cadastrada!!");
                    System.out.println("Opções: 1 - Cadastrar Projeto");
                    System.out.println("Opções: 2 - Consultar Projetos");
                    System.out.println("Opções: 3 - Sair");
                    int opcao = input.nextInt();

                    input.nextLine(); // Limpar o buffer

                    System.out.println(" ");

                    if (opcao == 1) {
                        // Menu para cadastrar projeto
                        System.out.println("--------------------");
                        System.out.println("Escolha um Projeto para cadastrar: ");
                        System.out.println("Opções: 1 - Projeto Reflorestamento");
                        System.out.println("Opções: 2 - Projeto Energia Renovável");
                        System.out.println("Opções: 3 - Projeto Reciclagem");
                        System.out.println("Opções: 4 - Voltar");
                        int opc = input.nextInt();
                        input.nextLine(); // Limpar o buffer

                        System.out.println(" ");

                        if (opc == 1) {
                            // Projeto Reflorestamento
                            System.out.println("---------Projeto Reflorestamento---------");

                            System.out.print("Digite o nome do Projeto: ");
                            String nomeProjReflorestamento = input.nextLine();
                            System.out.print("Digite a descrição do Projeto: ");
                            String descricaoProjReflorestamento = input.nextLine();
                            System.out.print("Digite o nome do Voluntário: ");
                            String nomeVolun = input.nextLine();
                            System.out.print("Digite o Email do Voluntário: ");
                            String emailVolun = input.nextLine();
                            System.out.print("Digite o total de árvores plantadas: ");
                            int arvoresPlantadas = input.nextInt();
                            input.nextLine(); // Limpar o buffer

                            Voluntario voluntario = new Voluntario(nomeVolun, emailVolun);

                            // Criando o projeto
                            ProjetoReflorestamento projetoReflorestamento = new ProjetoReflorestamento(nomeProjReflorestamento, descricaoProjReflorestamento);
                            voluntario.setNome(nomeVolun);
                            organizacoes.adicionarVoluntarios(voluntario);
                            organizacoes.adicionarProjeto(projetoReflorestamento);
                            voluntario.participarProjeto(projetoReflorestamento);
                            projetoReflorestamento.setArvoresPlantadas(arvoresPlantadas);
                            projetoReflorestamento.gerarRelatorioImpacto(arvoresPlantadas);
                            projetoReflorestamento.exibirRelatorio();
                            System.out.println("Projeto Cadastrado");
                            System.out.println(" ");

                        } else if (opc == 2) {
                            // Projeto Energia Renovável
                            System.out.println("---------Projeto Energia Renovável---------");

                            System.out.print("Digite o nome do Projeto: ");
                            String nomeProjEnergiaRenovavel = input.nextLine();
                            System.out.print("Digite a descrição do Projeto: ");
                            String descricaoEnergiaRenovavel = input.nextLine();
                            System.out.print("Digite o nome do Voluntário: ");
                            String nomeVolun1 = input.nextLine();
                            System.out.print("Digite o Email do Voluntário: ");
                            String emailVolun1 = input.nextLine();
                            System.out.print("Digite o total de Energia Gerada: ");
                            double energiaGerada = input.nextDouble();
                            input.nextLine(); // Limpar o buffer

                            Voluntario voluntario1 = new Voluntario(nomeVolun1, emailVolun1);


                            // Criando o projeto
                            ProjetoEnergiaRenovavel projetoEnergiaRenovavel = new ProjetoEnergiaRenovavel(nomeProjEnergiaRenovavel, descricaoEnergiaRenovavel);
                            voluntario1.setNome(nomeVolun1);
                            organizacoes.adicionarProjeto(projetoEnergiaRenovavel);
                            voluntario1.participarProjeto(projetoEnergiaRenovavel);
                            projetoEnergiaRenovavel.setEnergiaGerada(energiaGerada);
                            projetoEnergiaRenovavel.gerarRelatorioImpacto(energiaGerada);
                            projetoEnergiaRenovavel.exibirRelatorio();
                            System.out.println(" ");

                        } else if (opc == 3) {
                            // Projeto Reciclagem
                            System.out.println("---------Projeto Reciclagem---------");

                            System.out.print("Digite o nome do Projeto: ");
                            String nomeProjReciclagem = input.nextLine();
                            System.out.print("Digite a descrição do Projeto: ");
                            String descricaoReciclagem = input.nextLine();
                            System.out.print("Digite o nome do Voluntário: ");
                            String nomeVolun2 = input.nextLine();
                            System.out.print("Digite o Email do Voluntário: ");
                            String emailVolun2 = input.nextLine();
                            System.out.print("Digite o total de Toneladas recicladas: ");
                            double toneladasRecicladas = input.nextDouble();
                            input.nextLine(); // Limpar o buffer

                            Voluntario voluntario2 = new Voluntario(nomeVolun2, emailVolun2);

                            // Criando o projeto
                            ProjetoReciclagem projetoReciclagem = new ProjetoReciclagem(nomeProjReciclagem, descricaoReciclagem);

                            voluntario2.setNome(nomeVolun2);
                            organizacoes.adicionarProjeto(projetoReciclagem);
                            voluntario2.participarProjeto(projetoReciclagem);
                            projetoReciclagem.setToneladasRecicladas(toneladasRecicladas);
                            projetoReciclagem.gerarRelatorioImpacto(toneladasRecicladas);
                            projetoReciclagem.exibirRelatorio();
                            System.out.println(" ");
                        }
                    } else if (opcao == 2) {
                        // Listando os Projetos cadastrados
                        System.out.println("-------------Listando os Projetos-------------");
                        organizacoes.listarProjetosONG();
                    } else {
                        // Saindo do sistema
                        System.out.println("Saindo do sistema...");
                        break;
                    }
                }
                break;
            case 2:

                System.out.print("Digite o nome da Organização");
                String nomeOrgg = input.nextLine();

                System.out.print("Digite o nome da Empresa: ");
                String NomeEmpresa = input.nextLine();

                System.out.print("Digite o CNPJ da Empresa ");
                String cnpj = input.nextLine();

                Empresa empresa = new Empresa(NomeEmpresa, cnpj);


                Organizacoes organizacoe = new Organizacoes(nomeOrgg, empresa, null);

                while (true) {

                    System.out.println(" ");
                    System.out.println("------------------------");
                    System.out.println("Empresa Cadastrada cadastrada!!");
                    System.out.println("Opções: 1 - Cadastrar Projeto");
                    System.out.println("Opções: 2 - Consultar Projetos");
                    System.out.println("Opções: 3 - Sair");
                    int opcao = input.nextInt();

                    input.nextLine(); // Limpar o buffer

                    System.out.println(" ");

                    if (opcao == 1) {
                        // Menu para cadastrar projeto
                        System.out.println("--------------------");
                        System.out.println("Escolha um Projeto para cadastrar: ");
                        System.out.println("Opções: 1 - Projeto Reflorestamento");
                        System.out.println("Opções: 2 - Projeto Energia Renovável");
                        System.out.println("Opções: 3 - Projeto Reciclagem");
                        System.out.println("Opções: 4 - Voltar");
                        int opc = input.nextInt();
                        input.nextLine(); // Limpar o buffer

                        System.out.println(" ");

                        if (opc == 1) {
                            // Projeto Reflorestamento
                            System.out.println("---------Projeto Reflorestamento---------");

                            System.out.print("Digite o nome do Projeto: ");
                            String nomeProjReflorestamento = input.nextLine();
                            System.out.print("Digite a descrição do Projeto: ");
                            String descricaoProjReflorestamento = input.nextLine();
                            System.out.print("Digite o nome do Voluntário: ");
                            String nomeVolun = input.nextLine();
                            System.out.print("Digite o Email do Voluntário: ");
                            String emailVolun = input.nextLine();
                            System.out.print("Digite o total de árvores plantadas: ");
                            int arvoresPlantadas = input.nextInt();
                            input.nextLine(); // Limpar o buffer

                            Voluntario voluntario = new Voluntario(nomeVolun, emailVolun);

                            // Criando o projeto
                            ProjetoReflorestamento projetoReflorestamento = new ProjetoReflorestamento(nomeProjReflorestamento, descricaoProjReflorestamento);
                            voluntario.setNome(nomeVolun);
                            organizacoe.adicionarVoluntarios(voluntario);
                            organizacoe.adicionarProjeto(projetoReflorestamento);
                            voluntario.participarProjeto(projetoReflorestamento);
                            projetoReflorestamento.setArvoresPlantadas(arvoresPlantadas);
                            projetoReflorestamento.gerarRelatorioImpacto(arvoresPlantadas);
                            projetoReflorestamento.exibirRelatorio();
                            System.out.println("Projeto Cadastrado");
                            System.out.println(" ");

                        } else if (opc == 2) {
                            // Projeto Energia Renovável
                            System.out.println("---------Projeto Energia Renovável---------");

                            System.out.print("Digite o nome do Projeto: ");
                            String nomeProjEnergiaRenovavel = input.nextLine();
                            System.out.print("Digite a descrição do Projeto: ");
                            String descricaoEnergiaRenovavel = input.nextLine();
                            System.out.print("Digite o nome do Voluntário: ");
                            String nomeVolun1 = input.nextLine();
                            System.out.print("Digite o Email do Voluntário: ");
                            String emailVolun1 = input.nextLine();
                            System.out.print("Digite o total de Energia Gerada: ");
                            double energiaGerada = input.nextDouble();
                            input.nextLine(); // Limpar o buffer

                            Voluntario voluntario1 = new Voluntario(nomeVolun1, emailVolun1);


                            // Criando o projeto
                            ProjetoEnergiaRenovavel projetoEnergiaRenovavel = new ProjetoEnergiaRenovavel(nomeProjEnergiaRenovavel, descricaoEnergiaRenovavel);
                            voluntario1.setNome(nomeVolun1);
                            organizacoe.adicionarProjeto(projetoEnergiaRenovavel);
                            voluntario1.participarProjeto(projetoEnergiaRenovavel);
                            projetoEnergiaRenovavel.setEnergiaGerada(energiaGerada);
                            projetoEnergiaRenovavel.gerarRelatorioImpacto(energiaGerada);
                            projetoEnergiaRenovavel.exibirRelatorio();
                            System.out.println(" ");

                        } else if (opc == 3) {
                            // Projeto Reciclagem
                            System.out.println("---------Projeto Reciclagem---------");

                            System.out.print("Digite o nome do Projeto: ");
                            String nomeProjReciclagem = input.nextLine();
                            System.out.print("Digite a descrição do Projeto: ");
                            String descricaoReciclagem = input.nextLine();
                            System.out.print("Digite o nome do Voluntário: ");
                            String nomeVolun2 = input.nextLine();
                            System.out.print("Digite o Email do Voluntário: ");
                            String emailVolun2 = input.nextLine();
                            System.out.print("Digite o total de Toneladas recicladas: ");
                            double toneladasRecicladas = input.nextDouble();
                            input.nextLine(); // Limpar o buffer

                            Voluntario voluntario2 = new Voluntario(nomeVolun2, emailVolun2);

                            // Criando o projeto
                            ProjetoReciclagem projetoReciclagem = new ProjetoReciclagem(nomeProjReciclagem, descricaoReciclagem);

                            voluntario2.setNome(nomeVolun2);
                            organizacoe.adicionarProjeto(projetoReciclagem);
                            voluntario2.participarProjeto(projetoReciclagem);
                            projetoReciclagem.setToneladasRecicladas(toneladasRecicladas);
                            projetoReciclagem.gerarRelatorioImpacto(toneladasRecicladas);
                            projetoReciclagem.exibirRelatorio();
                            System.out.println(" ");
                        }
                    } else if (opcao == 2) {
                        // Listando os Projetos cadastrados
                        System.out.println("-------------Listando os Projetos-------------");
                        organizacoe.listarProjetos();
                    } else {
                        // Saindo do sistema
                        System.out.println("Saindo do sistema...");
                        break;
                    }
                }
        }
    }
}
