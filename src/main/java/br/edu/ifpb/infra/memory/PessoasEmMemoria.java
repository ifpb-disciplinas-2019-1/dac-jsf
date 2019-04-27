package br.edu.ifpb.infra.memory;

import br.edu.ifpb.domain.*;
import java.util.ArrayList;
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
    }

    public List<Pessoa> todas() {
        //TODO: implementar
        return null;
    }

    public void excluir(Pessoa pessoa) {
        //TODO: implementar
    }

    public void atualizar(Pessoa pessoa) {
        //TODO: implementar
    }

    @Override
    public List<Dependente> todosOsDepentendes() {
        //TODO: implementar
        return null;
    }

    @Override
    public Dependente localizarDependenteComId(String uuid) {
        //TODO: implementar
        return null;
    }
}
