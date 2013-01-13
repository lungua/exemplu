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
@Table(name = "salariati")
@NamedQueries({
    @NamedQuery(name = "Salariati.findAll", query = "SELECT s FROM Salariati s"),
    @NamedQuery(name = "Salariati.findByIdSalariat", query = "SELECT s FROM Salariati s WHERE s.idSalariat = :idSalariat"),
    @NamedQuery(name = "Salariati.findByNume", query = "SELECT s FROM Salariati s WHERE s.nume = :nume"),
    @NamedQuery(name = "Salariati.findByUtilizator", query = "SELECT s FROM Salariati s WHERE s.utilizator = :utilizator"),
    @NamedQuery(name = "Salariati.findByParola", query = "SELECT s FROM Salariati s WHERE s.parola = :parola"),
    @NamedQuery(name = "Salariati.findByTip", query = "SELECT s FROM Salariati s WHERE s.tip = :tip"),
    @NamedQuery(name = "Salariati.findByNrLucrariInExecutie", query = "SELECT s FROM Salariati s WHERE s.nrLucrariInExecutie = :nrLucrariInExecutie")})
public class Salariati implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_salariat")
    private Integer idSalariat;
    @Column(name = "nume")
    private String nume;
    @Column(name = "utilizator")
    private String utilizator;
    @Column(name = "parola")
    private String parola;
    @Column(name = "tip")
    private String tip;
    @Column(name = "nr_lucrari_in_executie")
    private Integer nrLucrariInExecutie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salariati")
    private List<Comenzi> comenziList;

    public Salariati() {
    }

    public Salariati(Integer idSalariat) {
        this.idSalariat = idSalariat;
    }

    public Integer getIdSalariat() {
        return idSalariat;
    }

    public void setIdSalariat(Integer idSalariat) {
        this.idSalariat = idSalariat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getUtilizator() {
        return utilizator;
    }

    public void setUtilizator(String utilizator) {
        this.utilizator = utilizator;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Integer getNrLucrariInExecutie() {
        return nrLucrariInExecutie;
    }

    public void setNrLucrariInExecutie(Integer nrLucrariInExecutie) {
        this.nrLucrariInExecutie = nrLucrariInExecutie;
    }

    public List<Comenzi> getComenziList() {
        return comenziList;
    }

    public void setComenziList(List<Comenzi> comenziList) {
        this.comenziList = comenziList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSalariat != null ? idSalariat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salariati)) {
            return false;
        }
        Salariati other = (Salariati) object;
        if ((this.idSalariat == null && other.idSalariat != null) || (this.idSalariat != null && !this.idSalariat.equals(other.idSalariat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.Salariati[idSalariat=" + idSalariat + "]";
    }

}
