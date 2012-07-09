/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

/**
 *
 * @author pangea
 */
public class NewConverterDate implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Date fecha;
        SimpleDateFormat formateador = new SimpleDateFormat("dd/mm/yyyy");
        try {
            fecha = formateador.parse(value);
            return fecha;
        } catch (Exception ex) {
            Logger.getLogger(NewConverterDate.class.getName()).log(Level.SEVERE, null, ex);
            throw new ConverterException(ex);
        }
       
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        SimpleDateFormat formateador = new SimpleDateFormat("dd/mm/yyyy");
        return formateador.format(value.toString());
        
    }
    
}
