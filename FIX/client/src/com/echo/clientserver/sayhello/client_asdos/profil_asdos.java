package com.echo.clientserver.sayhello.client_asdos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi_client.ip_form;
import login_form.login_all;
/**
 *
 * @author R
 */
public class profil_asdos extends javax.swing.JPanel {
    login_all akses_login_profil = new login_all();
    Connection con_asdos;
    Statement stat_asdos;
    ResultSet rs_asdos;
    String sql_asdos, akhir;
    dash_asdos asdos_dash;
    /**
     * Creates new form profil_asdos
     */
    public profil_asdos(String tampil1) {
        initComponents();
        akhir = tampil1;
        tampildataasdos();
    }
    
    public void tampildataasdos(){
        try
            {
            Connection c = ip_form.configDB();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM profil_asdos WHERE username_asdos='"+akhir+"'";
            ResultSet r = s.executeQuery(sql);

                while(r.next())
                {
                    et_nama_asdos.setText(r.getString("nama_asdos"));
                    et_nim_asdos.setText(r.getString("username_asdos"));
                    et_jurusan_asdos.setText(r.getString("jurusan_asdos"));
                    et_matkul_asdos.setText(r.getString("jabatan_asdos"));
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"GAGAL Input profil");
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

        jLabel3 = new javax.swing.JLabel();
        et_nim_asdos = new javax.swing.JTextField();
        et_nama_asdos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        et_jurusan_asdos = new javax.swing.JTextField();
        et_matkul_asdos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("NIM");
        jLabel3.setToolTipText("");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 195, -1, -1));

        et_nim_asdos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        add(et_nim_asdos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 270, -1));

        et_nama_asdos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        add(et_nama_asdos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 270, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Nama ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 115, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 130, 140));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Jurusan");
        jLabel5.setToolTipText("");
        jLabel5.setName(""); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        et_jurusan_asdos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        et_jurusan_asdos.setName("et_kelas"); // NOI18N
        add(et_jurusan_asdos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 270, -1));

        et_matkul_asdos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        et_matkul_asdos.setName("et_kelas"); // NOI18N
        add(et_matkul_asdos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 270, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Matkul");
        jLabel7.setToolTipText("");
        jLabel7.setName(""); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 49, 720, 480));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField et_jurusan_asdos;
    private javax.swing.JTextField et_matkul_asdos;
    private javax.swing.JTextField et_nama_asdos;
    private javax.swing.JTextField et_nim_asdos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
