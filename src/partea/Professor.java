package partea;

import java.util.List;

public class Professor extends Funcionario {
     private String nivelDeGraduacao;
private String disciplinaMinistrada;
private int quantidadeDeAlunos;
private int quantidadeDeturmas;
private List <Turma> turmas;


    public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, List<Turma> turmas) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeDeAlunos = calcularQuantidadeDeAlunos(turmas);
        this.quantidadeDeturmas = calcularQuantidadeDeTurmas(turmas);
        this.turmas = turmas;
    }


    public void adicionaTurma(){

        this.quantidadeDeturmas;
    }

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao){

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

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos){

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

public int calcularQuantidadeDeTurmas(List<Turma> turmas){
        return turmas.size();
}
public   int calcularQuantidadeDeAlunos (List<Turma> turmas) {
int quantidadeDealunos = 0;
for (Turma t:turmas) {
    quantidadeDealunos = quantidadeDeAlunos + t.getNumeroDeAlunos();
}
        return quantidadeDealunos;
}
}
