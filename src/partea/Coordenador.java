package partea;


import java.util.List;

public  class Coordenador extends Funcionario {

  private   List<Professor> professor;
private int limiteSupervisionados = 5;


    public Coordenador(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }

    public String adicionaProfessor(Professor p){

if (professor.size() <= limiteSupervisionados) {

    professores.add(p);
    return professor adicionado com sucesso;
} else  {

  return  A lista já atingiu o limite máximo;
}


    }


    @Override
    public double aumentoSalario() {
        return getSalario() * 1.5;
    }

}