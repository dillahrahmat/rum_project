/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echo.clientserver.sayhello.server;

import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.echo.clientserver.sayhello.server.Dashboard;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.echo.clientserver.sayhello.server.koneksi;


public class Home extends javax.swing.JPanel {
    String a;
    Statement stat_akses;
    ResultSet rs_akses;
    String sql_akses;
    Dashboard akses_dash;
    Registry registry;
    String status, nilai;
    Dashboard frm_dash;
    
    /**
     * Creates new form Home
     */
    public Home() {
        koneksi DB = new koneksi();
        status = "online";
        frm_dash = new Dashboard();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_alas = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_diskonek = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_konek = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_status = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        panel_alas.setBackground(new java.awt.Color(245, 245, 245));
        panel_alas.setLayout(null);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/echo/clientserver/sayhello/server/icon/Gambar_Dis.png"))); // NOI18N
        panel_alas.add(jLabel12);
        jLabel12.setBounds(620, 190, 270, 120);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Disconnect");
        panel_alas.add(jLabel13);
        jLabel13.setBounds(620, 320, 270, 29);

        btn_diskonek.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btn_diskonek.setForeground(new java.awt.Color(255, 255, 255));
        btn_diskonek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_diskonek.setText("Disconnect");
        btn_diskonek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_diskonek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_diskonekMouseClicked(evt);
            }
        });
        panel_alas.add(btn_diskonek);
        btn_diskonek.setBounds(680, 370, 170, 40);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/echo/clientserver/sayhello/server/icon/Button_Dis.png"))); // NOI18N
        panel_alas.add(jLabel14);
        jLabel14.setBounds(630, 370, 270, 50);

        btn_konek.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btn_konek.setForeground(new java.awt.Color(255, 255, 255));
        btn_konek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_konek.setText("Connect");
        btn_konek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_konek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_konekMouseClicked(evt);
            }
        });
        panel_alas.add(btn_konek);
        btn_konek.setBounds(210, 370, 270, 40);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/echo/clientserver/sayhello/server/icon/Button_Connect.png"))); // NOI18N
        panel_alas.add(jLabel8);
        jLabel8.setBounds(210, 370, 270, 50);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/echo/clientserver/sayhello/server/icon/Gambar_Connect.png"))); // NOI18N
        panel_alas.add(jLabel9);
        jLabel9.setBounds(210, 190, 270, 120);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("WORK");
        panel_alas.add(jLabel11);
        jLabel11.setBounds(210, 320, 270, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/echo/clientserver/sayhello/server/icon/Dasar_Connect.png"))); // NOI18N
        panel_alas.add(jLabel6);
        jLabel6.setBounds(210, 180, 273, 278);

        txt_status.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_status.setText("Offline");
        panel_alas.add(txt_status);
        txt_status.setBounds(520, 530, 71, 29);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/echo/clientserver/sayhello/server/icon/Dasar_Dis.png"))); // NOI18N
        panel_alas.add(jLabel7);
        jLabel7.setBounds(620, 180, 273, 278);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_alas, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_alas, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_diskonekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_diskonekMouseClicked
        try {
            gak_bisa();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        status_offline();
        btn_diskonek.setEnabled(false);
        btn_konek.setEnabled(true);
        frm_dash.lbl_logout.setEnabled(true);
        
    }//GEN-LAST:event_btn_diskonekMouseClicked

    private void btn_konekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konekMouseClicked
        try {
            bisa();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        status_online();
        btn_diskonek.setEnabled(true);
        btn_konek.setEnabled(false);
        JOptionPane.showMessageDialog(null,"Tekan DISCONNECT terlebih dahulu jika ingin keluar");
        
    }//GEN-LAST:event_btn_konekMouseClicked

    public void status_online(){
        txt_status.setText("online");
    }
    
    public void status_offline(){
        txt_status.setText("offline");
    }
    
    private void bisa() throws SQLException{
        sql_akses = "INSERT INTO akses_db VALUES ('"+status+"')";
        java.sql.Connection conn=(Connection)koneksi.configDB();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql_akses);
        pst.execute();
    }
    
    private void gak_bisa() throws SQLException{
        sql_akses = "DELETE FROM akses_db WHERE akses_mhs='"+status+"'";
        java.sql.Connection conn=(Connection)koneksi.configDB();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql_akses);
        pst.execute();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btn_diskonek;
    public javax.swing.JLabel btn_konek;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel panel_alas;
    public javax.swing.JLabel txt_status;
    // End of variables declaration//GEN-END:variables
}
