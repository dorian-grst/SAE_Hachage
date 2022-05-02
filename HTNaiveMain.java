import java.util.Random;
import java.math.BigInteger;

class HTNaiveMain {

    public static void main(String[] args) {

        /* question 11 */
        int m = 500;
        int[] val = new int[] { 20, 9, 76, 56, 45, 67, 89 };

        HTNaive t = new HTNaive(m);

        Random random = new Random();

        for (int i = 0; i < val.length; i++) {

            t.ajout(BigInteger.valueOf(val[i]));
        }
        // System.out.println(t.toString());

        // System.out.println(t.getElements().toString());
        // System.out.println(t.toStringV2());

        /* question 22 */

        Dictionnaire d = new Dictionnaire("LeRougeEtLeNoir.txt",0.7);
        /*
         * dico.ajout("Pomme");
         * dico.ajout("Banane");
         * dico.ajout("Poire");
         * System.out.println(dico.contient("Pomme"));
         * System.out.println(dico.contient("pomme"));
         * 
         * System.out.println(dico);
         * System.out.println(dico.toStringV2());
         * System.out.println(dico.getCardinal());
         * System.out.println(dico.getMaxSize());
         * System.out.println(dico.getNbListes());
         */

        System.out.println("maxSize : " + d.getMaxSize());
        System.out.println("cardinal : " + d.getCardinal());
        System.out.println("nbListes : " + d.getNbListes());
        int nbRecherches = 100000;
        long deb = System.currentTimeMillis();
        for (int i = 0; i < nbRecherches; i++) {
            int tailleMot = random.nextInt(15) + 2; // 2 <= tailleMot <= 16
            char[] mot = new char[tailleMot];
            for (int j = 0; j < mot.length; j++) {
                mot[j] = (char) ('a' + random.nextInt(26));
            }

            String motS = new String(mot);
            d.contient(motS);// on ne récupère même pas le résultat de la recherche!
        }
        long fin = System.currentTimeMillis();
        System.out.println("temps total : " + (fin - deb));

    }
}