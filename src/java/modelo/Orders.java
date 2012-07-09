/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.joda.time.DateTime;

/**
 *
 * @author pangea
 */
@Entity
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @Column(name="FECHA")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Fecha;
    
    @Column(name="CURRENT_LOCATION")
    private String CurrentLocation;
    
    @Column(name="ORDER_INITIATED")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date OrderInitiated;
    
    @Column(name="QUANTITY")
    private int Quantity;
    
    @ManyToOne
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getCurrentLocation() {
        return CurrentLocation;
    }

    public void setCurrentLocation(String CurrentLocation) {
        this.CurrentLocation = CurrentLocation;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Date getOrderInitiated() {
        return OrderInitiated;
    }

    public void setOrderInitiated(Date OrderInitiated) {
        this.OrderInitiated = OrderInitiated;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
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
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Order[ id=" + id + " ]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
