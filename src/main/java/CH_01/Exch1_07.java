/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH_01;

/**
 *
 * @author ductr
 */
public class Exch1_07 {
    public static void main(String[] args) {
        double approxPi = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
		double approxPi2 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);

		System.out.println(approxPi);
		System.out.println(approxPi2);
		System.out.println(Math.PI);
    }
}
