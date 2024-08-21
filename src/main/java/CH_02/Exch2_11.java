/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH_02;

/**
 *
 * @author ductr
 */
public class Exch2_11 {
     public static void main(String[] args) {
        double birthinOneYear =  7.0;
        double dieinOneYear = 13.0;
        double immigrantinOneYear =  45.0;
        
        double birth = changeToYear(birthinOneYear);
        double die = changeToYear(dieinOneYear);
        double immigrant = changeToYear(immigrantinOneYear);
        
        double CurentPopulation = 312_032_486;
       for (int i = 1; i <= 5; i++) {
            CurentPopulation += birth - die + immigrant;
        }
       System.out.printf("%1.0f",CurentPopulation);
        
    }
    
    public static double changeToYear (double time){
        double seconInYear = 24 * 60 * 60 * 365;
        double revertSecon = seconInYear / time;
        return revertSecon;
    }
}
