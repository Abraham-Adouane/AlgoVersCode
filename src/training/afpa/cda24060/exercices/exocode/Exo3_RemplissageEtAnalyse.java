package training.afpa.cda24060.exercices.exocode;

import java.util.Scanner;

public class Exo3_RemplissageEtAnalyse {

    public static int[] saisieUtilisateur(){
        int nbValeur;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Indiquer le nombre de valeurs (0 à 100) :");
            nbValeur  = sc.nextInt();
        } while (nbValeur < 0 || nbValeur > 100);
        int[] tab = new int[nbValeur];
        for (int i = 0; i < nbValeur; i++) {
            System.out.println("Entrer un entier (positif, negatif ou nul)");

            tab[i] = sc.nextInt();
        }
        return tab;

    }
    public static void afficherTableau(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }


    public static void analyserTableau(int[] tab) {
        int nombrePositifs = 0;
        int sommePositifs = 0;
        int nombreNegatifs = 0;
        int sommeNegatifs = 0;
        int nombreNuls = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                nombrePositifs++;
                sommePositifs += tab[i];
            } else if (tab[i] < 0) {
                nombreNegatifs++;
                sommeNegatifs += tab[i];
            }else {
                nombreNuls++;
            }
        }
        //calcul Moyenne

        float moyennePositifs = nombrePositifs > 0 ?
                sommePositifs / nombrePositifs:
                0;
        float moyenneNegatif = nombreNegatifs > 0 ?
                sommeNegatifs / nombreNegatifs:
                0;

        // Afficher les résultats
        System.out.println("Nombre d'entier positifs: " + nombrePositifs + " - Moyenne : " + moyennePositifs);
        System.out.println("Nombre d'entier negatifs: " + nombreNegatifs + " - Moyenne : " + moyenneNegatif);
        System.out.println("Nombre d'entier nuls: " + nombreNuls);
    }

    public static void remplissageEtAnalyse() {
        int[] tab = saisieUtilisateur();
        afficherTableau(tab);
        analyserTableau(tab);
    }
}
