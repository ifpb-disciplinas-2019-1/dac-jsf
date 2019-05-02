package br.edu.ifpb.infra.jsf.converter;

import br.edu.ifpb.domain.Dependente;
import br.edu.ifpb.domain.Pessoas;
import br.edu.ifpb.infra.persistence.memory.PessoasEmMemoria;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 26/04/2019, 08:37:43
 */
@FacesConverter(value = "converter.Dependente")
public class ConvertDependente implements Converter {

    private Pessoas service = new PessoasEmMemoria();

    @Override
    public Object getAsObject(
        FacesContext context,
        UIComponent component,
        String value) {
        if (value == null) {
            return null;
        }

        Dependente dep = this.service
            .localizarDependenteComId(value);
        return dep;
//return new Dependente(value,"");

    }

    @Override
    public String getAsString(
        FacesContext context,
        UIComponent component,
        Object value) {

        if (value == null) {
            return null;
        }
        Dependente dep = (Dependente) value;
        return dep.getUuid();
    }

}
