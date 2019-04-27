package br.edu.ifpb.domain;

import java.util.Objects;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/04/2019, 09:55:19
 */
public class Pessoa {

    private CPF cpf;
    private String nome;
    
    // novos campos
    private int id;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.cpf);
        hash = 31 * hash + Objects.hashCode(this.nome);
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
        if (!Objects.equals(this.cpf,other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.nome,other.nome)) {
            return false;
        }
        return true;
    }
}
