package training.afpa.cda24060.exercices;

public class Exo4_4_RechercheMax {
    public static void rechercheMax(){
        int iMax = 1;
        int jMax = 1;
        //int[][] tableau = new int[12][8] ;
        int[][] tableau = {
                {5, 2, 9, 4, 1, 8, 6, 3},
                {7, 12, 0, 3, 9, 4, 11, 2},
                {7, 12, 0, 2, 75, 4, 40, 2}
        };

        for(int i=0;i< tableau.length;i++){
            for(int j=0; j< tableau[i].length; j++){
                if(tableau[i][j]>tableau[iMax][jMax]){
                    jMax = j;
                    iMax = i;
                }
            }
        };
        System.out.println("Plus grand élément : " + tableau[iMax][jMax]);
        System.out.println("Il se trouve aux indices : " + iMax + " / " + jMax);

    }
}
