/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhotel.Admin;

import com.mysql.jdbc.Connection;
import myhotel.db.DBConnect;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class RemoveUsers extends javax.swing.JFrame {
    
    
Connection link =null;
PreparedStatement stm=null;
    
    public RemoveUsers() {
        
        setTitle("Remove Users");
        initComponents();
        link =DBConnect.connectDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        dusername = new javax.swing.JTextField();
        Userremovebutton = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setText("User Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 70, 80, 20);

        dusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dusernameActionPerformed(evt);
            }
        });
        getContentPane().add(dusername);
        dusername.setBounds(140, 110, 120, 30);

        Userremovebutton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Userremovebutton.setText("Remove");
        Userremovebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserremovebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Userremovebutton);
        Userremovebutton.setBounds(210, 260, 81, 29);

        Back.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(310, 260, 70, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myhotel/images/0.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dusernameActionPerformed
        
    }//GEN-LAST:event_dusernameActionPerformed

    private void UserremovebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserremovebuttonActionPerformed
        String DUname=dusername.getText();
        
        try{
        String qdu="DELETE FROM user WHERE Username='"+DUname+"'";
        stm=link.prepareStatement(qdu);
        stm.execute();
        JOptionPane.showMessageDialog(this, "Successfully Deleted","Confirm Delete",JOptionPane.INFORMATION_MESSAGE);
        dusername.setText("");
        
        }
                catch(Exception e){
                    System.out.println(e);}
    }//GEN-LAST:event_UserremovebuttonActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        UserControl uc=new UserControl();
        uc.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton Back;
    private javax.swing.JButton Userremovebutton;
    private javax.swing.JTextField dusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
