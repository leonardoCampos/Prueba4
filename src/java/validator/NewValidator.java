/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author pangea
 */
@FacesValidator("validator.NewValidator")
public class NewValidator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String tipo = (String)component.getAttributes().get("tipo");
        if(value.toString().equals("holas"))
        {
            FacesMessage mensaje = new FacesMessage("el "+tipo+" no puede ser Holas","la Categoria no puede ser Holas");
            
            mensaje.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw  new ValidatorException(mensaje);
        }
    }
    
}
