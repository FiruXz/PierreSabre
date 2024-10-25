package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
    public static void main(String[] args) {
    	
    	//Histoire du prof
    	
        Humain prof = new Humain("Prof", "kombucha", 54);
        
        prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous.");
        prof.acheter("boisson", 12);
        prof.boire();
        
        prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous.");
        prof.acheter("jeu", 2);

        prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir un kimono à 50 sous.");
        prof.acheter("kimono", 50);
   
        //Histoire du Commercant
        
        Commercant marco = new Commercant("Marco", 20);
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15); 
        marco.boire();
        
        //Histoire du Yakuza
        

        Yakuza yaku = new Yakuza("Yaku Le Noir", "Warsong", 30);


        yaku.direBonjour();
        yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        yaku.parler(marco.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
        yaku.extorquer(marco);
}
    
}
