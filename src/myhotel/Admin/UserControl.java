
package myhotel.Admin;


public class UserControl extends javax.swing.JFrame {

    /**
     * Creates new form UserControl
     */
    public UserControl() {
        setTitle("User Control");
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

        UseraddButton = new javax.swing.JButton();
        UserremoveButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        UseraddButton.setBackground(new java.awt.Color(51, 102, 255));
        UseraddButton.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        UseraddButton.setText("Add User");
        UseraddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseraddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UseraddButton);
        UseraddButton.setBounds(40, 90, 150, 110);

        UserremoveButton.setBackground(new java.awt.Color(255, 0, 102));
        UserremoveButton.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        UserremoveButton.setText("Remove User");
        UserremoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserremoveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UserremoveButton);
        UserremoveButton.setBounds(220, 90, 150, 109);

        jButton4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(270, 250, 100, 33);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myhotel/images/0.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-2, 1, 410, 300);

        setSize(new java.awt.Dimension(420, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UseraddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseraddButtonActionPerformed
            AddUsers ad1 = new AddUsers();
            ad1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_UseraddButtonActionPerformed

    private void UserremoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserremoveButtonActionPerformed
        RemoveUsers ru=new RemoveUsers();
        ru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserremoveButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AdminMain amd=new AdminMain();
        amd.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(UserControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UseraddButton;
    private javax.swing.JButton UserremoveButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
