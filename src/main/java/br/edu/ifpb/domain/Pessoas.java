package br.edu.ifpb.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/04/2019, 09:57:57
 */
public interface Pessoas extends Serializable {
 
    public void nova(Pessoa pessoa);

    public List<Pessoa> todas() ;

    public void excluir(Pessoa pessoa);

    public void atualizar(Pessoa pessoa);
    
    public List<Dependente> todosOsDepentendes();

    public Dependente localizarDependenteComId(String uuid);
}
