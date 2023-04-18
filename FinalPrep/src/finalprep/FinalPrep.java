/*
 * Lukas Krampitz
 * Apr 17, 2023
 * 
 */
package finalprep;

import javax.swing.JOptionPane;

/**
 *
 * @author Tacitor
 */
public class FinalPrep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Good");
        
        int piss = -1;
        try {
            piss = Integer.parseInt(JOptionPane.showInputDialog(null, "Give input:", "Please enter input", JOptionPane.QUESTION_MESSAGE));
        } finally {
            System.out.println("Loser: " + piss);
        }
    }
    
}
