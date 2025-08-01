package training.afpa.cda24060.exercices.exocode;

import java.util.Locale;
import java.util.Scanner;

import static training.afpa.cda24060.methode.UserInput.userInput;


public class Exo6_TriTableau {

    public static int[] creationTableau(){
        int nbValeur = userInput("nombre de valeur");
        int[] tab = new int[nbValeur];
        for (int i = 0; i < nbValeur; i++) {
            tab[i] = (int)Math.floor(Math.random()*100);

        }
        return tab;
    }
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
    }

    public static void trierTableau(int[] tableau, boolean ordreCroissant) {
        boolean permuter;
        int temp;
        do {
            permuter = false;
            for (int i = 0; i < tableau.length-1; i++) {
                if ((ordreCroissant && tableau[i] > tableau[i + 1]) || (!ordreCroissant && tableau[i] < tableau[i + 1])) {
                    temp = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = temp;
                    permuter = true;
                }
            }
        }while (!permuter);
    }

    public static boolean estCroissant() {
        String reponse;
        System.out.println("Voulez vous trier le tableau par ordre croissant ? (Oui / Non)");
        Scanner sc = new Scanner(System.in);
        reponse =  sc.nextLine().toLowerCase(Locale.ROOT);
        return reponse.equals("oui");
    }
    public static void triTableauMain() {
        int[] tableau = creationTableau();
        System.out.println("Tableau non trié :");
        afficherTableau(tableau);
        trierTableau(tableau, estCroissant());
        System.out.println("Tableau trié :");
        afficherTableau(tableau);
    }
}
