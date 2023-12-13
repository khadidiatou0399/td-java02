public class Livre {
// Variables 
private String titre, auteur; 
private int nbPages;  
// Constructeur 
public Livre(String unAuteur, String unTitre) { 
auteur = unAuteur; 
titre = unTitre; 
} 
// Accesseur 
public String getAuteur(){ 
return auteur;
}
// Modificateur 
public void setNbPages(int nb) { 
nbPages = nb; 
}  
public static void main(String[] args) { 
Livre l1 = new Livre("Mariama Ba", "Une Si Longue Lettre"); 
Livre l2 = new Livre("Camara Laye", "L'Enfant Noir"); 
System.out.println("Livre de " + l1.getAuteur()); 
System.out.println("Livre de " + l2.getAuteur()); 
} 

public String getTitre() { 
return titre; 
}
public int getNbPages() {
return nbPages; 
} 
// Modificateur
public void setAuteur(String unAuteur) {
auteur = unAuteur; 
}
public void setTitre(String unTitre) {
titre = unTitre;
} 

public static void main(String[] args) { 
Livre l1 = new Livre("Mariama Ba", "Une Si Longue Lettre");
l1.setNbPages(150);
Livre l2 = new Livre("Camara Laye", "L'Enfant Noir");
l2.setNbPages(170); 
System.out.print("Livre de " + l1.getAuteur()); 
System.out.println(" avec " + l1.getNbPages() + " pages."); 
System.out.print("Livre de " + l2.getAuteur()); 
System.out.println(" avec " + l2.getNbPages() + " pages.");
System.out.println("Total des pages : " + (l1.getNbPages() + l2.getNbPages())); 
}

public void setNbPages(int n) {
if (n > 0) { 
nbPages = n;
} else {

System.err.println("Erreur : nombre de pages négatif !"); 
}
}
}
