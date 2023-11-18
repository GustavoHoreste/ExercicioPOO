/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gustavohoresteesantosbarros_atividadeavaliativa2;

/**
 *
 * @author gustavohorestee
 */
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Aluno> alunos;
    private List<Curso> cursos;
    private List<Professor> professores;

    public Disciplina(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.addDisciplina(this);
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
        curso.addDisciplina(this);
    }

    public void addProfessor(Professor professor) {
        professores.add(professor);
        professor.addDisciplina(this);
    }
}

