
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yash
 */
public class q extends javax.swing.JFrame {

    /**
     * Creates new form q
     */
    public q() {
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

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_no = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setText("Name");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 23, -1, -1));

        l2.setText("Mobile no.");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 63, -1, -1));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 20, 148, -1));
        getContentPane().add(txt_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 60, 148, -1));

        b1.setText("SAVE");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 132, -1, -1));

        jButton1.setText("TECHNICAL SKILLS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
         String name=txt_name.getText();
                String no=txt_no.getText();
                Connection x=null;
                PreparedStatement z=null;
               
                    try
                    {
                        java.lang.Class.forName("com.mysql.jdbc.Driver");
       x = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","yash");
        z=x.prepareStatement("insert into form values(?,?)");
        z.setString(1, name);
        z.setString(2, no);
        int i=z.executeUpdate();
        
      
        if(i>0)
        {
            JOptionPane.showMessageDialog(null,"Data Saved carefully");
        }
        else{
            JOptionPane.showMessageDialog(null,"Data not Saved carefully");
        }}
                    catch(Exception ex)
                    {
                        System.out.println(ex);
                    }
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
JOptionPane.showMessageDialog(null,"Java\n"
        + "c++\n"
        + "\n");     // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(q.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(q.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(q.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(q.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new q().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_no;
    // End of variables declaration//GEN-END:variables
}
