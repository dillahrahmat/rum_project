///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package bagian_operator;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author R
// */
//public class NewClass {
//    
//    private void btn_buatMouseClicked(java.awt.event.MouseEvent evt) {                                      
//        // TODO add your handling code here:
//        String temp="";
//        String id_absen,id_lengkap;
//        String nim[];
//        int index=0;
//        try{
//            BufferedReader br = new BufferedReader (new FileReader(dir));
//            String line;
//            
//            while ((line=br.readLine())!=null){
//                String[] value = line .split(",");
//                if (temp==""){
//                    temp=value[2];
//                }else if (temp!=value[2]){
//                    id_absen=value[4]+value[2]+et_id_matkul.getText+et_ruang.getText;//2019ATI01L401
//                    for (int i=1;i<=16;i++){
//                        id_lengkap=id_absen+i;
//                        "insert into tb_absen value (id_lengkap)"
//                            for(int y=1;y<=index;y++){
//                                insert into tb_absen_detail value (id_lengkap,value[0])
//                            } 
//                    }
//                    nim[]="";
//                    index=0;
//
//                    nim[a]=value[0];
//                    index++;
//                }    
//                sql = "INSERT INTO matkul (id_matkul,nama_matkul,ruang_matkul,nim_mhs,nama_mhs,nim_asdos,nama_asdos,kelas_matkul,tahun_matkul) VALUES('"+et_id_matkul.getText()+"','"+et_matkul.getText()+"','"+et_ruang.getText()+"','"+value[0]+"','"+value[1]+"','"+value[2]+"','"+value[3]+"','"+value[4]+"','"+value[5]+"')";
//                java.sql.Connection con=(Connection)koneksi.configDB();
//                java.sql.PreparedStatement stmt = con.prepareStatement(sql);
//                stmt=con.prepareStatement(sql);
//                stmt.executeUpdate();
//            }
//            br.close();
//            System.out.println("Berhasil input");
//            JOptionPane.showMessageDialog(null,"Berhasil Simpan");
//        } catch (SQLException ex) {
//            Logger.getLogger(input_data_mhs.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println(sql);
//            JOptionPane.showMessageDialog(null,"Gagal Simpan");
//        } catch (IOException ex) {
//            Logger.getLogger(input_data_mhs.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }             
//    
//    public static void main(String[] args) {
//        String temp="";
//        String id_absen,id_lengkap;
//        String nim[];
//        int index=0;
//        while(){
//            if (temp==""){
//                temp=value[kelas];
//            }else if (temp!=String.value[kelas]){
//                id_absen=value[tahun]+value[kelas]+value[matkul]+value[ruang];
//                for (i=1;i<=16;i++){
//                    id_lengkap=id_absen+i;
//                    "insert into tb_absen value (id_lengkap)"
//                        for(y=1;y<=index;y++){
//                            insert into tb_absen_detail value (id_lengkap,nim[y])
//                        } 
//                }
//                nim[]="";
//                index=0;
//                
//                nim[a]=value[0];
//                index++;
//            }
//        }
//    }
//}
