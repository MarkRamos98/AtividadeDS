/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laboratorio-Info
 */
public class Inicio_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_GUI
     */
    public Inicio_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Ates_btn = new javax.swing.JButton();
        Declara_btn = new javax.swing.JButton();
        Recei_btn = new javax.swing.JButton();
        Sair_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel4.setLayout(null);

        Ates_btn.setText("Atestado");
        Ates_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ates_btnActionPerformed(evt);
            }
        });
        jPanel4.add(Ates_btn);
        Ates_btn.setBounds(10, 250, 120, 40);

        Declara_btn.setText("Declaração");
        jPanel4.add(Declara_btn);
        Declara_btn.setBounds(270, 250, 120, 40);

        Recei_btn.setText("Receituário");
        Recei_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recei_btnActionPerformed(evt);
            }
        });
        jPanel4.add(Recei_btn);
        Recei_btn.setBounds(140, 250, 120, 40);

        Sair_btn.setText("x");
        Sair_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair_btnActionPerformed(evt);
            }
        });
        jPanel4.add(Sair_btn);
        Sair_btn.setBounds(350, 0, 50, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Ates_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ates_btnActionPerformed
        try {
            Controller.Funcao_DAO.Atestado();
        } catch (Exception ex) {
            Logger.getLogger(Inicio_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Ates_btnActionPerformed

    private void Sair_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Sair_btnActionPerformed

    private void Recei_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Recei_btnActionPerformed
        try {
            Controller.Funcao_DAO.Receituario();
        } catch (Exception ex) {
            Logger.getLogger(Inicio_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Recei_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ates_btn;
    private javax.swing.JButton Declara_btn;
    private javax.swing.JButton Recei_btn;
    private javax.swing.JButton Sair_btn;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}