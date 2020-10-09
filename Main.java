package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        java.util.Scanner scanner = new java.util.Scanner(System.in);


        String Joueur1;
        String Joueur2;
        char choix;
        while(true){
// ----------------------------------------------------- \\

            System.out.println("|----------------------------|");
            System.out.println("|     Bienvenu dans B.O.B    |");
            System.out.println("|----------------------------|");


            System.out.println("Choisir :");
            System.out.println("");
            System.out.println("1. Règles :");
            System.out.println("");
            System.out.println("2. Jouer :");
            System.out.println("");
            

            choix = scanner.next().charAt(0);

            if (choix == '1') {

                while (choix == '1') {

                    System.out.println("");
                    System.out.println("Voici les règles :");
                    System.out.println("Avancez avec les touches .......");

                    String lettre = scanner.next();
                    boolean let = lettre.equals("2");
                    System.out.println("Entrer un chiffre entre 1 et 2");
                    if (let == true) {
                        choix = '2';
                    }
                }
            }


                if(choix == '2') {
                    System.out.println("Entrer Pseudo joueur 1");
                    Joueur1 = scanner.next();
                    System.out.println(Joueur1);
                    System.out.println("Entrer Pseudo joueur 2");
                    Joueur2 = scanner.next();
                    System.out.println((Joueur2));
                    System.out.println("C'est parti, partie 2 jouers");


                }

                else{
                    System.out.println("");
                    System.out.println("entrer un chiffre entre 1 et 2");
                }
        }
    }
}
