import java.math.BigInteger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionnaire{
    
    private HTNaive t;

    /*Question 16*/
    public Dictionnaire(int m){
        this.t= new HTNaive(m);
    }

    /* Question 24*/
    Dictionnaire(String fileName, int m){
        this.t = new HTNaive(Dictionnaire.calculeListeInt(fileName), m);
    }

    public Dictionnaire(String fileName, double f) {
        this.t = new HTNaive(Dictionnaire.calculeListeInt(fileName), f);
    }

    /*question 17 et 18*/
    public static BigInteger stringToBigInteger(String s){
        /*
        int totAscii=0;

        for(int i =0;i<s.length();i++){
            totAscii += (s.length()-i)*(int) s.charAt(i);   
        }
        */
        BigInteger res = new BigInteger("0");
        BigInteger multiplieur = new BigInteger("1");

        for (int i = s.length() - 1; i >= 0; i--) {
            res = res.add(BigInteger.valueOf((int) s.charAt(i)).multiply(multiplieur));
            multiplieur = multiplieur.multiply(BigInteger.valueOf(256));
        }

        return res;
        //return BigInteger.valueOf(totAscii);
    }

    /*Question 19*/
    public boolean ajout(String s){
        return this.t.ajout(Dictionnaire.stringToBigInteger(s));
    }

    /*Question 20 */
    public boolean contient(String s){
        return this.t.contient(Dictionnaire.stringToBigInteger(s)) ;
    }

    /*Question 21*/

    public int getCardinal(){
        return this.t.getCardinal();
    }

    public int getMaxSize(){
        return this.t.getMaxSize();
    }

    public int getNbListes(){
        return this.t.getNbListes();
    }
    public String toString(){
        return this.t.toString();
    }
    public String toStringV2(){
        return this.t.toStringV2();
    }

    /* Question 23*/
    public static ListeBigI calculeListeInt(String fileName){
        File f = new File(fileName);
        ListeBigI res = new ListeBigI();
        Scanner sc;

        try {
            sc = new Scanner(f);

        }catch(FileNotFoundException e){
            System.out.println(("problème d’accès au fichier " + e.getMessage()));
            return null;
        }

        sc.useDelimiter(" |\\n|,|;|:|\\.|!|\\?|-");
        String mot;    
        while (sc.hasNext()) {
            mot = sc.next();
            res.ajoutTete(Dictionnaire.stringToBigInteger(mot));          
        }
        sc.close();
        return res;

    }

    

}