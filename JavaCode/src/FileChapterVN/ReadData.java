/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileChapterVN;

import java.io.File;
import java.util.Scanner;


/**
 *
 * @author Samreach Yan
 */
public class ReadData {
    public static void main(String[] args) throws Exception{
        File file = new File("scores.txt");
        Scanner input = new Scanner(file);
        
        while (input.hasNext()){
            String fname = input.next();
            String lname = input.next();
            int score = input.nextInt();
            System.out.println( fname + " " + lname + " " + score );
            
        }
        input.close();
    }
    
}
