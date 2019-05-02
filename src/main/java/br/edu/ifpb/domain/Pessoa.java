package br.edu.ifpb.domain;

import java.util.Objects;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/04/2019, 09:55:19
 */
public class Pessoa {

    private int id;
    private String nome;
    private CPF cpf;
    private Dependente dependente;

    public Pessoa() {
        this(
            "",
            "11122233344"
        );
    }

    public Pessoa(String nome,String cpf) {
        this(
            nome,new CPF(cpf)
        );
    }

    public Pessoa(String nome,CPF cpf) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public CPF getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{ 'cpf':'" + cpf + "', 'nome': '" + nome + "'}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.cpf);
        hash = 67 * hash + Objects.hashCode(this.dependente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome,other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf,other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.dependente,other.dependente)) {
            return false;
        }
        return true;
    }
    
    
 

}
