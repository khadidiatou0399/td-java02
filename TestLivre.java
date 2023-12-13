public class TestLivre 
{ 
public static void main(String[] args) { 
Livre l1 = new Livre("Victor Hugo", "Notre Dame de Paris");
l1.setNbPages(150); 
Livre l2 = new Livre("Emile Zola", "La bête humaine");
l2.setNbPages(170);
System.out.print("Livre de " + l1.getAuteur()); 
System.out.println(" avec " + l1.getNbPages() + " pages."); 
System.out.print("Livre de " + l2.getAuteur()); 
System.out.println(" avec " + l2.getNbPages() + " pages.");
System.out.println("Total des pages : " + (l1.getNbPages() + l2.getNbPages())); 
}
