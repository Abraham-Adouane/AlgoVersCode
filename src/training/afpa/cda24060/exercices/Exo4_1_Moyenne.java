package training.afpa.cda24060.exercices;

import java.util.Scanner;

public class Exo4_1_Moyenne {

//    public static float[] setNotes(){
//        Scanner input = new Scanner(System.in);
//
//
//    };


    public static void moyenne(){


        float result = 0;
        float medium ;
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

}
