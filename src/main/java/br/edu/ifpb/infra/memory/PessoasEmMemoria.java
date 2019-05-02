package br.edu.ifpb.infra.memory;

import br.edu.ifpb.domain.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/04/2019, 09:57:57
 */
public class PessoasEmMemoria implements Pessoas {

    private final List<Pessoa> pessoas = new ArrayList<>();

    public void nova(Pessoa pessoa) {
        //TODO: implementar
        this.pessoas.add(pessoa);
    }

    public List<Pessoa> todas() {
        //TODO: implementar
        return Collections.unmodifiableList(pessoas);
    }

    public void excluir(Pessoa pessoa) {
        //TODO: implementar
        this.pessoas.remove(pessoa);
    }

    public void atualizar(Pessoa pessoa) {
        //TODO: implementar
        this.pessoas
            .removeIf(p -> p.getId() == pessoa.getId());
        this.pessoas.add(pessoa);

    }

    @Override
    public List<Dependente> todosOsDepentendes() {
        //TODO: implementar
        return Arrays.asList(
            new Dependente("123","Maria",LocalDate.now().plusDays(1)),
            new Dependente("124","José",null),
            new Dependente("125","João",LocalDate.now().minusDays(1)),
            new Dependente("126","Mariana",LocalDate.now()) 
        );
    }

    @Override
    public Dependente localizarDependenteComId(String uuid) {
        //TODO: implementar

        return todosOsDepentendes()
            .stream()
            .filter(p -> p.getUuid().equals(uuid))
            .findFirst()
            .orElse(Dependente.fake());
    }
}
