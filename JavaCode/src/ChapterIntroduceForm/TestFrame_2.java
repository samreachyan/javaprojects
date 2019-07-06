/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterIntroduceForm;

import javax.swing.*;
/*
    this is Swing writing by code all components. For regularly they use design 
    codes faster and easier.
*/
public class TestFrame_2 {
    public static void main(String[] args){
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");
        JLabel jlblName = new JLabel("Enter your name: ");
        
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);
        panel.add(jlblName);
        
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("GUI Component");
        frame.setSize(450, 100);
        frame.setLocation(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       
        
    }
}
