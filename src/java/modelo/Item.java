/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.persistence.*;

/**
 *
 * @author pangea
 */
@Entity
public class Item implements  Serializable{
    private static final long serialVersionUID = 1L;
    
   
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @Column(name="CATEGORY")
    private String Category;
    
    @Column(name="DESCRIPTION")
    private String Description;

    @Column(name="NAME")
    private String Name;

    @OneToMany(mappedBy = "item")
    private List<Inventory> inventorys;
    @OneToMany(mappedBy = "item")
    private List<Orders> orderss;
   
    
    
    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category){
        FacesContext contexto = FacesContext.getCurrentInstance();
        if(Category.charAt(0)=='A'){
        this.Category = Category;
        }else{
            FacesMessage mensaje = new FacesMessage();
            mensaje.setSeverity(FacesMessage.SEVERITY_ERROR);
            mensaje.setSummary("la categoria debe comenzar por la letra A");
            mensaje.setDetail("La CATEGORIA debe coomenzar por la letra A");
            contexto.addMessage("itemForm:category", mensaje);
        }
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    

    

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.item[ id=" + id + " ]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    
}
