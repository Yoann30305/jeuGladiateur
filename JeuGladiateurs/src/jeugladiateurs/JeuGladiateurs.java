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
