package com.echo.clientserver.sayhello.client_asdos;

import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import com.echo.clientserver.sayhello.server.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class asdos_absen extends javax.swing.JFrame {
    DefaultTableModel model;
    Connection con_absen;
    Statement stat_absen;
    ResultSet rs_absen;
    String sql_absen;
    
    public asdos_absen() {
        koneksi DB = new koneksi();
//        DB.config();
//        con_absen = DB.con;
//        stat_absen = DB.stm;
        initComponents();
        //memberi penamaan pada judul kolom tblGaji;
        model = new DefaultTableModel ( );
        tbl_absen.setModel(model);
        model.addColumn("NO");
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Kelas");
        model.addColumn("Jurusan");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_absen = new javax.swing.JTable();
        btn_konek = new javax.swing.JLabel();
        btn_kembali = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(762, 600));
        setSize(new java.awt.Dimension(762, 600));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_absen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_absen.setName("tbl_absen"); // NOI18N
        jScrollPane1.setViewportView(tbl_absen);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 42, 673, -1));

        btn_konek.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btn_konek.setForeground(new java.awt.Color(255, 255, 255));
        btn_konek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_konek.setText("Refresh");
        btn_konek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_konek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_konekMouseClicked(evt);
            }
        });
        jPanel1.add(btn_konek, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 160, 30));

        btn_kembali.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btn_kembali.setForeground(new java.awt.Color(255, 255, 255));
        btn_kembali.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_kembali.setText("Back");
        btn_kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_kembaliMouseClicked(evt);
            }
        });
        jPanel1.add(btn_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 160, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button_Dis.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button_Connect.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, -1, -1));

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_konekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konekMouseClicked
        load_table();
    }//GEN-LAST:event_btn_konekMouseClicked

    private void btn_kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kembaliMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_kembaliMouseClicked

    public void getData( ){
        
    }
    
    private void load_table(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("NIM");
        model.addColumn("KETERANGAN");
        
        //menampilkan data database kedalam tabel
        //"SELECT username_mhs,nama_mhs FROM profil_mahasiswa INNER JOIN absen_detail ON absen_detail.nim_mhs = profil_mahasiswa.username_mhs"
        try {
            int no=1;
            String sql = "SELECT * FROM absen_detail WHERE ket='hadir' ORDER BY id_absen ASC";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString("nim_mhs"),res.getString("ket")});
            }
            tbl_absen.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Gagal Refresh");
        }
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
            java.util.logging.Logger.getLogger(asdos_absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asdos_absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asdos_absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asdos_absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asdos_absen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_kembali;
    private javax.swing.JLabel btn_konek;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_absen;
    // End of variables declaration//GEN-END:variables
}
