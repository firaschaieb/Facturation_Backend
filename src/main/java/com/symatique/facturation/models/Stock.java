package com.symatique.facturation.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
@Table(name="T_Stock")
public class Stock  implements Serializable{


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Sto_Id")
    private Long id;


    
    @Column(name="Sto_Libelle")
    private String libelle;
    
    @OneToOne
    @JsonBackReference(value ="user_stock")
    @JoinColumn( name="user_id" )
     private User user;

    
    @OneToMany(targetEntity=DetailsStock.class, mappedBy="stock", cascade=CascadeType.ALL)
    private List<DetailsStock> stockDetails = new ArrayList<>();
    
    @OneToMany(targetEntity=Piece.class, mappedBy="stock", cascade=CascadeType.ALL)
    private List<Piece> pieces = new ArrayList<>();

    public List<DetailsStock> getStockDetails() {
        return stockDetails;
    }

    public void setStockDetails(List<DetailsStock> stockDetails) {
        this.stockDetails = stockDetails;
    }



    
    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }
    



    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
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
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return libelle;
    }
    
}
