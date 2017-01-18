/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion11;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author subzero
 */
@Entity
@Table(name = "deportes", catalog = "patrones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Deportes.findAll", query = "SELECT d FROM Deportes d"),
    @NamedQuery(name = "Deportes.findById", query = "SELECT d FROM Deportes d WHERE d.id = :id"),
    @NamedQuery(name = "Deportes.findByTitulo", query = "SELECT d FROM Deportes d WHERE d.titulo = :titulo"),
    @NamedQuery(name = "Deportes.findByLink", query = "SELECT d FROM Deportes d WHERE d.link = :link"),
    @NamedQuery(name = "Deportes.findByGuid", query = "SELECT d FROM Deportes d WHERE d.guid = :guid"),
    @NamedQuery(name = "Deportes.findByPubdate", query = "SELECT d FROM Deportes d WHERE d.pubdate = :pubdate"),
    @NamedQuery(name = "Deportes.findByDescripcion", query = "SELECT d FROM Deportes d WHERE d.descripcion = :descripcion")})
public class Deportes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "link")
    private String link;
    @Column(name = "guid")
    private String guid;
    @Column(name = "pubdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pubdate;
    @Column(name = "descripcion")
    private String descripcion;

    public Deportes() {
    }

    public Deportes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        String oldTitulo = this.titulo;
        this.titulo = titulo;
        changeSupport.firePropertyChange("titulo", oldTitulo, titulo);
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        String oldLink = this.link;
        this.link = link;
        changeSupport.firePropertyChange("link", oldLink, link);
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        String oldGuid = this.guid;
        this.guid = guid;
        changeSupport.firePropertyChange("guid", oldGuid, guid);
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        Date oldPubdate = this.pubdate;
        this.pubdate = pubdate;
        changeSupport.firePropertyChange("pubdate", oldPubdate, pubdate);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        changeSupport.firePropertyChange("descripcion", oldDescripcion, descripcion);
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
        if (!(object instanceof Deportes)) {
            return false;
        }
        Deportes other = (Deportes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplicacion11.Deportes[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
