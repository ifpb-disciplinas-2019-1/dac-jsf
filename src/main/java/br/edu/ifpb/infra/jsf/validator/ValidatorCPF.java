package br.edu.ifpb.infra.jsf.validator;

import br.edu.ifpb.domain.CPF;
import java.util.Arrays;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 26/04/2019, 08:55:22
 */
@FacesValidator(value = "validator.cpf")
public class ValidatorCPF implements Validator {

    @Override
    public void validate(
        FacesContext context,
        UIComponent component,
        Object value) throws ValidatorException {
        CPF cpf = (CPF) value;

        if (cpf.naoValido()) {
            FacesMessage facesMessage = new FacesMessage("cpf inválido");

            List<FacesMessage> asList = Arrays.asList(
                new FacesMessage("cpf inválido"),
                new FacesMessage("deu ruim"),
                new FacesMessage("de novo")
            );

            throw new ValidatorException(asList);
        }
    }

}
