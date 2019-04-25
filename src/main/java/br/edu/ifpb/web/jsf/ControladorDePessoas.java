package br.edu.ifpb.web.jsf;

import br.edu.ifpb.domain.Pessoa;
import br.edu.ifpb.domain.Pessoas;
import java.io.Serializable;
import java.util.List;
//import javax.faces.bean.RequestScoped;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/04/2019, 10:23:24
 */
//@RequestScoped
//@ManagedBean
//@RequestScoped
@SessionScoped
@Named
public class ControladorDePessoas implements Serializable {

    private Pessoa pessoa = new Pessoa();

//    @Inject
    private Pessoas service = new Pessoas();

    public String salvar() {
        this.service.nova(pessoa);
        this.pessoa = new Pessoa();
        return null; //        return "index.xhtml";
    }
    public String atualizar() {
        this.service.atualizar(pessoa);
        this.pessoa = new Pessoa();
        return null;
    }
    public String excluir(Pessoa pessoa) {
        this.service.excluir(pessoa);
        return null;
    }
    public String editar(Pessoa pessoa) {
        this.pessoa = pessoa;
        return null;
    }

    public List<Pessoa> getTodasAsPessoas() {
        return this.service.todas();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
