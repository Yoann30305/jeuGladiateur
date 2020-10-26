package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static  void main(String[] args) {

        // *************************************************************************
        // *************************************************************************
        // *************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Instanciation des objets">
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        Personnage personnage1 = new Personnage("Bob le malchanceux",15,15,70,15);
        Personnage personnage2 = new Personnage("Igor l'empaleur",25,5,100,30);
        // </editor-fold>

        // *************************************************************************
        // *************************************************************************
        // *************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        // TODO : Afficher les infos de chaque personnage
       System.out.println("");
       personnage1.afficherInfosPersonnage();
       System.out.println("");
       personnage2.afficherInfosPersonnage();
       System.out.println("");
        
        // TODO : Afficher le message du début du combat
       AffichageEcran debut;
       debut = new AffichageEcran();
       debut.afficherDebutCombat();
       
       while(personnage1.pvs > 0 && personnage2.pvs > 0){
       //affichage tour
       tour.afficheTour();
       System.out.println("");
       
       //boucle initiative
       for (int i = 0;i<=100;i++){
           if (personnage1.ini == i){
               personnage1.frapperPersonnage(personnage2);
           }
           if (personnage2.ini == i){
           personnage2.frapperPersonnage(personnage2);
       }
       }
       
       //afficher separateur
       System.out.println("");
       affichage.afficherSeparateurInfosPerso();
       
       //afficher infos persos
       System.out.println("");
       personnage1.afficherInfosPersonnage();
       System.out.println("");
       personnage2.afficherInfosPersonnage();
       System.out.println("");
       
       //changement valeur ini
       personnage1.setNewInitiativeRandom();
       personnage2.setNewInitiativeRandom();
       
       //Incrémenter le compteur de tour
       tour.augmenteTour();
       
       //separateur de tour
       affichage.afficherSeparateurDeTour();
       }
      
       System.out.println("");
    
    if (personnage1.pvs > 0){
    System.out.println(personnage1.nom + " gagne le combat !!! ");
}
    
    if (personnage2.pvs > 0){
    System.out.println(personnage2.nom + " gagne le combat !!! ");
        
        // </editor-fold>

        // *************************************************************************
        // *************************************************************************
        // *************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        // TODO : La boucle contenant les étapes du combat
        // TODO : Après la boucle, afficher le résultat du combat
        // </editor-fold>
        
    }
    
    
}

    

}
