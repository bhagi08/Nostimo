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

    
/**
 *
 * @author Lasitha
 */
public class AddUsers extends javax.swing.JFrame {

    
    Connection link =null;
    PreparedStatement stm=null;
    
    public AddUsers() {
        
        setTitle("Add User");
        initComponents();
        link =DBConnect.connectDB();
    }
        
                
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabelusername = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        UseraddButton = new javax.swing.JButton();
        utype = new javax.swing.JComboBox();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelusername.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabelusername.setText("Username");
        getContentPane().add(jLabelusername);
        jLabelusername.setBounds(27, 70, 60, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(27, 101, 55, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("User Type");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(27, 142, 58, 20);
        getContentPane().add(username);
        username.setBounds(140, 70, 87, 30);
        getContentPane().add(password);
        password.setBounds(140, 100, 87, 30);

        UseraddButton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        UseraddButton.setText("Add");
        UseraddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseraddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UseraddButton);
        UseraddButton.setBounds(280, 290, 80, 29);

        utype.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        utype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "User", " " }));
        getContentPane().add(utype);
        utype.setBounds(140, 140, 90, 30);

        Back.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(370, 290, 80, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myhotel/images/0.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 331);

        setSize(new java.awt.Dimension(469, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UseraddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseraddButtonActionPerformed
               
                String Uname=username.getText();
                String Password=password.getText();
                String Usertype=(String)utype.getSelectedItem();
                
                try{
                String q="INSERT INTO user(Username,Password,UserType)VALUES('"+Uname+"','"+Password+"','"+Usertype+"')";
                stm=link.prepareStatement(q);
                stm.execute();
                JOptionPane.showMessageDialog(this, "Successfully Added ","",JOptionPane.INFORMATION_MESSAGE);
                
                username.setText("");
                password.setText("");
                
                
                }
                catch(Exception e){
                    String ermsg="Username Already exisit!";
            JOptionPane.showMessageDialog(null,ermsg);
                 username.setText("");
                password.setText("");}
                
    }//GEN-LAST:event_UseraddButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton Back;
    private javax.swing.JButton UseraddButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    private javax.swing.JComboBox utype;
    // End of variables declaration//GEN-END:variables
}