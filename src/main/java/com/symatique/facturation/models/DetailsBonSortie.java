package com.symatique.facturation.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="T_Details_BonSortie")
public class DetailsBonSortie implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Column(name="DBS_Id")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   
   
   @Column(name="DBS_reference")
   private String referenceArticle;
       
   
   @Column(name="DBS_Quantite")
   private float quantite;
       
   @Column(name="DBS_Prix")
   private float prix;
           
   @Column(name="DBS_Date_Exp")
   private String dateExp;
   
   
   
   
  @ManyToOne @JoinColumn(name="BSo_Id", nullable=false)
   private BonSortie bonSortie;

   public String getReferenceArticle() {
       return referenceArticle;
   }

   public void setReferenceArticle(String referenceArticle) {
       this.referenceArticle = referenceArticle;
   }

   public float getQuantite() {
       return quantite;
   }

   public void setQuantite(float quantite) {
       this.quantite = quantite;
   }

   public float getPrix() {
       return prix;
   }

   public void setPrix(float prix) {
       this.prix = prix;
   }

   public String getDateExp() {
       return dateExp;
   }

   public void setDateExp(String dateExp) {
       this.dateExp = dateExp;
   }

   public BonSortie getBonSortie() {
       return bonSortie;
   }

   public void setBonSortie(BonSortie BonSortie) {
       this.bonSortie = BonSortie;
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
       if (!(object instanceof DetailsBonSortie)) {
           return false;
       }
       DetailsBonSortie other = (DetailsBonSortie) object;
       if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
           return false;
       }
       return true;
   }

   @Override
   public String toString() {
       return "com.symatique.facturation.entity.DetailsBonSortie[ id=" + id + " ]";
   }
   
}
