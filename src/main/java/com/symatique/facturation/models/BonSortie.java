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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

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
@Table(name="T_BonSortie")
public class BonSortie implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="BSo_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="BSo_Expedieur")
    private String expedditeur;
    
    @Column(name="BSo_Mat_Fisc")
    private String MatriculeFisc;
    
	/*
	 * @Column(name="BSo_Date")
	 * 
	 * @Temporal(javax.persistence.TemporalType.DATE) private Date date;
	 */
    @Column(name="BSo_Immatriculation")
    private String immatriculation;
    
    @OneToMany(targetEntity=DetailsBonSortie.class, mappedBy="bonSortie", cascade=CascadeType.ALL)
    private List<DetailsBonSortie> detailsBonSortie = new ArrayList<>();

    
    @OneToMany(targetEntity=Piece.class, mappedBy="bonSortie", cascade=CascadeType.ALL)
    private List<Piece> pieces = new ArrayList<>();

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }
        
    
    

    public List<DetailsBonSortie> getDetailsBonSortie() {
		return detailsBonSortie;
	}

	public void setDetailsBonSortie(List<DetailsBonSortie> detailsBonSortie) {
		this.detailsBonSortie = detailsBonSortie;
	}

	public String getExpedditeur() {
        return expedditeur;
    }

    public void setExpedditeur(String expedditeur) {
        this.expedditeur = expedditeur;
    }

    public String getMatriculeFisc() {
        return MatriculeFisc;
    }

    public void setMatriculeFisc(String MatriculeFisc) {
        this.MatriculeFisc = MatriculeFisc;
    }



    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
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
        if (!(object instanceof BonSortie)) {
            return false;
        }
        BonSortie other = (BonSortie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.symatique.facturation.entity.BonSortie[ id=" + id + " ]";
    }
    
}
