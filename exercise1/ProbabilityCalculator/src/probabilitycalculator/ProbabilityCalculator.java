/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probabilitycalculator;
import java.util.Scanner;
import static java.lang.System.out;

/**
 *
 * @author Manuel Ortega Jr
 */
public class ProbabilityCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numberOfRolls = 0;
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        
        out.println("Enter 0 to stop.");
        while(cont){
            try{
            
                out.print("Number of rolls: ");
                numberOfRolls = Integer.parseInt(in.next());
            
                if (numberOfRolls > 0) 
                {
                    out.println("Probability: " + calculateProbability(numberOfRolls) + "\n");
                }
                else
                {
                    cont = false;
                    out.println("Good bye!");
                }
        
            }catch(Exception IO)
            {
                out.println("Invalid input!\n");
            }
        }
        
    }
    
    //function to calculate probability
    public static Double calculateProbability(int numberOfRolls){
        Double result;
        result = (1.0/6) * (1.0/6);
        result = result * (numberOfRolls - 1);
        return result;
    }
    
}
