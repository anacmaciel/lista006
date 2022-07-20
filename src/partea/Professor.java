package partea;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeturmas;
    private List<Turma> listaDeTurmas;
    private List<Estagiario> listaDeEstagiarios;

    public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, List<Turma> turmas) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.quantidadeDeturmas = quantidadeDeTurmas;
        this.turmas = turmas;
    }

    public void adicionaTurma() {
        listaDeTurmas.add();
    }

    public void adicionaEstagiario() {
        if (listaDeEstagiarios.size( < 3)){
           //Lógica não concluída System.out.println("Insira os dados do estagiário");
            listaDeEstagiarios.add();
        }
    }

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {

        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {

        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getQuantidadeDeturmas() {
        return quantidadeDeturmas;
    }

    public void setQuantidadeDeturmas(int quantidadeDeturmas) {

        this.quantidadeDeturmas = quantidadeDeturmas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public int calcularQuantidadeDeTurmas(List<Turma> turmas) {
        return turmas.size();
    }

    public int calcularQuantidadeDeAlunos(List<Turma> turmas) {
        int quantidadeDealunos = 0;
        for (int i = 0; i < listaDeTurmas.size(); i++) {
            quantidadeDealunos = quantidadeDeAlunos + t.getNumeroDeAlunos();

            System.out.println(quantidadeDealunos);}
        return quantidadeDealunos;
    }
}
