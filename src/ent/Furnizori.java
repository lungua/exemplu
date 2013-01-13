/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ent;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lungua
 */
@Entity
@Table(name = "furnizori")
@NamedQueries({
    @NamedQuery(name = "Furnizori.findAll", query = "SELECT f FROM Furnizori f"),
    @NamedQuery(name = "Furnizori.findByIdFurnizor", query = "SELECT f FROM Furnizori f WHERE f.idFurnizor = :idFurnizor"),
    @NamedQuery(name = "Furnizori.findByNume", query = "SELECT f FROM Furnizori f WHERE f.nume = :nume"),
    @NamedQuery(name = "Furnizori.findByAdresa", query = "SELECT f FROM Furnizori f WHERE f.adresa = :adresa"),
    @NamedQuery(name = "Furnizori.findByEmail", query = "SELECT f FROM Furnizori f WHERE f.email = :email"),
    @NamedQuery(name = "Furnizori.findByTelefon", query = "SELECT f FROM Furnizori f WHERE f.telefon = :telefon")})
public class Furnizori implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_furnizor")
    private Integer idFurnizor;
    @Column(name = "nume")
    private String nume;
    @Column(name = "adresa")
    private String adresa;
    @Column(name = "email")
    private String email;
    @Column(name = "telefon")
    private String telefon;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "furnizori")
    private List<Materiale> materialeList;

    public Furnizori() {
    }

    public Furnizori(Integer idFurnizor) {
        this.idFurnizor = idFurnizor;
    }

    public Integer getIdFurnizor() {
        return idFurnizor;
    }

    public void setIdFurnizor(Integer idFurnizor) {
        this.idFurnizor = idFurnizor;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public List<Materiale> getMaterialeList() {
        return materialeList;
    }

    public void setMaterialeList(List<Materiale> materialeList) {
        this.materialeList = materialeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFurnizor != null ? idFurnizor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Furnizori)) {
            return false;
        }
        Furnizori other = (Furnizori) object;
        if ((this.idFurnizor == null && other.idFurnizor != null) || (this.idFurnizor != null && !this.idFurnizor.equals(other.idFurnizor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.Furnizori[idFurnizor=" + idFurnizor + "]";
    }

}
