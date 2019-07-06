/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileChapterVN;

import java.io.File;
import java.util.Scanner;
import javax.swing.JFileChooser;

// this worked
public class ReadFileUsingJFileChooser {
    public static void main(String[] args) throws Exception {
        JFileChooser fileChooser = new JFileChooser();
        if(fileChooser.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            Scanner input = new Scanner(file);
            
            while(input.hasNext()){
                System.out.println(input.nextLine());
            }
            input.close();
        } else {
            System.out.println("No file selected...! ");
        }
    }
}