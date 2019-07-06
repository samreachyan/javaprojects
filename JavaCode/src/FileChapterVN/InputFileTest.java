/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileChapterVN;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samreach Yan
 */
public class InputFileTest {
    public static void main(String[] args) throws IOException{
        String fileName = "demo.txt";
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter your word : ");
        String word = cin.nextLine();
         try {
            FileWriter fileWriter = new FileWriter(new File(fileName));
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            
            bufferWriter.write(word);
           
            bufferWriter.close();
            fileWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(InputFileTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileReader fileReader = new FileReader (new File(fileName));
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String target = "";
            target = bufferReader.readLine();
            System.out.println(target);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InputFileTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
