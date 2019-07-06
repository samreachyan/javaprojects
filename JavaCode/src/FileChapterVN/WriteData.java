/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileChapterVN;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author Samreach Yan
 */
public class WriteData {
    public static void main(String[] args) throws Exception{
        File file = new File("score.txt");
        if (file.exists()){
            System.out.println("File already exist... !!");
            System.exit(0);
        }
        
        PrintWriter output = new PrintWriter(file);
        
        output.print("Yan Samreach ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(80);
        
        output.close();
    }
}
