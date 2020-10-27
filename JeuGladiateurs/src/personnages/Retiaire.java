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
public class Retiaire extends Personnage{
    String nomClasse;
    int luck;
    boolean filet;
    int grab;
    
    public String getNomClasse() {
        return nomClasse;
    }
    
    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }
    
    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini,String nomClasse, boolean filet){
        super(nom,attaqueMax,defense,pvs,ini);
        this.nomClasse = nomClasse;
        this.filet = filet;
        this.grab=1;
        this.luck = (int) (Math.random() * 10);
    }
    
    public Retiaire(){
        nomClasse="";
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible){
        
            int i = (int) (Math.random() * 10);
            if (this.luck == i && filet == true && grab > 0){
                super.frapperPersonnage(personnageCible);
                personnageCible.pvs = 0;
                System.out.println("Son filet attrape Bob le malchanceux et il l’empale sauvagement avec sa lance");           
            } else if (this.luck != i && filet == true && grab > 0 ){
                filet = false;
                System.out.println("Le filet n'atteint pas sa cible");
            } else if(filet == false && grab == 0){
                    super.frapperPersonnage(personnageCible);
            } else {
                grab++;
                super.frapperPersonnage(personnageCible);
                System.out.println("Igor l'empaleur ramasse son filet et en profite pour attaquer");
            }
            
            
            
    }
    
    public void afficherInfosClasse() {
        super.afficherInfosPersonnage();
        System.out.println("    Classe : " + this.nomClasse);
    }
}