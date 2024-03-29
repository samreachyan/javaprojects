/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavagui;

import javax.swing.JOptionPane;

/**
 *
 * @author Sabay Play
 */
public class LessonDialog extends javax.swing.JFrame {

    /**
     * Creates new form LessonDialog
     */
    public LessonDialog() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtinfo = new javax.swing.JButton();
        txterror = new javax.swing.JButton();
        txtquestion = new javax.swing.JButton();
        txtyesno = new javax.swing.JButton();
        txtplain = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        txtinfo.setText("Information");
        txtinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinfoActionPerformed(evt);
            }
        });

        txterror.setText("Error");
        txterror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txterrorActionPerformed(evt);
            }
        });

        txtquestion.setText("Question");
        txtquestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquestionActionPerformed(evt);
            }
        });

        txtyesno.setText("YES-NO");
        txtyesno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtyesnoActionPerformed(evt);
            }
        });

        txtplain.setText("Plain");
        txtplain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplainActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtyesno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtplain))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtinfo)
                        .addGap(18, 18, 18)
                        .addComponent(txterror)
                        .addGap(18, 18, 18)
                        .addComponent(txtquestion)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtinfo)
                    .addComponent(txterror)
                    .addComponent(txtquestion))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtyesno)
                    .addComponent(txtplain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinfoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This is information");
    }//GEN-LAST:event_txtinfoActionPerformed

    private void txterrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txterrorActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This is error message.", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_txterrorActionPerformed

    private void txtquestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquestionActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This is question message.", "Question", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_txtquestionActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void txtyesnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtyesnoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm", JOptionPane.YES_OPTION);
    }//GEN-LAST:event_txtyesnoActionPerformed

    private void txtplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplainActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This is plain message which nothing happening.", "Plain", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_txtplainActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LessonDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LessonDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LessonDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LessonDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LessonDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton txterror;
    private javax.swing.JButton txtinfo;
    private javax.swing.JButton txtplain;
    private javax.swing.JButton txtquestion;
    private javax.swing.JButton txtyesno;
    // End of variables declaration//GEN-END:variables
}
