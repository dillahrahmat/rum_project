package com.echo.clientserver.sayhello.client_mahasiswa;

import koneksi_client.ip_form;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import login_form.login_all;

public class dash_mahasiswa extends javax.swing.JFrame {
    data_mahasiswa data=new data_mahasiswa();
    profil_mahasiswa frm_prof;
    login_all ke_login = new login_all();
    Connection c_mhs;
    Statement s_mhs;
    ResultSet r_mhs;
    String sql_mhs, b, d,id_absen,nim,id_komputer;
    
    
    public dash_mahasiswa(String c,String id_absen, String nim,String id_komputer) {
        initComponents();
        this.data=data;
        this.id_absen=id_absen;
        this.id_komputer=id_komputer;
        this.nim=nim;
        d = c;
        frm_prof = new profil_mahasiswa(d);
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
        txt_status = new javax.swing.JLabel();
        icon_off = new javax.swing.JLabel();
        panel_alas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1365, 725));
        setResizable(false);
        setSize(new java.awt.Dimension(1365, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(228, 225, 225));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(280, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/UIN dash.png"))); // NOI18N
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
            .addGap(0, 278, Short.MAX_VALUE)
            .addGroup(pnl_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_logoutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnl_logoutLayout.setVerticalGroup(
            pnl_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(pnl_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_logoutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnl_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, -1, -1));

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

        txt_status.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_status.setForeground(new java.awt.Color(255, 255, 255));
        txt_status.setText("Online ");
        pnl_atas.add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, -1));

        icon_off.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        icon_off.setForeground(new java.awt.Color(255, 255, 255));
        icon_off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stat_on.png"))); // NOI18N
        pnl_atas.add(icon_off, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 25, -1, -1));

        getContentPane().add(pnl_atas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1090, 70));

        panel_alas.setBackground(new java.awt.Color(245, 245, 245));
        panel_alas.setLayout(new java.awt.CardLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/wall3.jpg"))); // NOI18N
        panel_alas.add(jLabel2, "card2");

        getContentPane().add(panel_alas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 1140, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_dashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashMouseClicked
        // TODO add your handling code here:
        pnl_profil.setBackground(java.awt.Color.decode("#ffffff"));
        lbl_profil.setForeground(java.awt.Color.decode("#000000"));
        pnl_dashboard.setBackground(java.awt.Color.decode("#30AD5B"));
        lbl_dash.setForeground(java.awt.Color.decode("#ffffff"));
        lbl_title.setText("Dashboard");
        muncul_home_mahasiswa();
    }//GEN-LAST:event_lbl_dashMouseClicked

    private void lbl_profilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_profilMouseClicked
        // TODO add your handling code here:
        pnl_dashboard.setBackground(java.awt.Color.decode("#ffffff"));
        lbl_dash.setForeground(java.awt.Color.decode("#000000"));
        pnl_profil.setBackground(java.awt.Color.decode("#30AD5B"));
        lbl_profil.setForeground(java.awt.Color.decode("#ffffff"));
        lbl_title.setText("Profil");

         muncul_profil_mahasiswa();
        //asdos_profil.tampildataasdos();
    }//GEN-LAST:event_lbl_profilMouseClicked

    private void lbl_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoutMouseClicked
        // TODO add your handling code here:
        
        pnl_logout.setBackground(java.awt.Color.decode("#E22121"));
        lbl_logout.setForeground(java.awt.Color.decode("#ffffff"));
        delete_data();
        login();
    }//GEN-LAST:event_lbl_logoutMouseClicked

    private void delete_data(){
        try {
            sql_mhs = "delete from absen_mhs where nim_mhs='"+d+"'";
            java.sql.Connection conn=(Connection)ip_form.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql_mhs);
            pst.execute();
        } catch (SQLException e) {
        }
    }
    
    private void muncul_profil_mahasiswa(){
        //remove panel
        hapus_panel();
        
        //add panel
        panel_alas.add(frm_prof);
        panel_alas.repaint();
        panel_alas.revalidate();
    }
    
    private void muncul_home_mahasiswa(){
        System.out.println(id_absen);
        System.out.println(nim);
        System.out.println(id_komputer);
        home_mahasiswa frm_home  = new home_mahasiswa(id_absen,nim,id_komputer);
        //remove panel
        hapus_panel();
        
        //add panel
        panel_alas.add(frm_home);
        panel_alas.repaint();
        panel_alas.revalidate();
    }
    
    private void hapus_panel(){
        panel_alas.removeAll();
        panel_alas.repaint();
        panel_alas.revalidate();
    }
    
    private void login() {
        login_all frm_login = new login_all();
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
            java.util.logging.Logger.getLogger(dash_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dash_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dash_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dash_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dash_mahasiswa(null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel icon_off;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_dash;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_profil;
    public javax.swing.JLabel lbl_title;
    private javax.swing.JPanel panel_alas;
    public javax.swing.JPanel pnl_atas;
    private javax.swing.JPanel pnl_dashboard;
    private javax.swing.JPanel pnl_logout;
    private javax.swing.JPanel pnl_profil;
    public javax.swing.JLabel txt_status;
    // End of variables declaration//GEN-END:variables
}
