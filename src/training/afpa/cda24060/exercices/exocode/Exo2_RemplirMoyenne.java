package training.afpa.cda24060.exercices.exocode;

import java.util.Arrays;
import java.util.Scanner;

public class Exo2_RemplirMoyenne {
    public static float calculerMoyenne(float[] tab) {
        int somme = 0;
        float moyenne;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        moyenne = (float) somme / tab.length;
        return moyenne;
    }
    public static float[] saisieValeur(){
        Scanner input = new Scanner(System.in);
        System.out.println("Saisir le nombre de valeur a entrer :");
        int nbValeur = input.nextInt();
        float[] tab = new float[nbValeur];
        for (int i=0; i<nbValeur; i++) {
            System.out.println("Entrez la valeur " + i +" :");
            tab[i] = input.nextFloat();
        }
        return tab;
    }

    public static void afficherTableau(float[] notes) {
//        for(float note : notes){
//            System.out.println(note);
//        }
        System.out.print("Tableau :" +  Arrays.toString(notes));
    }
    public static void RemplirMoyenne(){
        float[] tab = saisieValeur();
        afficherTableau(tab);
        System.out.println("La moyenne des valeurs dans le tableau est : " + calculerMoyenne(tab) );
    }
}
