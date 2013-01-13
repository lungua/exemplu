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
@Table(name = "comenzi")
@NamedQueries({
    @NamedQuery(name = "Comenzi.findAll", query = "SELECT c FROM Comenzi c"),
    @NamedQuery(name = "Comenzi.findByIdComanda", query = "SELECT c FROM Comenzi c WHERE c.idComanda = :idComanda"),
    @NamedQuery(name = "Comenzi.findByDataLansare", query = "SELECT c FROM Comenzi c WHERE c.dataLansare = :dataLansare"),
    @NamedQuery(name = "Comenzi.findByDataFinalizare", query = "SELECT c FROM Comenzi c WHERE c.dataFinalizare = :dataFinalizare"),
    @NamedQuery(name = "Comenzi.findByNume", query = "SELECT c FROM Comenzi c WHERE c.nume = :nume"),
    @NamedQuery(name = "Comenzi.findByTimpDeLucru", query = "SELECT c FROM Comenzi c WHERE c.timpDeLucru = :timpDeLucru"),
    @NamedQuery(name = "Comenzi.findByValoareMateriale", query = "SELECT c FROM Comenzi c WHERE c.valoareMateriale = :valoareMateriale"),
    @NamedQuery(name = "Comenzi.findByValoareManopera", query = "SELECT c FROM Comenzi c WHERE c.valoareManopera = :valoareManopera"),
    @NamedQuery(name = "Comenzi.findByValoareTotala", query = "SELECT c FROM Comenzi c WHERE c.valoareTotala = :valoareTotala")})
public class Comenzi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_comanda")
    private Integer idComanda;
    @Column(name = "data_lansare")
    @Temporal(TemporalType.DATE)
    private Date dataLansare;
    @Column(name = "data_finalizare")
    @Temporal(TemporalType.DATE)
    private Date dataFinalizare;
    @Column(name = "nume")
    private String nume;
    @Column(name = "timp_de_lucru")
    private Integer timpDeLucru;
    @Column(name = "valoare_materiale")
    private Integer valoareMateriale;
    @Column(name = "valoare_manopera")
    private Integer valoareManopera;
    @Column(name = "valoare_totala")
    private Integer valoareTotala;
    @JoinColumn(name = "SALARIATI_id_salariat", referencedColumnName = "id_salariat")
    @ManyToOne(optional = false)
    private Salariati salariati;
    @JoinColumn(name = "CLIENTI_id_client", referencedColumnName = "id_client")
    @ManyToOne(optional = false)
    private Clienti clienti;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comenzi")
    private List<MaterialeComanda> materialeComandaList;

    public Comenzi() {
    }

    public Comenzi(Integer idComanda) {
        this.idComanda = idComanda;
    }

    public Integer getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(Integer idComanda) {
        this.idComanda = idComanda;
    }

    public Date getDataLansare() {
        return dataLansare;
    }

    public void setDataLansare(Date dataLansare) {
        this.dataLansare = dataLansare;
    }

    public Date getDataFinalizare() {
        return dataFinalizare;
    }

    public void setDataFinalizare(Date dataFinalizare) {
        this.dataFinalizare = dataFinalizare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getTimpDeLucru() {
        return timpDeLucru;
    }

    public void setTimpDeLucru(Integer timpDeLucru) {
        this.timpDeLucru = timpDeLucru;
    }

    public Integer getValoareMateriale() {
        return valoareMateriale;
    }

    public void setValoareMateriale(Integer valoareMateriale) {
        this.valoareMateriale = valoareMateriale;
    }

    public Integer getValoareManopera() {
        return valoareManopera;
    }

    public void setValoareManopera(Integer valoareManopera) {
        this.valoareManopera = valoareManopera;
    }

    public Integer getValoareTotala() {
        return valoareTotala;
    }

    public void setValoareTotala(Integer valoareTotala) {
        this.valoareTotala = valoareTotala;
    }

    public Salariati getSalariati() {
        return salariati;
    }

    public void setSalariati(Salariati salariati) {
        this.salariati = salariati;
    }

    public Clienti getClienti() {
        return clienti;
    }

    public void setClienti(Clienti clienti) {
        this.clienti = clienti;
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
        hash += (idComanda != null ? idComanda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comenzi)) {
            return false;
        }
        Comenzi other = (Comenzi) object;
        if ((this.idComanda == null && other.idComanda != null) || (this.idComanda != null && !this.idComanda.equals(other.idComanda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.Comenzi[idComanda=" + idComanda + "]";
    }

}
