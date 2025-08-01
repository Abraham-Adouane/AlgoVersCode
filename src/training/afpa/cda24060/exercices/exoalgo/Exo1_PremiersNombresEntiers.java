package training.afpa.cda24060.exercices.exoalgo;

import java.util.Scanner;

public class Exo1_PremiersNombresEntiers {

    public static int setValue(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.print(msg);
        return input.nextInt();
    }
    public static void premiersNombresEntiers() {
        int valeurSaisie = setValue("Entrer une valeur: ");
        int resultat = 0;
        int compteur = 1;


        while (compteur <= valeurSaisie) {
            resultat += compteur;
            compteur++;
        }

        System.out.print("Le resultat avec tant que est : "+ resultat);


    }
}
