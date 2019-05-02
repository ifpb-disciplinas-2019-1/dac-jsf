package br.edu.ifpb.web.jsf;

import br.edu.ifpb.domain.Dependente;
import br.edu.ifpb.domain.Pessoa;
import br.edu.ifpb.domain.Pessoas;
import br.edu.ifpb.infra.persistence.memory.PessoasEmMemoria;
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
    private Pessoas service = new PessoasEmMemoria();

    //actionListeners
//    public void exemplo(ActionEvent ev) {
//        
//    }
    public String salvar() {
        this.service.nova(pessoa);
        this.pessoa = new Pessoa();
//        return null; //        return "index.xhtml";
//        return "list";
        return "list.xhtml?faces-redirect=true";
    }
    public List<Dependente> listarTodosOsDependentes(){
        return this.service.todosOsDepentendes();
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
