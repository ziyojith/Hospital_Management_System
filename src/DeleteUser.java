
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author JITHIN V J
 */
public class DeleteUser extends javax.swing.JFrame {

    /**
     * Creates new form DeleteUser
     */
    public DeleteUser() {
        initComponents();
        tf1.setVisible(false);
        tf.setVisible(false);
        b3.setVisible(false);
        ll1.setVisible(false);
        tf3.setVisible(false);
    }
   String ssss;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        ll1 = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        b3 = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        b1.setText("Doctor");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 144, 181, 88));

        b2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        b2.setText("Patient");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 144, 161, 88));

        ll1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll1.setText("Enter the MailId for Deletion");
        getContentPane().add(ll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 330, 43));

        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });
        getContentPane().add(tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 323, -1));

        b3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        b3.setText("DELETE");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 216, 105));
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1255, 70, -1, -1));

        tf3.setText(" ");
        getContentPane().add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1283, 188, -1, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("DELETION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\JITHIN V J\\Downloads\\Project Wallpaper\\ThAOKju-medical-doctor-wallpaper-hd.jpeg.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1950, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
tf1.setText(b1.getText());
tf1.setVisible(false);
        tf.setVisible(true);
        b3.setVisible(true);
        ll1.setVisible(true);

    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        tf1.setText(b2.getText());
tf1.setVisible(false);
        tf.setVisible(true);
        b3.setVisible(true);
        ll1.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed
    String s1=tf1.getText();
   
    
    
        String ss=tf.getText();
        
        
    
    
    }//GEN-LAST:event_tfActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        String ss1=tf.getText();
        String s1=tf1.getText();
        if(s1.equals("Doctor"))
    {
        tf3.setText("doctor_Signup");
    }
    else if(s1.equals("Patient"))
    {
        tf3.setText("patient_signup");
    }
        String s=tf3.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("No Problem");
        String url="jdbc:mysql://localhost:3306/e_healthcaredb";
            Connection c=java.sql.DriverManager.getConnection(url,"root","");
      
        System.out.println("No Problem");
        String str="DELETE FROM "+s+" WHERE EmailId ='"+ss1+"'";
        if(s1.equals("Doctor"))
        {
            String str1="DELETE FROM Doctor_Password WHERE Email ='"+ss1+"'";
             Statement stmt= c.createStatement();
        System.out.println(str1);
        stmt.executeUpdate(str1);
        }
        System.out.println(str);
        Statement stmt= c.createStatement();
        System.out.println(str);
        stmt.executeUpdate(str);
        JOptionPane.showMessageDialog(null,"Deletion Successfull");
        Admin al=new Admin();
        al.setVisible(true);
        setVisible(false);
        }
        catch(Exception e)
        {
              JOptionPane.showMessageDialog(null," UnSuccessfull");
            System.out.println(e);
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setVisible(false);
Admin a=new Admin();
a.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel ll1;
    private javax.swing.JTextField tf;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
