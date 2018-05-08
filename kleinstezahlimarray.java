
package kleinstezahlarray;
import java.util.Random;

public class KleinsteZahlArray {
    public static void main(String[] args) {
    
    int [] zufall = new int[100];
    for (int i=0; i<100; i++){
            Random rand = new Random();
            zufall[i] = rand.nextInt(100)+1;
        }
    
    int kleinstezahl=100;
    
    for (int j=0; j<100; j++){
        if(zufall[j]<kleinstezahl) {
        kleinstezahl = zufall[j];
        }
    }
        System.out.println("Die kleinste Zahl in dem Array ist " + kleinstezahl);
    }
}
