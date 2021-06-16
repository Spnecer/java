package assignment1;

import javax.swing.JOptionPane;

/**
 *
 * @author Spencer Bruse
 * @version 2019/11/15
 */
public class Assignment1 {

    public static void main(String[] args) {
        /**
         * @knopString så frågas efter inmatning i knop av dialog ruta
         * @knopDouble så konverteras knop från typen String till double
         * @knopToKmFactorDouble så ges en konvertering faktor
         * @kmPerHourDouble så beräknas km/h från knop
         *  
         * Slutligen skrivs resultatet ut med informations figur i en 
         * dialog ruta.
         */
        String knopString = JOptionPane.showInputDialog(null, "Input", 
                "Skriv in en hastighet i knop");
        double knopDouble = Double.parseDouble(knopString);
        double knopToKmFactorDouble = 1.852;
        double kmPerHourDouble = knopDouble*knopToKmFactorDouble;
        JOptionPane.showMessageDialog(null, knopDouble + " knop motsvarar " + 
                kmPerHourDouble + " km/h", "Message", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
