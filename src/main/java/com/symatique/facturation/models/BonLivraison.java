
package com.symatique.facturation.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.groups.Default;

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
@Table(name="T_Bon_Livraison")
public class BonLivraison implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="BLiv_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="BLiv_Montant")
    private float montant;
    
    @Column(name="BLiv_Date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    
        
    @Column(name="BLiv_Paiement")
    private String paiement;
    
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
    



    

    @OneToMany(targetEntity=DetailsBonLivraison.class, mappedBy="bonLivraison", cascade=CascadeType.ALL)
    private List<DetailsBonLivraison> detailsBonLivraison = new ArrayList<>();




    @OneToMany(targetEntity=Piece.class, mappedBy="bonLivraison", cascade=CascadeType.ALL)
    private List<Piece> pieces = new ArrayList<>();

    public List<DetailsBonLivraison> getDetailsBonLivraison() {
        return detailsBonLivraison;
    }

    public void setDetailsBonLivraison(List<DetailsBonLivraison> detailsBonLivraison) {
        this.detailsBonLivraison = detailsBonLivraison;
    }
    

    




    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }


    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPaiement() {
        return paiement;
    }

    public void setPaiement(String paiement) {
        this.paiement = paiement;
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
        if (!(object instanceof BonLivraison)) {
            return false;
        }
        BonLivraison other = (BonLivraison) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return user.toString();
    }
    
}
