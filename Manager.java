package com.objis.inter;

public class Manager extends Employe{

private String nom;
private int id;
private String prenom;

public Manager( String nom){
	   super();
	   this.nom = nom;
	   
}


public Manager( String nom, String prenom){
	   super();
	   this.nom = nom;
	   this.prenom = prenom;
}

public Manager( String nom, String prenom,int id){
	   super();
	   this.nom = nom;
	   this.prenom = prenom;
	   this.id = id;
}

public void poserConge(String nom, String prenom){
	this.nom = nom;
	this.prenom = prenom;
}


@Override
public String toString() {
	return "Manager [nom=" + nom + ", id=" + id + ", prenom=" + prenom + "]";
}

public void validerConge(){}






}





