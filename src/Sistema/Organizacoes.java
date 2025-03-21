package Sistema;

import Projetos.ProjetoSustentavel;
import java.util.ArrayList;

public class Organizacoes {

    private String nome;
    private ArrayList<ProjetoSustentavel> listaProjetos;
    private Empresa empresa;  // Usando a instância correta de Empresa
    private Ong ong;
    ProjetoSustentavel projetoSustentavel;
    ArrayList<Voluntario> voluntarios;

    // Construtor da classe
    public Organizacoes(String nome, Empresa empresa, Ong ong) {
        this.nome = nome;
        this.listaProjetos = new ArrayList<>();
        voluntarios = new ArrayList<>();
        this.empresa = empresa;  // Inicializando a variável empresa
        this.ong = ong;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para adicionar um projeto à lista de projetos
    public void adicionarProjeto(ProjetoSustentavel projeto) {
        listaProjetos.add(projeto);
    }


    public void adicionarVoluntarios(Voluntario voluntario){
        voluntarios.add(voluntario);
    }


    public void listarProjetosONG(){
        System.out.println("Organização: " + getNome());

        if (empresa != null) {  // Verificando se a empresa não é nula
            empresa.listarProjetos();
        } else {
            System.out.println("Nenhuma empresa cadastrada.");
        }

        // Listando os projetos da organização
        for (ProjetoSustentavel projeto : listaProjetos) {
            System.out.println("---------------------");
            System.out.println("Projeto: " + projeto.getNome());
            System.out.println("Descrição: " + projeto.getDescricao());

            // Exibindo os voluntários do projeto
            if (projeto.getVoluntarios().isEmpty()) {
                System.out.println("Nenhum voluntário cadastrado.");
            } else {
                for (Voluntario voluntario : projeto.getVoluntarios()) {
                    System.out.println(" Voluntário do Projeto: " + voluntario.getNome());
                }
            }
        }
    }


    public void listarProjetos(){
        System.out.println("Organização: " + getNome());

        if (empresa != null) {  // Verificando se a empresa não é nula
            empresa.listarProjetos();
        } else {
            System.out.println("Nenhuma empresa cadastrada.");
        }

        // Listando os projetos da organização
        for (ProjetoSustentavel projeto : listaProjetos) {
            System.out.println("---------------------");
            System.out.println("Projeto: " + projeto.getNome());
            System.out.println("Descrição: " + projeto.getDescricao());

            // Exibindo os voluntários do projeto
            if (projeto.getVoluntarios().isEmpty()) {
                System.out.println("Nenhum voluntário cadastrado.");
            } else {
                for (Voluntario voluntario : projeto.getVoluntarios()) {
                    System.out.println(" Voluntário do Projeto: " + voluntario.getNome());
                }
            }
        }
    }

}
