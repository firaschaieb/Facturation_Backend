package com.symatique.facturation.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name="T_Client")
public class Client  implements Serializable{


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="Cli_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="Cli_Prenom")
    private String prenom;
    
    @Column(name="Cli_Nom")
    private String nom;
    
        
    @Column(name="Cli_address")
    private String address;
    
   


    @JsonBackReference
   @ManyToOne 
   @JoinColumn(name="user_id", nullable=false)
    private User user;
    
    


    
    
    public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

	public Long getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.symatique.facturation.entity.Client[ id=" + id + " ]";
    }
    
}
