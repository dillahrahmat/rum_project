package com.echo.clientserver.sayhello.server;

import java.awt.Panel;
import com.echo.clientserver.sayhello.server.*;

public class Dashboard extends javax.swing.JFrame { 
    Home anu_home;
    Profil anu_profil;
    Panel panel;
    login_form login;

    public Dashboard() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnl_dashboard = new javax.swing.JPanel();
        lbl_dash = new javax.swing.JLabel();
        pnl_profil = new javax.swing.JPanel();
        lbl_profil = new javax.swing.JLabel();
        pnl_logout = new javax.swing.JPanel();
        lbl_logout = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnl_atas = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel_alas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1365, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(228, 225, 225));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(280, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/echo/clientserver/sayhello/server/icon/UIN dash.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 74, -1, -1));

        pnl_dashboard.setBackground(new java.awt.Color(255, 255, 255));
        pnl_dashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_dashboard.setPreferredSize(new java.awt.Dimension(280, 40));

        lbl_dash.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_dash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dash.setText("Dashboard");
        lbl_dash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_dash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dashMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_dashboardLayout = new javax.swing.GroupLayout(pnl_dashboard);
        pnl_dashboard.setLayout(pnl_dashboardLayout);
        pnl_dashboardLayout.setHorizontalGroup(
            pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dash, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );
        pnl_dashboardLayout.setVerticalGroup(
            pnl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dash, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 280, -1));

        pnl_profil.setBackground(new java.awt.Color(255, 255, 255));
        pnl_profil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_profil.setPreferredSize(new java.awt.Dimension(280, 40));

        lbl_profil.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_profil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_profil.setText("Profil");
        lbl_profil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_profil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_profilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_profilLayout = new javax.swing.GroupLayout(pnl_profil);
        pnl_profil.setLayout(pnl_profilLayout);
        pnl_profilLayout.setHorizontalGroup(
            pnl_profilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
            .addGroup(pnl_profilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_profil, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
        );
        pnl_profilLayout.setVerticalGroup(
            pnl_profilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(pnl_profilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_profil, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        );

        jPanel1.add(pnl_profil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        pnl_logout.setBackground(new java.awt.Color(255, 255, 255));
        pnl_logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_logout.setPreferredSize(new java.awt.Dimension(280, 40));

        lbl_logout.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logout.setText("Logout");
        lbl_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_logoutLayout = new javax.swing.GroupLayout(pnl_logout);
        pnl_logout.setLayout(pnl_logoutLayout);
        pnl_logoutLayout.setHorizontalGroup(
            pnl_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );
        pnl_logoutLayout.setVerticalGroup(
            pnl_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("LAB-404");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 27, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 720));

        pnl_atas.setBackground(new java.awt.Color(61, 60, 60));
        pnl_atas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_atas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setText("Welcome");
        pnl_atas.add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 20, 170, -1));

        getContentPane().add(pnl_atas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1130, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/echo/clientserver/sayhello/server/icon/UIN dash.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 74, -1, -1));

        panel_alas.setBackground(new java.awt.Color(245, 245, 245));
        panel_alas.setLayout(new java.awt.CardLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/echo/clientserver/sayhello/server/icon/wall2.png"))); // NOI18N
        panel_alas.add(jLabel2, "card2");

        getContentPane().add(panel_alas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 1130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_profilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_profilMouseClicked
        // TODO add your handling code here:
        pnl_dashboard.setBackground(java.awt.Color.decode("#ffffff"));
        lbl_dash.setForeground(java.awt.Color.decode("#000000"));
        pnl_profil.setBackground(java.awt.Color.decode("#30AD5B"));
        lbl_profil.setForeground(java.awt.Color.decode("#ffffff"));
        lbl_title.setText("Profil");
        muncul_profil();
        anu_profil.tampildata();
    }//GEN-LAST:event_lbl_profilMouseClicked

    private void lbl_dashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashMouseClicked
        // TODO add your handling code here:
        pnl_profil.setBackground(java.awt.Color.decode("#ffffff"));
        lbl_profil.setForeground(java.awt.Color.decode("#000000"));
        pnl_dashboard.setBackground(java.awt.Color.decode("#30AD5B"));
        lbl_dash.setForeground(java.awt.Color.decode("#ffffff"));
        lbl_title.setText("Dashboard");
        muncul_home();
    }//GEN-LAST:event_lbl_dashMouseClicked

    private void muncul_home(){
        anu_home  = new Home();
        
        //remove panel
        panel_alas.removeAll();
        panel_alas.repaint();
        panel_alas.revalidate();
        
        //add panel
        panel_alas.add(anu_home);
        panel_alas.repaint();
        panel_alas.revalidate();
               
    }
    
    private void muncul_profil(){
        anu_profil  = new Profil();
        
        //remove panel
        panel_alas.removeAll();
        panel_alas.repaint();
        panel_alas.revalidate();
        
        //add panel
        panel_alas.add(anu_profil);
        panel_alas.repaint();
        panel_alas.revalidate();
    }
    
    private void lbl_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoutMouseClicked
        // TODO add your handling code here:
        pnl_logout.setBackground(java.awt.Color.decode("#E22121"));
        lbl_logout.setForeground(java.awt.Color.decode("#ffffff"));
        pindahke1();
    }//GEN-LAST:event_lbl_logoutMouseClicked

    private void pindahke1() {
        login_form frm_login = new login_form();
        frm_login.setVisible(true);
        this.setVisible(false);
    }
    
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbl_dash;
    public javax.swing.JLabel lbl_logout;
    public javax.swing.JLabel lbl_profil;
    public javax.swing.JLabel lbl_title;
    public javax.swing.JPanel panel_alas;
    public javax.swing.JPanel pnl_atas;
    public javax.swing.JPanel pnl_dashboard;
    public javax.swing.JPanel pnl_logout;
    public javax.swing.JPanel pnl_profil;
    // End of variables declaration//GEN-END:variables
}
