package com.packageCheikh;
import jdk.jfr.Percentage;
import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.Scanner;

public class Main {
    final static int PARAM1=1;
    final static int PARAM2=2;
    final static String TYPE1="Coffee";
    final static String TYPE2="Bank";
    final static String TYPE3="Retail";
    final static String ROLE1="Gerant";
    final static String ROLE2="Superviseur";
    final static String ROLE3="Employé";


    public static void Fait1(int param){

    if(param==PARAM1)
    System.out.println("*** Ajouter un business *** ");
    if (param==PARAM2)
        System.out.println("Calculer le Payroll : ");

}
public static void  NomBusiness(){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Entrer le nom de votre business : ");
    String business=scanner.next();
    String businessNom=business;
}
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.print("Entrez votre choix :");
        int choix=scanner.nextInt();
        Fait1(choix);
        while(choix==1){
            NomBusiness();


        }
        while(choix==2){

        }

    }
}

