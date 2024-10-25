package histoire;

import personnages.Humain;

public class HistoireTP4 {
    public static void main(String[] args) {

        Humain prof = new Humain("Prof", "kombucha", 54);
        
        prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous.");
        prof.acheter("boisson", 12);
        prof.boire();
        
        prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous.");
        prof.acheter("jeu", 2);

        prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir un kimono à 50 sous.");
        prof.acheter("kimono", 50);
    
}
}