/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnages;

/**
 *
 * @author Yoann
 */
public class Mirmillon extends Personnage{
    String nomClasse;
    
    
    public String getNomClasse() {
        return nomClasse;
    }
    
    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }
    
    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini,String nomClasse){
        super(nom,attaqueMax,defense,pvs,ini);
        this.nomClasse = nomClasse;
    }
    
    public Mirmillon(){
        this.nomClasse= "";
    }
    
    public void afficherInfosClasse() {
        super.afficherInfosPersonnage();
        System.out.println("    Classe : " + nomClasse);
    }
    
    @Override
    public void setNewInitiativeRandom(){
        ini = (int) (Math.random() * 30);
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible){
        
            super.frapperPersonnage(personnageCible);
            
            if (personnageCible.pvs > 0){
                super.frapperPersonnage(personnageCible);
            } else if (personnageCible.pvs <= 0) {
                System.out.println();
                System.out.println("Décapitation de l'adversaire ! ");
            }
        
    }
    
}
