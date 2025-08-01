package training.afpa.cda24060.exercices.exoalgo;

import java.util.Scanner;

import static training.afpa.cda24060.methode.UserInput.userInput;

public class Exo2_Factorielle {


    public static void factorielle() {
        int valeurSaisie = userInput("Entrer une valeur :");
        int resultat=1;
        int compteur = valeurSaisie ;

       if (compteur == 0 || valeurSaisie == 1) {
            System.out.println("la factorielle de " +  valeurSaisie + " est " + resultat);
        } else {
            while (compteur > 1) {
                resultat*=compteur;
                compteur--;
            }
           System.out.println("La factorielle de "+ valeurSaisie + " est " + resultat);
        }



    }

}
