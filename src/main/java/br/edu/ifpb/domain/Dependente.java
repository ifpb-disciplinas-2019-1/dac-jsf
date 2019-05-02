package br.edu.ifpb.domain;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 26/04/2019, 18:38:44
 */
public class Dependente {

    private String uuid;

    private String nome;
    private LocalDate dataDeNascimento;

    public Dependente() {

    }

    public Dependente(String nome) {
        this(
            UUID.randomUUID().toString(),
            nome,
            LocalDate.now()
        );

    }
    public static Dependente fake(){
        return new Dependente("-1","-1",LocalDate.MIN);
    }
    

    public Dependente(String uuid,String nome) {
        this(
            uuid,
            nome,
            LocalDate.now()
        );
    }
    public Dependente(String uuid,String nome,LocalDate dataDeNascimento) {
        this.uuid = uuid;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.uuid);
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.dataDeNascimento);
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
        final Dependente other = (Dependente) obj;
        if (!Objects.equals(this.uuid,other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.nome,other.nome)) {
            return false;
        }
        if (!Objects.equals(this.dataDeNascimento,other.dataDeNascimento)) {
            return false;
        }
        return true;
    }

    public boolean naoValido() {
        return false;
    }

    
}
