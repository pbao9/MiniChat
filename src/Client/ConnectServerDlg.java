/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author BARO
 */
public class ConnectServerDlg extends javax.swing.JFrame {

    /**
     * Creates new form ConnectServerDlg
     */
    public ConnectServerDlg() {
        initComponents();
    }
    // Chú ý khai báo
    private String IPServer = null;
    private String Username = null;
    private int PortServer = 0;
    private int Port = 0;
    // Chú ý khai báo

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfServerIPAddress = new javax.swing.JTextField();
        jtfServerPortAddress = new javax.swing.JTextField();
        jtfUsername = new javax.swing.JTextField();
        jtfPort = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Server IP Address:");
        jLabel1.setToolTipText("");

        jLabel2.setText("Server Port Address:");

        jLabel3.setText("Username:");

        jLabel4.setText("Port:");

        jtfServerIPAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfServerIPAddressKeyPressed(evt);
            }
        });

        jtfServerPortAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfServerPortAddressKeyPressed(evt);
            }
        });

        jtfUsername.setToolTipText("");
        jtfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfUsernameKeyPressed(evt);
            }
        });

        jtfPort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfPortKeyPressed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOK)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPort, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfServerPortAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfServerIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfServerIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfServerPortAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseClicked
        // TODO add your handling code here:
        int Error = 0;
        IPServer = jtfServerIPAddress.getText();
        if (IPServer.equals("")) {
            JOptionPane.showMessageDialog(this, "Invalid ServerIP", "Error", JOptionPane.OK_OPTION);
            Error++;
        }
        Username = jtfUsername.getText();
        if (Username.equals("")) {
            JOptionPane.showMessageDialog(this, "Invalid Username", "Error", JOptionPane.OK_OPTION);
            Error++;
        }
        try {
            PortServer = Integer.parseInt(jtfServerPortAddress.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid PortServer", "Error", JOptionPane.OK_OPTION);
            Error++;
        }
        try {
            Port = Integer.parseInt(jtfPort.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Port", "Error", JOptionPane.OK_OPTION);
            Error++;
        }
        if (Error == 0) {
            MyInfo info = new MyInfo(Username, Port);
            Client client = new Client(IPServer, PortServer, info);
            dispose();
        }
    }//GEN-LAST:event_btnOKMouseClicked

    private void jtfServerIPAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfServerIPAddressKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int Error = 0;
            IPServer = jtfServerIPAddress.getText();
            if (IPServer.equals("")) {
                JOptionPane.showMessageDialog(this, "Invalid ServerIP", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            Username = jtfUsername.getText();
            if (Username.equals("")) {
                JOptionPane.showMessageDialog(this, "Invalid Username", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            try {
                PortServer = Integer.parseInt(jtfServerPortAddress.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid PortServer", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            try {
                Port = Integer.parseInt(jtfPort.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Port", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            if (Error == 0) {
                MyInfo info = new MyInfo(Username, Port);
                Client client = new Client(IPServer, PortServer, info);
                dispose();
            }
        }
    }//GEN-LAST:event_jtfServerIPAddressKeyPressed

    private void jtfServerPortAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfServerPortAddressKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int Error = 0;
            IPServer = jtfServerIPAddress.getText();
            if (IPServer.equals("")) {
                JOptionPane.showMessageDialog(this, "Invalid ServerIP", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            Username = jtfUsername.getText();
            if (Username.equals("")) {
                JOptionPane.showMessageDialog(this, "Invalid Username", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            try {
                PortServer = Integer.parseInt(jtfServerPortAddress.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid PortServer", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            try {
                Port = Integer.parseInt(jtfPort.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Port", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            if (Error == 0) {
                MyInfo info = new MyInfo(Username, Port);
                Client client = new Client(IPServer, PortServer, info);
                dispose();
            }
        }
    }//GEN-LAST:event_jtfServerPortAddressKeyPressed

    private void jtfUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUsernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int Error = 0;
            IPServer = jtfServerIPAddress.getText();
            if (IPServer.equals("")) {
                JOptionPane.showMessageDialog(this, "Invalid ServerIP", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            Username = jtfUsername.getText();
            if (Username.equals("")) {
                JOptionPane.showMessageDialog(this, "Invalid Username", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            try {
                PortServer = Integer.parseInt(jtfServerPortAddress.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid PortServer", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            try {
                Port = Integer.parseInt(jtfPort.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Port", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            if (Error == 0) {
                MyInfo info = new MyInfo(Username, Port);
                Client client = new Client(IPServer, PortServer, info);
                dispose();
            }
        }
    }//GEN-LAST:event_jtfUsernameKeyPressed

    private void jtfPortKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPortKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int Error = 0;
            IPServer = jtfServerIPAddress.getText();
            if (IPServer.equals("")) {
                JOptionPane.showMessageDialog(this, "Invalid ServerIP", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            Username = jtfUsername.getText();
            if (Username.equals("")) {
                JOptionPane.showMessageDialog(this, "Invalid Username", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            try {
                PortServer = Integer.parseInt(jtfServerPortAddress.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid PortServer", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            try {
                Port = Integer.parseInt(jtfPort.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Port", "Error", JOptionPane.OK_OPTION);
                Error++;
            }
            if (Error == 0) {
                MyInfo info = new MyInfo(Username, Port);
                Client client = new Client(IPServer, PortServer, info);
                dispose();
            }
        }
    }//GEN-LAST:event_jtfPortKeyPressed

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
            java.util.logging.Logger.getLogger(ConnectServerDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectServerDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectServerDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectServerDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnectServerDlg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfPort;
    private javax.swing.JTextField jtfServerIPAddress;
    private javax.swing.JTextField jtfServerPortAddress;
    private javax.swing.JTextField jtfUsername;
    // End of variables declaration//GEN-END:variables
}
