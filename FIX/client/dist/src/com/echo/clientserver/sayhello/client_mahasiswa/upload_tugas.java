/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echo.clientserver.sayhello.client_mahasiswa;

import com.echo.clientserver.sayhello.client_asdos.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi_client.ip_form;
import login_form.login_all;

/**
 *
 * @author Knight
 */
public class upload_tugas extends javax.swing.JFrame {
    data_mahasiswa data = new data_mahasiswa();
    String id_absen,nim,id_komputer;
//    String list,id_absen,nim;
    /**
     * Creates new form upload_tugas
     */
    public upload_tugas(String id_absen,String nim,String id_komputer) {
        
        
        initComponents();
        this.id_absen=id_absen;
        this.nim=nim;
        this.id_komputer=id_komputer;
        lbl_id_absen.setText(id_absen);
        System.out.println(id_absen);
        System.out.println(nim);
        System.out.println(id_komputer);
        
        Connection c;
        try {
            c = ip_form.configDB();
        
                Statement s = c.createStatement();
                    String sql = "SELECT * FROM `tugas_soal` WHERE id_absen = '"+id_absen+"'";
                ResultSet r = s.executeQuery(sql);
                while (r.next()) {
                    jTextArea1.setText(r.getString("soal")); 
                }
                } catch (SQLException ex) {
            Logger.getLogger(upload_tugas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tajawab = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lbl_id_absen = new javax.swing.JLabel();
        btn_login = new javax.swing.JLabel();
        btn_login1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_login2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tajawab.setColumns(20);
        tajawab.setRows(5);
        jScrollPane1.setViewportView(tajawab);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 1110, 270));

        jLabel1.setText("Jawaban");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 56, -1));
        getContentPane().add(lbl_id_absen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 430, 20));

        btn_login.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_login.setText("Cek");
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 670, 90, 40));

        btn_login1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_login1.setForeground(new java.awt.Color(255, 255, 255));
        btn_login1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_login1.setText("Jawab");
        btn_login1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_login1MouseClicked(evt);
            }
        });
        getContentPane().add(btn_login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 670, 90, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button Login.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 670, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button Login.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 670, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 59, 1110, 270));

        jLabel2.setText("ID Absen :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 56, 20));

        jLabel3.setText("Soal");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 56, -1));

        btn_login2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_login2.setForeground(new java.awt.Color(255, 255, 255));
        btn_login2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_login2.setText("Kembali");
        btn_login2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_login2MouseClicked(evt);
            }
        });
        getContentPane().add(btn_login2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 90, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button Login.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        Connection c;
        try {
            c = ip_form.configDB();
        
                Statement s = c.createStatement();
                    String sql = "SELECT * FROM `tugas_soal` WHERE id_absen = '"+id_absen+"'";
                ResultSet r = s.executeQuery(sql);
                while (r.next()) {
                    jTextArea1.setText(r.getString("soal")); 
                }
                } catch (SQLException ex) {
            Logger.getLogger(upload_tugas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_loginMouseClicked

    private void btn_login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_login1MouseClicked
            try {
            Connection c = ip_form.configDB();
             String sql2 = "INSERT INTO `tugas_jawaban` VALUES ('"+id_absen+"','"+nim+"','"+tajawab.getText()+"')";
             lbl_id_absen.setText(sql2);
                java.sql.Connection conn=(Connection)ip_form.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql2);
                pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(upload_tugas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_login1MouseClicked

    private void btn_login2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_login2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_login2MouseClicked

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
            java.util.logging.Logger.getLogger(upload_tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(upload_tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(upload_tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(upload_tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new upload_tugas(null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btn_login;
    public javax.swing.JLabel btn_login1;
    public javax.swing.JLabel btn_login2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_id_absen;
    private javax.swing.JTextArea tajawab;
    // End of variables declaration//GEN-END:variables
}
