/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beadando;

import beadando.Kaja;
import java.awt.Panel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Clock;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author zbocskay
 */
public class Kaloriatabla extends javax.swing.JFrame {

    /**
     * Creates new form Kaloriatabla
     */
    public Connection conn;
    public Kaloriatabla() {
        initComponents(); 
        setLocationRelativeTo(null);
        UsernameTextField.setText("H_IRD0M4"); 
        PasswordTextField.setText("kassai"); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        AddKajaButton = new javax.swing.JButton();
        LoggedInPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddKajaButton.setText("Kajafelvétel");
        AddKajaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddKajaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddKajaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddKajaButton)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        jLabel1.setText("jLabel1");

        UsernameTextField.setText("jTextField1");

        PasswordTextField.setText("jPasswordField1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout LoggedInPanelLayout = new javax.swing.GroupLayout(LoggedInPanel);
        LoggedInPanel.setLayout(LoggedInPanelLayout);
        LoggedInPanelLayout.setHorizontalGroup(
            LoggedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoggedInPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        LoggedInPanelLayout.setVerticalGroup(
            LoggedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoggedInPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(LoggedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)))
        );

        LoginButton.setText("Bejelentkezés");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoggedInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton)
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoggedInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LoginButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        if (LoginButton.getText().equalsIgnoreCase("Bejelentkezés")) { 
                try { 
                    DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
                    conn=DriverManager.getConnection("jdbc:oracle:thin:@db.inf.unideb.hu:1521:ora11g", UsernameTextField.getText(),new String(PasswordTextField.getPassword())); 
                    JOptionPane.showMessageDialog(this, "A kapcsolat létrejött!", "Információ",JOptionPane.INFORMATION_MESSAGE); 
                    LoginButton.setText("Kijelentkezés"); 
                    Panel.setVisible(true);
                    LoggedInPanel.setVisible(false);
                } catch (SQLException ex) { 
                    JOptionPane.showMessageDialog(this, ex.getMessage(),"Hiba",JOptionPane.ERROR_MESSAGE); 
} 
        } else { 
                if (conn!=null) { 
                       try { 
                            conn.close(); 
                            LoginButton.setText("Bejelentkezés"); 
                            Panel.setVisible(false); 
                            LoggedInPanel.setVisible(true);
                       } catch(Exception ex) { 
                            JOptionPane.showMessageDialog(this,ex.getMessage(),"Hiba",JOptionPane.ERROR_MESSAGE); 
 } 
} 
 
                
} 
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void AddKajaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddKajaButtonActionPerformed
//        if ( AddKajaButton.getText().equalsIgnoreCase("Kajafelvétel")){
//            AddKaja ak = new AddKaja();
//            ak.setVisible(true);
//            AddKajaButton.setVisible(false);
//        }
    }//GEN-LAST:event_AddKajaButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Kaloriatabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Kaloriatabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Kaloriatabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Kaloriatabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Kaloriatabla().setVisible(true);
//            }
//        });
        //Kaja k = new Kaja();
        //System.out.println(k.getFeherje());
           Factory.newKaja(30, "megnevezés", 100, 100, 100);
           ArrayList<Kaja> kajak = Factory.getKajak();
           for(Kaja kaja : kajak ){
               System.out.println(kaja);
           }
           
//        for(Kaja item : k.getKajak() ){
//            //System.out.println(item.toString());
//            System.out.println(item);
//            
//        }
//        System.out.println(k.getKajak().size());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddKajaButton;
    private javax.swing.JPanel LoggedInPanel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel Panel;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
