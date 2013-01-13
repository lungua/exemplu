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
@Table(name = "materiale_comanda")
@NamedQueries({
    @NamedQuery(name = "MaterialeComanda.findAll", query = "SELECT m FROM MaterialeComanda m"),
    @NamedQuery(name = "MaterialeComanda.findByIdMaterialComanda", query = "SELECT m FROM MaterialeComanda m WHERE m.idMaterialComanda = :idMaterialComanda"),
    @NamedQuery(name = "MaterialeComanda.findByCantitate", query = "SELECT m FROM MaterialeComanda m WHERE m.cantitate = :cantitate"),
    @NamedQuery(name = "MaterialeComanda.findByPretTotal", query = "SELECT m FROM MaterialeComanda m WHERE m.pretTotal = :pretTotal")})
public class MaterialeComanda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_material_comanda")
    private Integer idMaterialComanda;
    @Column(name = "cantitate")
    private Integer cantitate;
    @Column(name = "pret_total")
    private Integer pretTotal;
    @JoinColumn(name = "MATERIALE_id_material", referencedColumnName = "id_material")
    @ManyToOne(optional = false)
    private Materiale materiale;
    @JoinColumn(name = "COMENZI_id_comanda", referencedColumnName = "id_comanda")
    @ManyToOne(optional = false)
    private Comenzi comenzi;

    public MaterialeComanda() {
    }

    public MaterialeComanda(Integer idMaterialComanda) {
        this.idMaterialComanda = idMaterialComanda;
    }

    public Integer getIdMaterialComanda() {
        return idMaterialComanda;
    }

    public void setIdMaterialComanda(Integer idMaterialComanda) {
        this.idMaterialComanda = idMaterialComanda;
    }

    public Integer getCantitate() {
        return cantitate;
    }

    public void setCantitate(Integer cantitate) {
        this.cantitate = cantitate;
    }

    public Integer getPretTotal() {
        return pretTotal;
    }

    public void setPretTotal(Integer pretTotal) {
        this.pretTotal = pretTotal;
    }

    public Materiale getMateriale() {
        return materiale;
    }

    public void setMateriale(Materiale materiale) {
        this.materiale = materiale;
    }

    public Comenzi getComenzi() {
        return comenzi;
    }

    public void setComenzi(Comenzi comenzi) {
        this.comenzi = comenzi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaterialComanda != null ? idMaterialComanda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaterialeComanda)) {
            return false;
        }
        MaterialeComanda other = (MaterialeComanda) object;
        if ((this.idMaterialComanda == null && other.idMaterialComanda != null) || (this.idMaterialComanda != null && !this.idMaterialComanda.equals(other.idMaterialComanda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.MaterialeComanda[idMaterialComanda=" + idMaterialComanda + "]";
    }

}
