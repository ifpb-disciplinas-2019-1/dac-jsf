package br.edu.ifpb.infra.memory;

import br.edu.ifpb.domain.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/04/2019, 09:57:57
 */
public class PessoasEmMemoria implements Pessoas {

    private final List<Pessoa> pessoas = new ArrayList<>();

    public PessoasEmMemoria() {

        this.pessoas.addAll(
            Arrays.asList(
                new Pessoa("Jubileu","12312312332"),
                new Pessoa("Cleus","12312312339"),
                new Pessoa("Magnus","12312312330"),
                new Pessoa("Carlsen","12312312388"),
                new Pessoa("Bob Fisher","12312312337")
            )
        );
    }

    public void nova(Pessoa pessoa) {
        //TODO: implementar
    }

    public List<Pessoa> todas() {
        //TODO: implementar
        return this.pessoas;
    }

    public void excluir(Pessoa pessoa) {
        //TODO: implementar
    }

    public void atualizar(Pessoa pessoa) {
        //TODO: implementar
    }

    @Override
    public List<Dependente> todosOsDepentendes() {

        return Arrays.asList(
            new Dependente("5366b487-bf9e-46c9-aac1-99e96dcea70b","Job"),
            new Dependente("db9aee2d-811b-42e8-945a-5d10a4560f33","Antonio"),
            new Dependente("21ce7508-5a9e-4f8b-9a41-b497f91c79bb","Mariana"),
            new Dependente("e41f0a5e-095e-4f4a-9d60-f6fd5465965d","Ana")
        );
    }

    @Override
    public Dependente localizarDependenteComId(String uuid) {
        //TODO: implementar
        return todosOsDepentendes()
            .stream()
            .filter(d -> d.getUuid().equals(uuid))
            .findFirst()
            .orElse(Dependente.fake());
    }
}
