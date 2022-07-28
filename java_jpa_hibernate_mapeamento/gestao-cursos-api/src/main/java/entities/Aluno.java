package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nomeCompleto;
    @Column
    private String matricula;
    @Column(name = "data_nascimento")
    private Date nascimento;
    @Column
    private String email;
    @OneToMany
    @JoinColumn(name = "endereco_id")
    private List<Endereco> endereco = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "telefone_id")
    private List<Telefone> telefone = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco.add(endereco);
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {

        this.telefone.add(telefone);
    }
}


