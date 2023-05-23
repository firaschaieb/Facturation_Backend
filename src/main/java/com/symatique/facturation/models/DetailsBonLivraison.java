package com.symatique.facturation.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Table(name = "T_BL_Details")
public class DetailsBonLivraison implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "DBL_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DBL_Reference")
    private String refercnce;

    @Column(name = "DBL_Det_Prix")
    private float prix;

    @Column(name = "DBL_Det_Quantite")
    private float quantite;

    @Column(name = "DBL_Det_Unite")
    private String unite;

    @ManyToOne
    @JoinColumn(name = "BLiv_Id", nullable = false)
    private BonLivraison bonLivraison;

    
    
    
    

    public String getRefercnce() {
        return refercnce;
    }

    public void setRefercnce(String refercnce) {
        this.refercnce = refercnce;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public BonLivraison getBonLivraison() {
        return bonLivraison;
    }

    public void setBonLivraison(BonLivraison bonLivraison) {
        this.bonLivraison = bonLivraison;
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
        if (!(object instanceof DetailsBonLivraison)) {
            return false;
        }
        DetailsBonLivraison other = (DetailsBonLivraison) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return refercnce+"";
    }

}
