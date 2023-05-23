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
@Table(name = "T_Pieces")
@Entity
public class Piece implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "Pie_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    

    @Column(name = "Pie_Prix")
    private float prix;


    @Column(name = "Pie_Barcode")
    private Long barcode;

    @ManyToOne
    @JoinColumn(name = "Fac_Id", nullable = false)
    private Facture facture;

    @ManyToOne
    @JoinColumn(name = "BLiv_Id", nullable = false)
    private BonLivraison bonLivraison;

    @ManyToOne
    @JoinColumn(name = "Sto_Id", nullable = false)
    private Stock stock;

    @ManyToOne
    @JoinColumn(name = "BSo_Id", nullable = false)
    private BonSortie bonSortie;

    public Long getId() {
        return id;
    }

    public Long getBarcode() {
        return barcode;
    }

    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }

    public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public void setId(Long id) {
        this.id = id;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public BonLivraison getBonLivraison() {
        return bonLivraison;
    }

    public void setBonLivraison(BonLivraison bonLivraison) {
        this.bonLivraison = bonLivraison;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public BonSortie getBonSortie() {
        return bonSortie;
    }

    public void setBonSortie(BonSortie bonSortie) {
        this.bonSortie = bonSortie;
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
        if (!(object instanceof Piece)) {
            return false;
        }
        Piece other = (Piece) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.symatique.facturation.entity.Piece[ id=" + id + " ]";
    }

}
