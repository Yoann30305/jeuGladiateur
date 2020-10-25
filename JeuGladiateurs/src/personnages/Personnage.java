package personnages;

public class Personnage {

    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    //TODO : Mettre vos attributs ici
    private String nom;
    private int pvs;
    private int attaqueMax;
    private int defense;
    private int ini;
    
    
    // </editor-fold>

    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC paramètres
        this.nom = nom;
        this.attaqueMax = attaqueMax;
        this.defense = defense;
        this.pvs = pvs;
        this.ini = ini;
    }
    public Personnage() {
        // TODO : Constructeur SANS paramètres qui initialise à ZÉRO ou à ""
        nom = "";
        attaqueMax = 0;
        defense = 0;
        pvs = 0;
        ini = 0;
        
        
    }
    // </editor-fold>

    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Les getters
    public String getNom() {
        return nom;
    }
    
    public int getPvs() {
        return pvs;
    }
     
    public int getAttaqueMax() {
        return attaqueMax;
    }
    
    public int getDefense() {
        return defense;
    }
    
    public int getIni() {
        return ini;
    }
    // TODO : Les setters

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setNom(int pvs) {
        this.pvs = pvs;
    }
    
    public void setAttaqueMax(int attaqueMax) {
        this.attaqueMax = attaqueMax;
    }
    
    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    public void setIni(int ini) {
        this.ini = ini;
    }
    // </editor-fold>

    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
        System.out.println(this.nom);
        System.out.println("    Attaque : " + this.attaqueMax);
        System.out.println("    Défense : " + this.defense);
        System.out.println("    Points de vies : " + this.pvs);
        System.out.println("    Initiative : " + this.ini);
        
        if (pvs >= 0) {
            System.out.println("    Statut : mort");
            }
        else {
                System.out.println("    Statut : vivant");
                }
            
       
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return 0;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
