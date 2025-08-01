package training.afpa.cda24060.exercices.exoalgo;

public class Exo6_TableauFactorielle {
    public static int calculFactorielle(int value){
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
        int[][] tableauFactorielle = new int[5][3];

        while (indiceColonne < tableauFactorielle.length) {
            while (indiceLigne < tableauFactorielle[indiceColonne].length){
                tableauFactorielle[indiceLigne][indiceColonne] = indiceColonne + 1;
                indiceColonne++;
            }
            indiceLigne++;

        }

        /*for (int i = 0; i < tableauFactorielle.length; i++) {
            for (int j = 0; j < tableauFactorielle[i].length; j++) {
                tableauFactorielle[i][j] = calculFactorielle(j+1);

            }

        }
        for (int[] ints : tableauFactorielle) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }*/

    }
}
