package training.afpa.cda24060.exercices.exocode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exo5_Calculatrice {
    char operateur;
    double operande1,  operande2, result;
    boolean continuer = true;


    public static double getResult(char operateur, double operande1, double operande2) {
        double result = 0;

        switch (operateur) {
            case '+':
                result = operande1 + operande2;
                break;
            case '-':
                 result = operande1 - operande2;
                 break;
            case '*':
                result = operande1 * operande2;
                break;
            case '/':
                if (operande2 == 0) {
                    System.out.println("Err");
                    result = 0;
                }else {
                    result = operande1 / operande2;
                }
                break;
        }

        return result;
    }

    public static char saisieOperateur(){
        String regex = "[+\\-*/]";
        Scanner sc = new Scanner(System.in);
        char operateur;
        boolean operateurValide = false;

        do {
            System.out.println("Choississez une operation : +  -  *  / ");
            operateur = sc.next().charAt(0);
            Pattern p = Pattern.compile(regex);
            Matcher matcher = p.matcher(String.valueOf(operateur));
            operateurValide = matcher.matches();
            if (!operateurValide) {
                System.out.println("Opérateur invalide. Veuillez réessayer.");
            }
        } while (!operateurValide);
        return operateur;
    }

    public static double saisieOperande() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static boolean demanderContinuer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\"Souhaitez-vous effectuer un autre calcul ? (Oui/Non)");
        String reponse = sc.nextLine();
//        return reponse == "Oui" || reponse == "oui";
        return reponse.equalsIgnoreCase("oui");
    }

    public static void calculatrice(){
        boolean continuer = true;
        while (continuer) {
            char op = saisieOperateur();
            System.out.print("Entrez la 1ere valeur : ");
            double op1 =  saisieOperande();
            System.out.print("Entrez la 2eme valeur : ");
            double op2 = saisieOperande();
            double result = getResult(op,op1,op2);
            System.out.println("Le resultat de " + op1 + "" + op + "" + op2 + " = " + result);
            continuer = demanderContinuer();

            String msg = continuer ?
                "calcul suivant : ":
                "Au revoir";
            System.out.println(msg);
        }


    }

}
