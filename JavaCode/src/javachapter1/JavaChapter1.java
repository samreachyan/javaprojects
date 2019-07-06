 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javachapter1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Samreach Yan
 */
public class JavaChapter1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int qty, price, total, dis, result;
        Scanner cin = new Scanner(System.in); // input statement
        DecimalFormat df = new DecimalFormat("Riels ###.00");
        System.out.print("Enter the quality : ");
        qty = cin.nextInt();
        System.out.print("Enter price : ");
        price = cin.nextInt();
        System.out.print("Enter discount : ");
        dis = cin.nextInt();
        total= qty * price ;
        result = total - total*dis/100;
        System.out.println("Total before discount = "+ df.format(qty*price));
        System.out.println("Total after discount is = "+ df.format(result));
                
    }
    
}
