package partea;

import java.util.ArrayList;
import java.util.List;

public class MainUniversidade {
    public static void main(String[] args) {
        List<Professor> listaDeProfessores = new ArrayList<>();
        List<Estagiario> listaDeEstagiario = new ArrayList<>();
        List<Turma> listaDeTurmas = new ArrayList<>();
        Professor professor = new Professor();
Coordenador coordenador = new Coordenador();
Estagiario estagiario = new Estagiario();


coordenador.adicionaProfessor();
professor.adicionaTurma();
professor.adicionaEstagiario();


    }


}
