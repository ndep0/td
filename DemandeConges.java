package com.objis.inter;

public class DemandeConges {
	
 private String ACCORDE;
 private String ATTENTE;
 private String dateDebut;
 private String dateFin;
 private String etatValidation;
 private String REFUS;
 private String DateDemande;
 
 public DemandeConges(String ACCORDE, String REFUS, String ATTENTE){
	 
	 this.ACCORDE = ACCORDE;
	 this.REFUS = REFUS;
	 this.ATTENTE = ATTENTE ;
	 
 }
 
 public DemandeConges(String dateFin , String dateDebut ){
	 
	 this.dateFin  =dateFin  ;
	 
	 this.dateDebut = dateDebut;
	 
 }

private String getDateDebut() {
	return dateDebut;
}

private void setDateDebut(String dateDebut) {
	this.dateDebut = dateDebut;
}

private String getDateFin() {
	return dateFin;
}

private void setDateFin(String dateFin) {
	this.dateFin = dateFin;
}

private String getEtatValidation() {
	return etatValidation;
}

private void setEtatValidation(String etatValidation) {
	this.etatValidation = etatValidation;
}

private String getDateDemande() {
	return DateDemande;
}

private void setDateDemande(String dateDemande) {
	DateDemande = dateDemande;
}

@Override
public String toString() {
	return "DemandeConges [ACCORDE=" + ACCORDE + ", ATTENTE=" + ATTENTE + ", dateDebut=" + dateDebut + ", dateFin="
			+ dateFin + ", etatValidation=" + etatValidation + ", REFUS=" + REFUS + ", DateDemande=" + DateDemande
			+ "]";
}
 
 
 

}
