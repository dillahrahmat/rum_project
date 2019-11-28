package login_form;

import com.echo.clientserver.sayhello.SayHello;
import com.echo.clientserver.sayhello.client_asdos.dash_asdos;
import com.echo.clientserver.sayhello.client_mahasiswa.dash_mahasiswa;
import com.echo.clientserver.sayhello.client_mahasiswa.data_mahasiswa;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import koneksi_client.ip_form;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class login_all extends javax.swing.JFrame {
    private SayHello sayHello_client;
    Connection con_client;
    Statement stat_client;
    ResultSet rs_client, rs_mahasiswa, rs_akses;
    String sql_client, sql_mahasiswa, sql_akses;
    String status,a,m,v,formattedtanggal,formattedjam;
    Integer gg,hasil_mnt,hasil_jm;
    public String id_absen,nim,id_komputer;
    data_mahasiswa data=new data_mahasiswa();
    
    public login_all() {
        status = "online";
        try {
            FileReader reader = new FileReader("id.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            int character;
 
            while ((id_komputer = bufferedReader.readLine()) != null) {
                
                System.out.println(id_komputer);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        et_user = new javax.swing.JTextField();
        btn_exit = new javax.swing.JLabel();
        btn_login = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        et_pass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        cb_hak = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1370, 740));
        setSize(new java.awt.Dimension(1370, 740));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/UIN.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(208, 208, 208))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel1)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 740));

        jPanel2.setBackground(new java.awt.Color(45, 44, 44));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(45, 44, 44));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/username.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        et_user.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        et_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                et_userActionPerformed(evt);
            }
        });
        jPanel2.add(et_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 222, 36));

        btn_exit.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_exit.setText("Exit");
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });
        jPanel2.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 80, 35));

        btn_login.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_login.setText("Login");
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        jPanel2.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 80, 35));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sign In Mahasiswa");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 350, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button Login.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button Cancel.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pass.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        et_pass.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel2.add(et_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 222, 36));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Hak.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        cb_hak.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        cb_hak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Hak Akses", "Asisten Dosen", "Mahasiswa" }));
        cb_hak.setName("cb_hak"); // NOI18N
        cb_hak.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_hakItemStateChanged(evt);
            }
        });
        jPanel2.add(cb_hak, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 220, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 700, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void et_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_et_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_et_userActionPerformed

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitMouseClicked

    private void akses(){
        try {
            Connection c = ip_form.configDB();
            stat_client = c.createStatement();
            sql_akses = "SELECT * FROM akses_db";
            rs_akses = stat_client.executeQuery(sql_akses);
            if(rs_akses.next()){
                if(status.equals(rs_akses.getString("akses_mhs"))){
                    a = et_user.getText();
                    login();
                }
            }else{
                    JOptionPane.showMessageDialog(null, "Server Belum Terhubung");
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "gagalki bede ");
        }
    }
    
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
    
    private void login(){
        String itemText = (String) cb_hak.getSelectedItem ();
        if (itemText=="Asisten Dosen"){
            try {
                Connection c = ip_form.configDB();
                Statement s = c.createStatement();
                String sql = "SELECT * FROM profil_asdos where username_asdos='"+et_user.getText() + "' and password_asdos='"+ et_pass.getText() +"'";
                ResultSet r = s.executeQuery(sql);
                int baris = 0;
                nim=et_user.getText();
                while (r.next()) {
                    baris = r.getRow();
                }
                if (baris ==1) {
                    baris++;
                    JOptionPane.showMessageDialog(null,"Berhasil Login");
                    pindahkeasdos();
                }else {
                    JOptionPane.showMessageDialog(null,"Gagal Login");
                    et_user.setText("");
                    et_pass.setText("");
                }
            } catch (SQLException e) {
            }
            
        } else if (itemText=="Mahasiswa"){
            try {
                Connection c = ip_form.configDB();
                Statement s = c.createStatement();
                String sql = "SELECT * FROM profil_mahasiswa where username_mhs='"+et_user.getText() + "' and password_mhs='"+ et_pass.getText() +"'";
                ResultSet r = s.executeQuery(sql);
                nim=et_user.getText();
                int baris = 0;
                while (r.next()) {
                    baris = r.getRow();
                }
                
                if (baris ==1) {
                    Connection k = ip_form.configDB();
                    Statement l = k.createStatement();
                    String sql2 = "SELECT * FROM absen_detail where nim_mhs='"+et_user.getText() + "' and id_absen LIKE '%01'";
                    ResultSet rs = l.executeQuery(sql2);
                    while (rs.next()){
                        m=rs.getString("id_absen");
                    } String o = m.substring(0, 14);
//                    jTextField1.setText(o);
                    System.out.println(o);
                    Connection k1 = ip_form.configDB();
                    Statement l1 = k1.createStatement();
                    String sql3 = "SELECT * FROM absen where id_absen like '"+o+"%' and tanggal_absen='"+getTanggal()+"' order by jam_absen DESC limit 1";
                    ResultSet rs1 = l1.executeQuery(sql3);
                    while (rs1.next()){
                        m=rs1.getString("id_absen");
                        System.out.println(m);
                    }
                    id_absen=m;
                    System.out.println(sql3);
                    
                    String ff = muncul_waktu(m);
                    
                    String sql4 = "UPDATE `absen_detail` SET `tanggal_absen`='"+getTanggal()+"',`jam_absen`='"+getWaktu()+"',`ket`='"+ff+"',`id_komputer`='"+data.id_komputer+"' WHERE id_absen='"+m+"' and nim_mhs='"+et_user.getText()+"'";
                    java.sql.Connection connn=(Connection)ip_form.configDB();
                    java.sql.PreparedStatement pstt=connn.prepareStatement(sql4);
                    pstt.execute();
                    
                    
                    
                    baris ++;
                    JOptionPane.showMessageDialog(null,"Berhasil Login");
                    
                  
                    pindahkemahasiswa();
                    
                }else {
                    JOptionPane.showMessageDialog(null,"Gagal Login");
                    et_user.setText("");
                    et_pass.setText("");
                }
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    private String muncul_waktu(String p){
        String kett = null;
        try
            {
            Connection c = ip_form.configDB();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM absen WHERE id_absen='"+p+"'";
            ResultSet r = s.executeQuery(sql);
                getWaktu();
                while(r.next())
                {
                    String waktu = r.getString("jam_absen");
                    String sub_jamDB = waktu.substring(0, 2);
                    String sub_menitDB = waktu.substring(3, 5);
                    
                    String sub_jamlp = formattedjam.substring(0, 2);
                    String sub_menitlp = formattedjam.substring(3, 5);
                    
                    Integer jmDB,mntDB,jm,mnt;
                    
                    jmDB = Integer.parseInt(sub_jamDB);
                    mntDB = Integer.parseInt(sub_menitDB);
                    
                    jm = Integer.parseInt(sub_jamlp);
                    mnt = Integer.parseInt(sub_menitlp);
                    
                    if (mntDB>mnt){
                        mnt+=60;
                        jm-=1;
                    }
                    
                    hasil_mnt = mnt-mntDB;
                    hasil_jm = jm-jmDB;
                    
                    if (hasil_mnt>5 && hasil_jm>0){
                        kett = "Alfa";
                    }else{
                        kett = "Hadir";
                    }
                    
                }
            }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"GAGAL Ambil Waktu ");
                }
        return kett;
    }
    
    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        akses();
    }//GEN-LAST:event_btn_loginMouseClicked

    private void cb_hakItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_hakItemStateChanged
        
    }//GEN-LAST:event_cb_hakItemStateChanged

    public void pindahkeasdos() {
        dash_asdos frm_dash_asdos = new dash_asdos(a);
        frm_dash_asdos.setVisible(true);
        this.setVisible(false);
    }
    
    public void pindahkemahasiswa() {
        dash_mahasiswa frm_dash_mhs = new dash_mahasiswa(a,id_absen,nim,id_komputer);
        frm_dash_mhs.setVisible(true);
        this.setVisible(false);
    }
    
    public void inputdatamahasiswa(){

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
            java.util.logging.Logger.getLogger(login_all.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_all.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_all.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_all.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_all().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_exit;
    public javax.swing.JLabel btn_login;
    private javax.swing.JComboBox<String> cb_hak;
    private javax.swing.JPasswordField et_pass;
    public javax.swing.JTextField et_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
