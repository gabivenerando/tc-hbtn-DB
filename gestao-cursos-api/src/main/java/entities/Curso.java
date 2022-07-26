package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private String sigla;
    @OneToOne
    private Professor professor;
    @OneToOne
    private MaterialCurso materialCurso;
    @ManyToOne
    private List<Aluno> alunos = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public MaterialCurso getMaterialCurso() {
        return materialCurso;
    }

    public void setMaterialCurso(MaterialCurso materialCurso) {
        this.materialCurso = materialCurso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno aluno) {

        this.alunos.add(aluno);
    }
}
