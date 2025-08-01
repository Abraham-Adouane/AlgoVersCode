package training.afpa.cda24060.exercices.exocode;
// Ecrivez un algorithme en pseudocode qui permet de remplir aléatoirement un tableau d’entiers de TAILLE éléments dans le module principal puis qui affiche la valeur entière maximum de ce tableau d’entiers.
public class RemplirLireMaxEntier {

    public static int readMaxTabInt(int[] tab){
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }
    public static void remplirTableau(int[] tab){
        int max;
        for (int i = 0; i<tab.length; i++) {
            int randomInt = (int) (Math.random()*100);
            tab[i] = randomInt;
        }
        for (int i = 0; i<tab.length; i++){
            System.out.println(tab[i]);
        }
        max = readMaxTabInt(tab);
        System.out.println("la valeur maximale dans le tableau est " + max);
    }
}