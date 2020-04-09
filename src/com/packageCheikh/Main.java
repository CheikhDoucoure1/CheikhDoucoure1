package com.packageCheikh;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    final static int PARAM1=1;
    final static int PARAM2=2;
    final static String TYPE1="COFFEE";
    final static String TYPE2="BANK";
    final static String TYPE3="RETAIL";
    final static String ROLE1="GERANT";
    final static String ROLE2="SUPERVISEUR";
    final static String ROLE3="EMPLOYE";

    public static void role(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer le rôle : ");
        String role=scanner.next();
        if(role.equals(ROLE1) || role.equals(ROLE2) || role.equals(ROLE3)) {
            System.out.println("***"+ role + "***");
            fait2();
        }else{
            System.out.println("Erreur, réessayer. ");
        }
    }

    public static void Fait1(int param){

    if(param == PARAM1)
    System.out.println("*** Ajouter un business *** ");
    if (param == PARAM2)
        System.out.println("Calculer le Payroll : ");

}
public static void fait2() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrer le type de business: ");
    String type = scanner.next();
    if (type.equals(TYPE1) || type.equals(TYPE2)|| type.equals(TYPE3) ) {
        System.out.print("Entrer son salaire par heures: ");
        int salaire = scanner.nextInt();
        int salaire1 = salaire;
        System.out.print("Entrer son nombre d'heures : ");
        int nbrHeures = scanner.nextInt();
        int nbrHeures1 = nbrHeures;
        System.out.print("Entrer son nombre d'heures supplementaires : ");
        int nbrHeuresSup = scanner.nextInt();
        int nbrHeuresSup1 = nbrHeuresSup;
        System.out.print("Entrer son salaire par heures supplementaires: ");
        int salaireHeuresSup = scanner.nextInt();
        int salaireHeuresSup1 = salaireHeuresSup;
        System.out.println(type +"\n" + "Salaire par heure :" + salaire1 + "\n"
                + "Nombre d'heures : " + nbrHeures1 + "\n" +
                "Nombre d'heures supplementaires : " + nbrHeuresSup1 + "\n" +
                "Salaire par heures supplementaires : " + salaireHeuresSup1);
        int payroll= (salaire1 * nbrHeures1) + (salaireHeuresSup1* nbrHeuresSup1);
    }else {
        System.out.println("Erreur , recommencer.");
    }
    }
    public static void payroll(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer son salaire par heures: ");
        int salaire = scanner.nextInt();
        int salaire1 = salaire;
        System.out.print("Entrer son nombre d'heures : ");
        int nbrHeures = scanner.nextInt();
        int nbrHeures1 = nbrHeures;
        System.out.print("Entrer son nombre d'heures supplementaires : ");
        int nbrHeuresSup = scanner.nextInt();
        int nbrHeuresSup1 = nbrHeuresSup;
        System.out.print("Entrer son salaire par heures supplementaires: ");
        int salaireHeuresSup = scanner.nextInt();
        int salaireHeuresSup1 = salaireHeuresSup;
        int payroll= (salaire1 * nbrHeures1) + (salaireHeuresSup1* nbrHeuresSup1);
        System.out.print("PAYROLL: " +  payroll + "\n");

    }



public static void  NomBusiness(){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Entrer le nom de votre business : ");
    String business=scanner.next();
    String businessNom=business;
}
    public static void main(String[] args) {
        System.out.println("1: Ajouter une business \n2: Calculer le Payroll  ");
    Scanner scanner=new Scanner(System.in);
        System.out.print("Entrez votre choix :");
        int choix=scanner.nextInt();
        Fait1(choix);
        while(choix == 1) {
            NomBusiness();
            role();



        }

        while(choix == 2 ){
         payroll();


        }

    }



}

