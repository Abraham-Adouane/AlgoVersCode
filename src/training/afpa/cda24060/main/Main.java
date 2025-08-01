package training.afpa.cda24060;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //exo4_1();
        exo4_3();
    }

    public static void exo4_1(){
        float result = 0;
        float medium = 0;
        float[] notes = new float[9];
        Scanner input = new Scanner(System.in);
        for(int i = 1; i < notes.length; i++){
            System.out.println("Entrez une note : ");
            notes[i] = input.nextFloat();
            result += notes[i];
        }
        medium = result/ notes.length;
        System.out.println("Moyenne : " + medium);

    }
    public static void exo4_3(){
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

    public static void exo4_4(){

    }

}