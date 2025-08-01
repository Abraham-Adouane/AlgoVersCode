package training.afpa.cda24060.exercices.exoalgo;

import java.util.Scanner;

import static training.afpa.cda24060.methode.UserInput.setIntValue;
import static training.afpa.cda24060.methode.UserInput.userInput;

public class Exo2_Factorielle {

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }

    public static void factorielle() {
        int valeurSaisie = setIntValue("Entrer une valeur :");
        int resultat=1;
        int compteur = valeurSaisie ;

       if (compteur == 0 || valeurSaisie == 1) {
            System.out.println("la factorielle de " +  valeurSaisie + " est " + resultat);
        } else {
            resultat = getFactorial(valeurSaisie);
           System.out.println("La factorielle de "+ valeurSaisie + " est " + resultat);
        }



    }

}
