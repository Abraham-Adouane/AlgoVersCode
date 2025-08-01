package training.afpa.cda24060.exercices.exoalgo;

import static java.lang.Math.sqrt;
import static training.afpa.cda24060.methode.UserInput.userInput;

public class Exo3_EquationSecondDegre {
    public static void equationSecondDegre(){

        int a = userInput("Saisir la valeur de a :");
        int b = userInput("Saisir la valeur de b :");
        int c = userInput("Saisir la valeur de c :");
        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println(" Il n’y a pas de solution pour cette équation");
        } else if (delta == 0) {
            System.out.println("Il y a une solution double pour cette équation :");
            double resultat = -b /(2*a);
            System.out.println(resultat);
        } else {
            System.out.println("Il y a 2 solutions pour cette equation :");
            System.out.println( -b + (sqrt(delta)/2*a));
            System.out.println( -b - (sqrt(delta)/2*a));
        }
    }
}
