package partea;


import java.util.List;

public  class  Coordenadores extends  FuncionarioUniversidade {

    List<Professores>;

    public Coordenadores(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }

    public void adicionaProfessor(){

   Professores.add();

    }


    @Override
    public double aumentoSalario() {
        return getSalario() * 0.5;
    }

}