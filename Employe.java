package com.objis.inter;
import java.outil.collection;
/**
 * @author landry
 *
 */


public class Employe implements IPersonnel {
	

private int id;
private String nom;
private String prenom;



public Employe( String nom, String prenom){
	   super();
	   this.nom = nom;
	   this.prenom = prenom;
}

public Employe( String nom, String prenom,int id){
	   super();
	   this.nom = nom;
	   this.prenom = prenom;
	   this.id = id;
}

public Employe(String nom){
	super();
	this.nom = nom;
	
}

public Employe(){}

public collection consulterConges(){
	  return null;
	}

public String getNom(){
	   return nom;
}

public String getPrenom(){
	   return prenom;
}

public int getId(){
	   return id;
}

public void poserConge(String nom, String prenom){
	this.nom = nom;
	this.prenom = prenom;
}
public void setNom(String nom){
	   this.nom = nom;
}

public void setPrenom(String prenom){
	   this.prenom = prenom;
}

@Override
public String toString() {
	return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
}



}
