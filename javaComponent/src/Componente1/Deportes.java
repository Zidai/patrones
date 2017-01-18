/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componente1;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author subzero
 */
@Entity
@Table(name = "deportes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Deportes.findAll", query = "SELECT d FROM Deportes d"),
    @NamedQuery(name = "Deportes.findById", query = "SELECT d FROM Deportes d WHERE d.id = :id"),
    @NamedQuery(name = "Deportes.findByTitulo", query = "SELECT d FROM Deportes d WHERE d.titulo = :titulo"),
    @NamedQuery(name = "Deportes.findByLink", query = "SELECT d FROM Deportes d WHERE d.link = :link"),
    @NamedQuery(name = "Deportes.findByGuid", query = "SELECT d FROM Deportes d WHERE d.guid = :guid"),
    @NamedQuery(name = "Deportes.findByPubdate", query = "SELECT d FROM Deportes d WHERE d.pubdate = :pubdate"),
    @NamedQuery(name = "Deportes.findByDescripcion", query = "SELECT d FROM Deportes d WHERE d.descripcion = :descripcion")})
public class Deportes implements Serializable {

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
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        return "Componente1.Deportes[ id=" + id + " ]";
    }
    
}
