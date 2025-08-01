package training.afpa.cda24060.exercices.exocode;

import java.util.Scanner;

public class Exo4_TableMultiplication {



    public static void tableMultiplication(){
        int row = 10;
        int column = 10;
        int[][] table =  remplirTable(row,column);
        saisieUtilisateur(table);

    }
//impossible de mettre de param par defaut : fonction(param : 5)
    public static int[][] remplirTable(int param_row, int param_column){
        int column = param_column;
        int row = param_row;
        int[][] table = new int[row][column];
        for (int i = 1; i < row ; i++) {
            for (int j = 1; j < column; j++) {
                table[i][j]= i*j;
            }
        }
        return table;
    }
    public static void saisieUtilisateur(int[][] table) {
        Scanner sc = new Scanner(System.in);
        boolean continuer = true;
        int produit;
        int x=0, y=0;
        String reponseUtiliateur;
        while (continuer) {

            do {
                System.out.println("Entrez un entier X entre 1 et 9 :");
                if (sc.hasNextInt()){
                    x = sc.nextInt();
                }else{
                    System.out.println("Veuillez entrer un entier valide");
                    x = sc.nextInt();
                }
            }while (!(x >= 1 && x <= 9));
            do {
                System.out.println("Entrez un entier Y entre 1 et 9 :");
                if (sc.hasNextInt()){
                    y = sc.nextInt();
                } else {
                    System.out.println("Veuillez entrer un entier valide");
                    y = sc.nextInt();
                }
            }while (!(y >= 1 && y <= 9));
            produit = table[x][y];
            System.out.println("Le résultat de " + x + " x " + y + " est  " + produit);

            System.out.println("Souhaitez vous encore un calcul ? (o / n)");
            reponseUtiliateur = sc.nextLine();
            continuer = reponseUtiliateur == "o"  ;


        }

    }
}
