package com.symatique.facturation.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author fir19
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="T_Details_Facture")
public class DetailsFacture implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="DFct_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="DFct_Reference")
    private String refercnce;
    
    @Column(name="DFct_Prix_Ht")
    private float prixHt;
    
    @Column(name="DFct_Quantite")
    private float quantite;
    
    @Column(name="DFct_Tva")
    private float tva;
    
    @Column(name="DFct_Unite")
    private String unite;
    
        
    @Column(name="DFct_Prix_Ttc")
    private float prixTtc;  
    
    
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "Fac_Id", referencedColumnName = "Fac_Id", nullable = false)
    private Facture facture;

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }
    

    public String getRefercnce() {
        return refercnce;
    }

    public void setRefercnce(String refercnce) {
        this.refercnce = refercnce;
    }

    public float getPrixHt() {
        return prixHt;
    }

    public void setPrixHt(float prixHt) {
        this.prixHt = prixHt;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    public float getTva() {
        return tva;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public float getPrixTtc() {
        return prixTtc;
    }

    public void setPrixTtc(float prixTtc) {
        this.prixTtc = prixTtc;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof DetailsFacture)) {
            return false;
        }
        DetailsFacture other = (DetailsFacture) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.symatique.facturation.entity.DetailsFacture[ id=" + id + " ]";
    }
    
}
