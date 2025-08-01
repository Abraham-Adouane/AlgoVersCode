package training.afpa.cda24060.exercices.exoalgo;
//Ecrire un algorithme en pseudocode permettant le range ment dans un tableau d’entiers à deux dimensions « Tableau Factorielles » des 10 premiers entiers numériques et de leur factorielle respective.

import java.time.temporal.TemporalAccessor;

import static training.afpa.cda24060.methode.UserInput.setIntValue;

public class Exo6_TableauFactorielle {
    public static int getFactorial(int value){
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }


    public static void tableauFactorielle(){
        int indiceColonne = 0;
        int indiceLigne = 0;
        int x;
        int[][] tableauFactorielle = new int[10][2];
//Creation du tableau
        for (int i = 0; i < tableauFactorielle.length; i++) {
            tableauFactorielle[i][0] = i + 1;
            tableauFactorielle[i][1] = getFactorial(i + 1);
        }

//affichage du tableau
//        for (int i = 0; i < tableauFactorielle.length; i++) {
//            System.out.println("Number: " + tableauFactorielle[i][0] +
//                    ", Factorial: " + tableauFactorielle[i][1]);
//        }

     x = setIntValue("Pour quelle valeur entière souhaitez-vous calculer la factorielle ? ( entre 1 et 10 )");

            if (x< 1 || x > 10) {
                System.out.println("x doit etre comprise entre 1 et 10");
            } else {
                int result = tableauFactorielle[x-1][1];
                System.out.println("La factorielle de " + x + " est :  " + result);
            }


    }
}
