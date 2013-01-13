/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ent;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author lungua
 */
@Entity
@Table(name = "materiale")
@NamedQueries({
    @NamedQuery(name = "Materiale.findAll", query = "SELECT m FROM Materiale m"),
    @NamedQuery(name = "Materiale.findByIdMaterial", query = "SELECT m FROM Materiale m WHERE m.idMaterial = :idMaterial"),
    @NamedQuery(name = "Materiale.findByIntrariMaterial", query = "SELECT m FROM Materiale m WHERE m.intrariMaterial = :intrariMaterial"),
    @NamedQuery(name = "Materiale.findByIesiriMaterial", query = "SELECT m FROM Materiale m WHERE m.iesiriMaterial = :iesiriMaterial"),
    @NamedQuery(name = "Materiale.findByStocMaterial", query = "SELECT m FROM Materiale m WHERE m.stocMaterial = :stocMaterial"),
    @NamedQuery(name = "Materiale.findByNume", query = "SELECT m FROM Materiale m WHERE m.nume = :nume"),
    @NamedQuery(name = "Materiale.findByPret", query = "SELECT m FROM Materiale m WHERE m.pret = :pret"),
    @NamedQuery(name = "Materiale.findByCantitate", query = "SELECT m FROM Materiale m WHERE m.cantitate = :cantitate"),
    @NamedQuery(name = "Materiale.findByDataIntrare", query = "SELECT m FROM Materiale m WHERE m.dataIntrare = :dataIntrare")})
public class Materiale implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_material")
    private Integer idMaterial;
    @Column(name = "intrari_material")
    private Integer intrariMaterial;
    @Column(name = "iesiri_material")
    private Integer iesiriMaterial;
    @Column(name = "stoc_material")
    private Integer stocMaterial;
    @Column(name = "nume")
    private String nume;
    @Column(name = "pret")
    private Integer pret;
    @Column(name = "cantitate")
    private Integer cantitate;
    @Column(name = "data_intrare")
    @Temporal(TemporalType.DATE)
    private Date dataIntrare;
    @JoinColumn(name = "FURNIZORI_id_furnizor", referencedColumnName = "id_furnizor")
    @ManyToOne(optional = false)
    private Furnizori furnizori;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materiale")
    private List<IntrariMateriale> intrariMaterialeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materiale")
    private List<MaterialeComanda> materialeComandaList;

    public Materiale() {
    }

    public Materiale(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Integer getIntrariMaterial() {
        return intrariMaterial;
    }

    public void setIntrariMaterial(Integer intrariMaterial) {
        this.intrariMaterial = intrariMaterial;
    }

    public Integer getIesiriMaterial() {
        return iesiriMaterial;
    }

    public void setIesiriMaterial(Integer iesiriMaterial) {
        this.iesiriMaterial = iesiriMaterial;
    }

    public Integer getStocMaterial() {
        return stocMaterial;
    }

    public void setStocMaterial(Integer stocMaterial) {
        this.stocMaterial = stocMaterial;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public Integer getCantitate() {
        return cantitate;
    }

    public void setCantitate(Integer cantitate) {
        this.cantitate = cantitate;
    }

    public Date getDataIntrare() {
        return dataIntrare;
    }

    public void setDataIntrare(Date dataIntrare) {
        this.dataIntrare = dataIntrare;
    }

    public Furnizori getFurnizori() {
        return furnizori;
    }

    public void setFurnizori(Furnizori furnizori) {
        this.furnizori = furnizori;
    }

    public List<IntrariMateriale> getIntrariMaterialeList() {
        return intrariMaterialeList;
    }

    public void setIntrariMaterialeList(List<IntrariMateriale> intrariMaterialeList) {
        this.intrariMaterialeList = intrariMaterialeList;
    }

    public List<MaterialeComanda> getMaterialeComandaList() {
        return materialeComandaList;
    }

    public void setMaterialeComandaList(List<MaterialeComanda> materialeComandaList) {
        this.materialeComandaList = materialeComandaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaterial != null ? idMaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materiale)) {
            return false;
        }
        Materiale other = (Materiale) object;
        if ((this.idMaterial == null && other.idMaterial != null) || (this.idMaterial != null && !this.idMaterial.equals(other.idMaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.Materiale[idMaterial=" + idMaterial + "]";
    }

}
