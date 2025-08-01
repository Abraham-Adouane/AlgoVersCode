package training.afpa.cda24060.exercices;

import java.util.Scanner;

public class Exo4_3_Recherche {
    public static void rechercheValeur(){
        int max;
        int min = 0;
        int indice;
        int searchValue;
        int[] dico = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temp;
        int flag = 0;
        max = dico.length-1;


        Scanner input = new Scanner(System.in);
        System.out.println("Nombre à verifier : ");
        searchValue = input.nextInt();

        while (min<=max && flag==0){
            indice = (min+max)/2;
           /* switch(true){
                case (dico[indice]== searchValue):
                    System.out.println("La valeur existe !");
                    flag = 1;
                case (dico[indice]<searchValue):
                    min = indice + 1;
                case (dico[indice]>searchValue):
                    max = indice-1;
            }*/
            if(dico[indice]==searchValue){
                System.out.println("La valeur existe !");
                flag = 1;
            } else if (dico[indice]<searchValue) {
                min = indice + 1;
            } else  {
                max = indice - 1;
            }
        }
        if(flag==0){
            System.out.println("La valeur n'existe pas !");
        }
    }
}
