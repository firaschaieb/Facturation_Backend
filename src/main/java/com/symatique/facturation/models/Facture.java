package com.symatique.facturation.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@Table(name="T_Facture")
public class Facture implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="Fac_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    @Column(name="Fac_Date")
	@Temporal(TemporalType.DATE)
    private Date date;
        
    @Column(name="Fac_Tva")
    private float tva;
        
    @Column(name="Fac_Total_Ht")
    private float totalHt;
    
    @Column(name="Fac_Total_Ttc")
    private float totalTtc;
    
    @Column(name="Fac_Paiement")
    private String paiement;
    

    @ManyToOne
    @JsonBackReference(value ="facture_user")
   @JoinColumn(name="user_id", nullable=false)
    private User user;
    
            
    @OneToMany(targetEntity=Piece.class, mappedBy="facture", cascade=CascadeType.ALL)
    private List<Piece> pieces = new ArrayList<>();
    


    @ManyToOne
    @JoinColumn(name="client_id", nullable=false)
    private Client client;
    
    @OneToMany(mappedBy = "facture", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DetailsFacture> detailsFacture;
    
    
    //----------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------

    public List<DetailsFacture> getDetailsFacture() {
        return detailsFacture;
    }

    public void setDetailsFacture(List<DetailsFacture> detailsFacture) {
        this.detailsFacture = detailsFacture;
    }
    
    
    
    public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDate() {
        return date;
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





    public void setDate(Date date) {
        this.date = date;
    }

    public float getTva() {
        return tva;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }

    public float getTotalHt() {
        return totalHt;
    }

    public void setTotalHt(float totalHt) {
        this.totalHt = totalHt;
    }

    public float getTotalTtc() {
        return totalTtc;
    }

    public void setTotalTtc(float totalTtc) {
        this.totalTtc = totalTtc;
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
        if (!(object instanceof Facture)) {
            return false;
        }
        Facture other = (Facture) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.symatique.facturation.entity.Facture[ id=" + id + " ]";
    }
    
}
