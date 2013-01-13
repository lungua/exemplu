/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ent;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author lungua
 */
@Entity
@Table(name = "intrari_materiale")
@NamedQueries({
    @NamedQuery(name = "IntrariMateriale.findAll", query = "SELECT i FROM IntrariMateriale i"),
    @NamedQuery(name = "IntrariMateriale.findByIdIntrariMateriale", query = "SELECT i FROM IntrariMateriale i WHERE i.idIntrariMateriale = :idIntrariMateriale"),
    @NamedQuery(name = "IntrariMateriale.findByCantitate", query = "SELECT i FROM IntrariMateriale i WHERE i.cantitate = :cantitate"),
    @NamedQuery(name = "IntrariMateriale.findByPret", query = "SELECT i FROM IntrariMateriale i WHERE i.pret = :pret")})
public class IntrariMateriale implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_intrari_materiale")
    private Integer idIntrariMateriale;
    @Column(name = "cantitate")
    private Integer cantitate;
    @Column(name = "pret")
    private Integer pret;
    @JoinColumn(name = "MATERIALE_id_material", referencedColumnName = "id_material")
    @ManyToOne(optional = false)
    private Materiale materiale;

    public IntrariMateriale() {
    }

    public IntrariMateriale(Integer idIntrariMateriale) {
        this.idIntrariMateriale = idIntrariMateriale;
    }

    public Integer getIdIntrariMateriale() {
        return idIntrariMateriale;
    }

    public void setIdIntrariMateriale(Integer idIntrariMateriale) {
        this.idIntrariMateriale = idIntrariMateriale;
    }

    public Integer getCantitate() {
        return cantitate;
    }

    public void setCantitate(Integer cantitate) {
        this.cantitate = cantitate;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public Materiale getMateriale() {
        return materiale;
    }

    public void setMateriale(Materiale materiale) {
        this.materiale = materiale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIntrariMateriale != null ? idIntrariMateriale.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IntrariMateriale)) {
            return false;
        }
        IntrariMateriale other = (IntrariMateriale) object;
        if ((this.idIntrariMateriale == null && other.idIntrariMateriale != null) || (this.idIntrariMateriale != null && !this.idIntrariMateriale.equals(other.idIntrariMateriale))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.IntrariMateriale[idIntrariMateriale=" + idIntrariMateriale + "]";
    }

}
