package training.afpa.cda24060.exercices.exoalgo;

import static training.afpa.cda24060.methode.UserInput.userInput;

public class Exo4_CalculPuissance {
    public static void calculPuissance() {

        int x = userInput("Saisir la valeur de x :");
        int y = userInput("Saisir la valeur de y :");
        double resultat;

        if(y==0) {
            resultat = 1;
        } else if(x == 0) {
            resultat = 0;
        } else {
            resultat = Math.pow(x, y);

        }
        System.out.println("Le resutlat est " + resultat);
    }
}
