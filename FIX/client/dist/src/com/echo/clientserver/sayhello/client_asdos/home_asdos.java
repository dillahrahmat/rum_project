/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echo.clientserver.sayhello.client_asdos;

import com.echo.clientserver.sayhello.server.login_form;
import java.io.File;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import koneksi_client.ip_form;
import login_form.login_all;
//import sun.util.calendar.LocalGregorianCalendar;
//import sun.util.resources.LocaleData;

public class home_asdos extends javax.swing.JPanel {
    String m,formattedtanggal,formattedjam,waktu,id_absen;    
    
//    Date tgl,jam;
    
    public home_asdos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_alas = new javax.swing.JPanel();
        btn_akses_absen = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_View = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_konek = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb_akses = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1270, 800));

        panel_alas.setBackground(new java.awt.Color(245, 245, 245));
        panel_alas.setPreferredSize(new java.awt.Dimension(1280, 853));
        panel_alas.setLayout(null);

        btn_akses_absen.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btn_akses_absen.setForeground(new java.awt.Color(255, 255, 255));
        btn_akses_absen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_akses_absen.setText("Buka Akses");
        btn_akses_absen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_akses_absen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_akses_absenMouseClicked(evt);
            }
        });
        panel_alas.add(btn_akses_absen);
        btn_akses_absen.setBounds(390, 45, 160, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button_Connect.png"))); // NOI18N
        panel_alas.add(jLabel10);
        jLabel10.setBounds(380, 40, 176, 50);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tugas-1.png"))); // NOI18N
        panel_alas.add(jLabel12);
        jLabel12.setBounds(770, 260, 110, 120);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setText("ABSEN");
        panel_alas.add(jLabel13);
        jLabel13.setBounds(790, 390, 90, 29);

        btn_View.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btn_View.setForeground(new java.awt.Color(255, 255, 255));
        btn_View.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_View.setText("View");
        btn_View.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_View.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ViewMouseClicked(evt);
            }
        });
        panel_alas.add(btn_View);
        btn_View.setBounds(740, 445, 170, 40);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button_Dis.png"))); // NOI18N
        panel_alas.add(jLabel14);
        jLabel14.setBounds(740, 440, 176, 50);

        btn_konek.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btn_konek.setForeground(new java.awt.Color(255, 255, 255));
        btn_konek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_konek.setText("Upload");
        btn_konek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_konek.setEnabled(false);
        btn_konek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_konekMouseClicked(evt);
            }
        });
        panel_alas.add(btn_konek);
        btn_konek.setBounds(340, 450, 170, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button_Connect.png"))); // NOI18N
        panel_alas.add(jLabel8);
        jLabel8.setBounds(340, 450, 176, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tugas.png"))); // NOI18N
        panel_alas.add(jLabel9);
        jLabel9.setBounds(370, 270, 110, 120);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("WORK");
        panel_alas.add(jLabel11);
        jLabel11.setBounds(390, 400, 80, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Dasar_Connect.png"))); // NOI18N
        panel_alas.add(jLabel6);
        jLabel6.setBounds(290, 250, 273, 278);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Dasar_Dis.png"))); // NOI18N
        panel_alas.add(jLabel7);
        jLabel7.setBounds(690, 250, 280, 280);

        cb_akses.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_akses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PBO A", "WEB A" }));
        panel_alas.add(cb_akses);
        cb_akses.setBounds(40, 40, 310, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_alas, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_alas, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewMouseClicked
        muncul_absen();
    }//GEN-LAST:event_btn_ViewMouseClicked

    private void btn_konekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konekMouseClicked
//        JFileChooser jfc = new JFileChooser();
//        jfc.showOpenDialog(null);
//
//        File file = jfc.getSelectedFile();
//        String dir = file.getAbsolutePath();
    muncul_upload();
    }//GEN-LAST:event_btn_konekMouseClicked

    private String getTanggal() {  
        final LocalDate tanggal = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formattedtanggal = tanggal.format(formatter);
        return (formattedtanggal);
    }  
     
    private String getWaktu() {  
        final LocalTime jam = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        formattedjam = jam.format(formatter);
        return (formattedjam);
    }
    
    private String getWaktu_coba() {
        final LocalTime jam = LocalTime.now();
        LocalTime a =jam.plusMinutes(15);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        formattedjam = a.format(formatter);
//        jTextField1.setText(formattedjam);
        return (formattedjam);
    }
    
    private void ambilwaktu(){
        try
            {
            Connection c = ip_form.configDB();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM absen WHERE id_absen='2019APBO01L40303'";
            ResultSet r = s.executeQuery(sql);

                while(r.next())
                {
//                    jTextField1.setText(r.getString("jam_absen"));
//                    waktu = jTextField1.getText();
                    String sub_jam = waktu.substring(0, 2);
                    String sub_menit = waktu.substring(3, 5);
                    Integer jm,mnt;
                    jm = Integer.parseInt(sub_jam);
                    mnt = Integer.parseInt(sub_menit);
                    System.out.println(jm);
                    System.out.println(mnt);
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"GAGAL Ambil Waktu ");
            }
    }
    
    
    
    private void btn_akses_absenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_akses_absenMouseClicked
        // TODO add your handling code here:
//        String tgl,jm;
//        final LocalDate tanggal = LocalDate.now();
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
////        dateFormat.toString(tanggal);
//        tgl=getTanggal();
//        
//        
//        final LocalTime jam = LocalTime.now();
//        DateFormat jamformat = new SimpleDateFormat("HH:mm:ss");
//        jm=jamformat.format(jam);
        String itemText = (String) cb_akses.getSelectedItem ();
        if (itemText.equals("PBO A")){
            try {
                Connection c = ip_form.configDB();
                Statement s = c.createStatement();
                String sql = "SELECT * FROM `absen` WHERE id_absen LIKE '____APBO%' AND tanggal_absen=0000-00-00 ORDER BY id_absen ASC limit 1";
                ResultSet r = s.executeQuery(sql);
                while (r.next()) {
                    m = r.getString("id_absen");
                }
                id_absen=m;                      
                btn_konek.setEnabled(true);
                String sql2 = "UPDATE `absen` SET `tanggal_absen`='"+getTanggal()+"',`jam_absen`='"+getWaktu()+"' WHERE id_absen='"+m+"'";
                java.sql.Connection conn=(Connection)ip_form.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql2);
                pst.execute();
                JOptionPane.showMessageDialog(null, "akses PBO A dibuka");
            } catch (SQLException e) {
            }
        }else if (itemText=="WEB A"){
          try {
                Connection c = ip_form.configDB();
                Statement s = c.createStatement();
                String sql = "SELECT * FROM `absen` WHERE id_absen LIKE '____AWEB%' AND tanggal_absen=0000-00-00 ORDER BY id_absen ASC limit 1";
                ResultSet r = s.executeQuery(sql);
                while (r.next()) {
                    m = r.getString("id_absen");
                }
                String sql2 = "UPDATE `absen` SET `tanggal_absen`='"+getTanggal()+"',`jam_absen`='"+getWaktu()+"' WHERE id_absen='"+m+"'";
                java.sql.Connection conn=(Connection)ip_form.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql2);
                pst.execute();
                JOptionPane.showMessageDialog(null, "akses WEB A dibuka");
            } catch (SQLException e) {
            }    
        }
    }//GEN-LAST:event_btn_akses_absenMouseClicked

    private void muncul_absen(){
        asdos_absen absen_asdos  = new asdos_absen();
        absen_asdos.setVisible(true);
        this.setEnabled(false);   
    }
    private void muncul_upload(){
        upload_tugas ut  = new upload_tugas(id_absen);
        ut.setVisible(true);
        this.setEnabled(false);   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_View;
    private javax.swing.JLabel btn_akses_absen;
    private javax.swing.JLabel btn_konek;
    private javax.swing.JComboBox<String> cb_akses;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel_alas;
    // End of variables declaration//GEN-END:variables
}
