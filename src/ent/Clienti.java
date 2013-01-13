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
@Table(name = "clienti")
@NamedQueries({
    @NamedQuery(name = "Clienti.findAll", query = "SELECT c FROM Clienti c"),
    @NamedQuery(name = "Clienti.findByIdClient", query = "SELECT c FROM Clienti c WHERE c.idClient = :idClient"),
    @NamedQuery(name = "Clienti.findByNume", query = "SELECT c FROM Clienti c WHERE c.nume = :nume"),
    @NamedQuery(name = "Clienti.findByAdresa", query = "SELECT c FROM Clienti c WHERE c.adresa = :adresa"),
    @NamedQuery(name = "Clienti.findByEmail", query = "SELECT c FROM Clienti c WHERE c.email = :email"),
    @NamedQuery(name = "Clienti.findByTelefon", query = "SELECT c FROM Clienti c WHERE c.telefon = :telefon")})
public class Clienti implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_client")
    private Integer idClient;
    @Column(name = "nume")
    private String nume;
    @Column(name = "adresa")
    private String adresa;
    @Column(name = "email")
    private String email;
    @Column(name = "telefon")
    private String telefon;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienti")
    private List<Comenzi> comenziList;

    public Clienti() {
    }

    public Clienti(Integer idClient) {
        this.idClient = idClient;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
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

    public List<Comenzi> getComenziList() {
        return comenziList;
    }

    public void setComenziList(List<Comenzi> comenziList) {
        this.comenziList = comenziList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClient != null ? idClient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clienti)) {
            return false;
        }
        Clienti other = (Clienti) object;
        if ((this.idClient == null && other.idClient != null) || (this.idClient != null && !this.idClient.equals(other.idClient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.Clienti[idClient=" + idClient + "]";
    }

}
