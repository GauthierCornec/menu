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
            

            choix = scanner.next().charAt(0); // entrée utilisateur 

            if (choix == '1') { // si utilisateur entre 1 on rentre dans la boucle while

                while (choix == '1') { // tant que l'utilisateur entre 1 on lui affiche les règles 

                    System.out.println(""); // affichage des règles 
                    System.out.println("Voici les règles :");
                    System.out.println("Avancez avec les touches Q, Z, S, D. ");
                    System.out.println("Lorsque vous bougez la case précédente est détruite ");
                    System.out.println("Cette case est donc indisponible sur le plateau");
                    System.out.println("Si vous avancez sur une case indisponible vous avez perdu ");

                    String lettre = scanner.next(); // si l'utilisateur entre un caractère
                    boolean let = lettre.equals("2");
                    System.out.println("Entrer un chiffre entre 1 et 2");
                    if (let == true) {
                        choix = '2';
                    }
                }
            }


                if(choix == '2') { // si l'utilisateur entre le chiffre 2 
                    System.out.println("Entrer Pseudo joueur 1");
                    Joueur1 = scanner.next();
                    System.out.println(Joueur1);
                    System.out.println("Entrer Pseudo joueur 2");
                    Joueur2 = scanner.next();
                    System.out.println((Joueur2));
                    System.out.println("C'est parti, partie 2 jouers");


                }

                else{ // si utilisateur entre un caractère au lieu d'un chiffre on lui affiche le message suivant 
                
                    System.out.println("entrer un chiffre entre 1 et 2");
                    System.out.println("");
                }
        }
    }
}
