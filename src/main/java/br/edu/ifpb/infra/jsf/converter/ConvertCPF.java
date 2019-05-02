package br.edu.ifpb.infra.jsf.converter;

import br.edu.ifpb.domain.CPF;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 26/04/2019, 08:37:43
 */
@FacesConverter(value = "converter.cpf")
public class ConvertCPF implements Converter {

    @Override
    public Object getAsObject(
        FacesContext context,
        UIComponent component,
        String value) {

        return new CPF(value);

    }

    @Override
    public String getAsString(
        FacesContext context,
        UIComponent component,
        Object value) {
        
        CPF cpf = (CPF) value;
        return cpf.valor();

    }

}
