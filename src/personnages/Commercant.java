package personnages;

public class Commercant extends Humain {
    public Commercant(String nom, int argent) {
        super(nom, "thé", argent);
    }

    public int seFaireExtorquer() {
        int montantExtorque = getArgent();
        perdreArgent(montantExtorque); 
        parler("Le monde est vraiment trop injuste !");
        return montantExtorque;
    }

    public void recevoir(int argent) {
        gagnerArgent(argent);
        parler(argent + " sous ! Je te remercie généreux donateur!");
    }
}
