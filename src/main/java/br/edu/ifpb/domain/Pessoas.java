package br.edu.ifpb.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/04/2019, 09:57:57
 */
public class Pessoas implements Serializable {

    private final List<Pessoa> pessoas = new ArrayList<>();

    public void nova(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public List<Pessoa> todas() {
        return Collections.unmodifiableList(pessoas);
    }

    public void excluir(Pessoa pessoa) {
        this.pessoas.remove(pessoa);
    }

    public void atualizar(Pessoa pessoa) {
        this.excluir(pessoa);
        this.nova(pessoa);
    }
}
