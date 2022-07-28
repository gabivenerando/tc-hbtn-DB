package demo;

import entities.*;


import java.util.Date;


public class GestaoCursosMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNomeCompleto("Maria Santos");
        aluno.setMatricula("123456");
        aluno.setNascimento(new Date((1987/3/15)));
        aluno.setEmail("marisasantos@gmail.com");


        Endereco endereco = new Endereco();
        endereco.setLogadouro("próximo ao Hospital");
        endereco.setEndereco("Rua Augusta");
        endereco.setNumero("123");
        endereco.setBairro("Paulista");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setCep(122222);


        aluno.setEndereco(endereco);


        Telefone telefone = new Telefone();
        telefone.setDDD("11");
        telefone.setNumero("99999999");

        aluno.setTelefone(telefone);


        Professor professor = new Professor();
        professor.setNomeCompleto("Paulo Henrique");
        professor.setMatricula("47483893");
        professor.setEmail("paulohenrique@gmail.com");

        Curso curso = new Curso();

        curso.setNome("Matemática");
        curso.setSigla("MA");
        curso.setProfessor(professor);
        curso.setAlunos(aluno);

        professor.setCursos(curso);


        MaterialCurso materialCurso = new MaterialCurso();
        materialCurso.setUrl("https://techcamps.hbtn.io/");

        curso.setMaterialCurso(materialCurso);


    }
}
