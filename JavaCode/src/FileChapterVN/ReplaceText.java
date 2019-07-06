/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileChapterVN;

import java.io.*;

import java.util.*;

// I dont understand much, it is new lessons for me
public class ReplaceText {
    public static void main(String[] args) throws Exception {
        if (args.length !=4 ){
            System.out.println("Usage: Java Replace Text sourceFile target");
            System.exit(0);
        }
        
        File sourceFile = new File(args[0]);
        if ( !sourceFile.exists()){
            System.out.println("SourceFile " + args[0] + " does not exist !!!");
            System.exit(0);
        }
        
        File targetFile = new File(args[0]);
        if ( !targetFile.exists()){
            System.out.println("targetFile " + args[1] + " already exist !!!");
            System.exit(0);
        }
        
        Scanner input = new Scanner(sourceFile);
        PrintWriter output = new PrintWriter(targetFile);
                
        while (input.hasNext()){
            String s1 = input.nextLine();
            String s2 = s1.replaceAll(args[2], args[3]);
            
            output.println(s2);
        }
        
        input.close();
        output.close();
    }
}
