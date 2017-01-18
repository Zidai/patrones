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
@Table(name = "noticias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Noticias.findAll", query = "SELECT n FROM Noticias n"),
    @NamedQuery(name = "Noticias.findById", query = "SELECT n FROM Noticias n WHERE n.id = :id"),
    @NamedQuery(name = "Noticias.findByTitulo", query = "SELECT n FROM Noticias n WHERE n.titulo = :titulo"),
    @NamedQuery(name = "Noticias.findByLink", query = "SELECT n FROM Noticias n WHERE n.link = :link"),
    @NamedQuery(name = "Noticias.findByGuid", query = "SELECT n FROM Noticias n WHERE n.guid = :guid"),
    @NamedQuery(name = "Noticias.findByPubdate", query = "SELECT n FROM Noticias n WHERE n.pubdate = :pubdate"),
    @NamedQuery(name = "Noticias.findByDescripcion", query = "SELECT n FROM Noticias n WHERE n.descripcion = :descripcion")})
public class Noticias implements Serializable {

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

    public Noticias() {
    }

    public Noticias(Integer id) {
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
        if (!(object instanceof Noticias)) {
            return false;
        }
        Noticias other = (Noticias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Componente1.Noticias[ id=" + id + " ]";
    }
    
}
