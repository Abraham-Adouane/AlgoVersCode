package training.afpa.cda24060.exercices.exoalgo;

import static training.afpa.cda24060.methode.UserInput.userInput;

public class Exo5_RechercheDichotomique {


    public static int rechercheEntier(int[] tab, int valeurRecherche) {
        int indiceBas = 0;
        int indiceHaut = tab.length-1;
        int indiceMilieu = (indiceBas + indiceHaut) /2;
        boolean estTrouvé = false;
        if(valeurRecherche > tab[indiceBas] && valeurRecherche < tab[indiceHaut]){
            while(!estTrouvé && indiceBas <= indiceHaut) {
                if (valeurRecherche< tab[indiceMilieu]) {
                    indiceHaut = indiceMilieu - 1;
                } else if (valeurRecherche > tab[indiceMilieu]) {
                    indiceBas = indiceMilieu + 1;

                }else {
                    estTrouvé = true;
                }
                indiceMilieu = (indiceBas +  indiceHaut) / 2;
            }
        }

    return estTrouvé ? indiceMilieu : -1 ;
    }

    public static void rechercheDichotomique() {
        int[] tabEntiers =  {-2, -1, 0, 13, 24, 37, 44, 56, 99, 117};
        int x = userInput("Veuillez saisir la valeur de X à rechercher dans le tableau");
        int position = rechercheEntier(tabEntiers, x);
        String msg = position==-1?
                "x n'existe pas dans le tableau":
                "x se trouve à la position " + position + " dans le tableau";
        System.out.println(msg);

    }


}


