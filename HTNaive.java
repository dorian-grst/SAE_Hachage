import java.math.BigInteger;

/* Question 4 */
public class HTNaive {
    private ListeBigI[] t;
    private long totalTimeh;
    private long totalTimeContient;

    public HTNaive(int m) {
        this.t= new ListeBigI[m];
        this.totalTimeh = 0;
        this.totalTimeContient = 0;
        for (int i = 0; i < m; i++){
            this.t[i] = new ListeBigI();
        } 
    }
    /* Question 14*/
    public HTNaive(ListeBigI l, int m) {
        this(m);
        this.ajoutListe(l);
    }

    /*Question 15*/
    
    public HTNaive(ListeBigI l, double f) {
        
        this(l, (int) (f * HTNaive.cardTab(l)));
    }   

    public static int cardTab(ListeBigI l){
        HTNaive temp =new HTNaive(l, 1000);
        return temp.getCardinal();
    }
    

    /* Question 5 */
    public ListeBigI getListe(int i) {

        return t[i];
    }

    /* Question 6 */
    public int h(BigInteger u){

        long debut = System.currentTimeMillis();
        long fin = System.currentTimeMillis();
        this.totalTimeh += (fin - debut);
        return u.remainder(BigInteger.valueOf(this.t.length)).intValue();
    }

    /* Question 7 */
    public boolean contient(BigInteger u){
        long debut = System.currentTimeMillis();
        int i = h(u);    
        long fin = System.currentTimeMillis();
        this.totalTimeContient += (fin - debut);    
        return this.t[i].contient(u);
    }

    /* Question 8 */
    public boolean ajout(BigInteger u){
        boolean res = false;
        if(!this.contient(u)){
            this.t[h(u)].ajoutFin(u);
            res = true;
        }   
        return res;
    }

    public void ajoutListe(ListeBigI L) {

        ListeBigI listeL = new ListeBigI(L);
        while (!listeL.estVide()){
            this.ajout(listeL.supprTete());
        }

    }

    /* Question 9 */
    public ListeBigI getElements() {
        ListeBigI L = new ListeBigI();
        for (int i=0;i<this.t.length;i++){
            L.ajoutListe(this.t[i]);
        }
        return L;
    }

    public long getTotalTimeh() {
        return this.totalTimeh;
    }

    public long getTotalTimeContient() {
        return this.totalTimeContient;
    }

    /*Question 10*/
    public String toString(){
        String affiche="";

        for (int i=0;i<this.t.length;i++){
            affiche += "Table["+i+"] : "+ this.t[i].toString()+ "\n";
        }

        return affiche;
    }

    /* Question 12*/
    public int getNbListes() {
        return this.t.length;
    }

    public int getCardinal() {
        return this.getElements().longueur();
    }

    public int getMaxSize() {
        int maxS = 0;
        for (int i=0;i<this.t.length;i++){
            if(this.t[i].longueur() > maxS){
                maxS = this.t[i].longueur();
            }
        }
        return maxS;
    }

    /*Question 13*/
    public String toStringV2() {
        String affiche="";
        for(int i=0;i<this.t.length;i++){
            if(!this.t[i].estVide()){
                affiche+="Table["+i+"]: ";
                for (int j=0;j<this.t[i].longueur();j++){
                    affiche+="*";
                }
                affiche+="\n";
            }
        }
        return affiche;
    }

    /*Question 14*/

    
}
   

