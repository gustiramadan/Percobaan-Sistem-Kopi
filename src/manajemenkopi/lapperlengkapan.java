/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemenkopi;

import java.awt.Frame;
import javax.swing.JFrame;
import com.mysql.jdbc.Connection;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author fajarega
 */
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
public class lapperlengkapan extends javax.swing.JFrame {
Connection koneksi;
    /**
     * Creates new form lapperlengkapan
     */
    public lapperlengkapan() {
        initComponents();
        koneksi = (Connection) databaseconnection.getKoneksi("localhost","3306","root","","db_industri");
        showdata();
    }
    DefaultTableModel dtm;
    public void showdata()
    {
        String[] kolom = {"NO","id_perlengkapan","nama_perlengkapan","kategori","kondisi","harga","jumlah_barang","total_harga"};
        dtm=new DefaultTableModel(null,kolom);
        try
        {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM t_perlengkapan";
            ResultSet rs = stmt.executeQuery(query);
            int no=1;
            while(rs.next())
            {
                String id_perlengkapan = rs.getString("t_perlengkapan.id_perlengkapan");
                String nama_perlengkapan = rs.getString("t_perlengkapan.nama_perlengkapan");
                String kategori = rs.getString("t_perlengkapan.kategori");
                String kondisi = rs.getString("t_perlengkapan.kondisi");
                String harga = rs.getString("t_perlengkapan.harga");
                String jumlah_barang = rs.getString("t_perlengkapan.jumlah_barang");
                String total_harga = rs.getString("t_perlengkapan.total_harga");
                
                dtm.addRow(new String[]{no+"",id_perlengkapan,nama_perlengkapan,kategori,kondisi,harga,jumlah_barang,total_harga});
                no++;
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        tperlengkapan.setModel(dtm);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        bdrop = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tperlengkapan = new javax.swing.JTable();
        bprint = new javax.swing.JButton();
        bexport = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Fhome = new javax.swing.JMenuItem();
        Flogout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Fexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Dpegawai = new javax.swing.JMenuItem();
        Dpenggajian = new javax.swing.JMenuItem();
        Dperlengkapan = new javax.swing.JMenuItem();
        Dproduk = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Rpegawai = new javax.swing.JMenuItem();
        Rpenggajian = new javax.swing.JMenuItem();
        Rperlengkapan = new javax.swing.JMenuItem();
        Rproduk = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Hinfo = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Ateam = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jToolBar1.setRollover(true);

        bdrop.setBackground(new java.awt.Color(51, 204, 255));
        bdrop.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bdrop.setText("Cetak laporan");
        bdrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdropActionPerformed(evt);
            }
        });

        bedit.setBackground(new java.awt.Color(51, 204, 255));
        bedit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/1491299525_Edit.png"))); // NOI18N
        bedit.setText("Edit");
        bedit.setMaximumSize(new java.awt.Dimension(281, 137));
        bedit.setMinimumSize(new java.awt.Dimension(281, 137));
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        tperlengkapan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id_perlengkapan", "Nama_perlengkapan", "kategori", "kondisi", "harga", "jumlah_perlengkapan", "total_harga"
            }
        ));
        tperlengkapan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tperlengkapanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tperlengkapan);

        bprint.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bprint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/1491300084_Print.png"))); // NOI18N
        bprint.setText("Print");
        bprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprintActionPerformed(evt);
            }
        });

        bexport.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bexport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/1491299694_7.png"))); // NOI18N
        bexport.setText("Export");
        bexport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bexport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bprint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bdrop, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bedit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bexport, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bprint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bdrop)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jMenu1.setText("File");

        Fhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/konfigurasi_univ.png"))); // NOI18N
        Fhome.setText("Home");
        Fhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FhomeActionPerformed(evt);
            }
        });
        jMenu1.add(Fhome);

        Flogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/operator.png"))); // NOI18N
        Flogout.setText("Logout");
        Flogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlogoutActionPerformed(evt);
            }
        });
        jMenu1.add(Flogout);
        jMenu1.add(jSeparator1);

        Fexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/cross.png"))); // NOI18N
        Fexit.setText("Exit");
        Fexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FexitActionPerformed(evt);
            }
        });
        jMenu1.add(Fexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Form");

        Dpegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/file-edit-16x16.png"))); // NOI18N
        Dpegawai.setText("Data Pegawai");
        Dpegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DpegawaiActionPerformed(evt);
            }
        });
        jMenu2.add(Dpegawai);

        Dpenggajian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/file-edit-16x16.png"))); // NOI18N
        Dpenggajian.setText("Data Penggajian");
        Dpenggajian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DpenggajianActionPerformed(evt);
            }
        });
        jMenu2.add(Dpenggajian);

        Dperlengkapan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/file-edit-16x16.png"))); // NOI18N
        Dperlengkapan.setText("Data Perlengkapan");
        Dperlengkapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DperlengkapanActionPerformed(evt);
            }
        });
        jMenu2.add(Dperlengkapan);

        Dproduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/file-edit-16x16.png"))); // NOI18N
        Dproduk.setText("Data Produk");
        Dproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DprodukActionPerformed(evt);
            }
        });
        jMenu2.add(Dproduk);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Report");

        Rpegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/report.png"))); // NOI18N
        Rpegawai.setText("Pegawai");
        Rpegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RpegawaiActionPerformed(evt);
            }
        });
        jMenu3.add(Rpegawai);

        Rpenggajian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/report.png"))); // NOI18N
        Rpenggajian.setText("Penggajian");
        Rpenggajian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RpenggajianActionPerformed(evt);
            }
        });
        jMenu3.add(Rpenggajian);

        Rperlengkapan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/report.png"))); // NOI18N
        Rperlengkapan.setText("Perlengkapan");
        Rperlengkapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RperlengkapanActionPerformed(evt);
            }
        });
        jMenu3.add(Rperlengkapan);

        Rproduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/report.png"))); // NOI18N
        Rproduk.setText("Produk");
        Rproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RprodukActionPerformed(evt);
            }
        });
        jMenu3.add(Rproduk);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Help");

        Hinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/info_1.png"))); // NOI18N
        Hinfo.setText("Info");
        jMenu4.add(Hinfo);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("About");

        Ateam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/mutasipegawai.png"))); // NOI18N
        Ateam.setText("Team");
        Ateam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AteamActionPerformed(evt);
            }
        });
        jMenu5.add(Ateam);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FhomeActionPerformed
        // TODO add your handling code here:
        new Home().show();
        this.dispose();
    }//GEN-LAST:event_FhomeActionPerformed

    private void DperlengkapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DperlengkapanActionPerformed
        // TODO add your handling code here:
        new formperlengkapan().show();
        this.dispose();
    }//GEN-LAST:event_DperlengkapanActionPerformed

    private void RpenggajianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RpenggajianActionPerformed
        // TODO add your handling code here:
        new lapgaji().show();
        this.dispose();
    }//GEN-LAST:event_RpenggajianActionPerformed

    private void RperlengkapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RperlengkapanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RperlengkapanActionPerformed

    private void AteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AteamActionPerformed
        // TODO add your handling code here:
        new team().show();
        this.dispose();
    }//GEN-LAST:event_AteamActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void FlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlogoutActionPerformed
        // TODO add your handling code here:
        new login().show();
        this.dispose();
    }//GEN-LAST:event_FlogoutActionPerformed

    private void FexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FexitActionPerformed

    private void DprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DprodukActionPerformed
        // TODO add your handling code here:
        new formproduk().show();
        this.dispose();
    }//GEN-LAST:event_DprodukActionPerformed

    private void DpenggajianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DpenggajianActionPerformed
        // TODO add your handling code here:
        new formgaji().show();
        this.dispose();
    }//GEN-LAST:event_DpenggajianActionPerformed

    private void DpegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DpegawaiActionPerformed
        // TODO add your handling code here:
        new formkaryawan().show();
        this.dispose();
    }//GEN-LAST:event_DpegawaiActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
               //   String nik = tperlengkapan.getValueAt(baris, 1).toString();
    //    Manage tambahData = new Manage(this, true, "Edit",nis);
     //   tambahData.setVisible(true);
     new formperlengkapan().show();
        this.dispose();
    }//GEN-LAST:event_beditActionPerformed

    private void bexportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexportActionPerformed
        export();
    }//GEN-LAST:event_bexportActionPerformed

    private void bprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprintActionPerformed
               try {
    boolean complete = tperlengkapan.print();
    if (complete) 
    {
       System.out.print("Print Berhasil");
    } 
    else 
    {
        System.out.print("Print Gagal");
    }
} catch (PrinterException pe) {
    pe.printStackTrace();
}
    }//GEN-LAST:event_bprintActionPerformed

    private void bdropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdropActionPerformed
String reportSource = null;
        String reportDest = null;
        
        try{
            com.mysql.jdbc.Connection c = (com.mysql.jdbc.Connection) koneksi;
            reportSource = System.getProperty("user.dir") + "/laporan/Laporan_dataperlengkapan.jrxml";
            reportDest = System.getProperty("user.dir") + "/laporan/Laporan_datapererlengkapan.jasper";
            
            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,null,c);
            JasperExportManager.exportReportToHtmlFile(jasperPrint, reportDest);
            JasperViewer.viewReport(jasperPrint,false);
            
        }catch(Exception e){
            System.out.println(e);
        }       
    }//GEN-LAST:event_bdropActionPerformed

    private void tperlengkapanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tperlengkapanMouseClicked
        baris = tperlengkapan.getSelectedRow();
    }//GEN-LAST:event_tperlengkapanMouseClicked

    private void RprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RprodukActionPerformed
        // TODO add your handling code here:
        new lapproduk().show();
        this.dispose();
    }//GEN-LAST:event_RprodukActionPerformed

    private void RpegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RpegawaiActionPerformed
        // TODO add your handling code here:
        new lapkaryawan().show();
        this.dispose();
    }//GEN-LAST:event_RpegawaiActionPerformed
    int baris;

        private void export(){

        FileWriter fileWriter;

        JFileChooser chooser = new JFileChooser();

        chooser.setCurrentDirectory(new File("export_output/excel"));

        int retrival = chooser.showSaveDialog(null);

        if (retrival == JFileChooser.APPROVE_OPTION) {

            try{

                TableModel tModel = tperlengkapan.getModel();

                fileWriter = new FileWriter(new File(chooser.getSelectedFile() + ".xls"));           

            // write header

                for(int i = 0; i < tModel.getColumnCount(); i++){

                fileWriter.write(tModel.getColumnName(i).toUpperCase() + "\t");

            }

                fileWriter.write("\n");

            // write record

                for(int i=0; i < tModel.getRowCount(); i++) {

                for(int j=0; j < tModel.getColumnCount(); j++) {

                fileWriter.write(tModel.getValueAt(i,j).toString() + "\t");

            }

                fileWriter.write("\n");

            }

                fileWriter.close();

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, e);

            }

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
            java.util.logging.Logger.getLogger(lapperlengkapan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lapperlengkapan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lapperlengkapan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lapperlengkapan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lapperlengkapan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ateam;
    private javax.swing.JMenuItem Dpegawai;
    private javax.swing.JMenuItem Dpenggajian;
    private javax.swing.JMenuItem Dperlengkapan;
    private javax.swing.JMenuItem Dproduk;
    private javax.swing.JMenuItem Fexit;
    private javax.swing.JMenuItem Fhome;
    private javax.swing.JMenuItem Flogout;
    private javax.swing.JMenuItem Hinfo;
    private javax.swing.JMenuItem Rpegawai;
    private javax.swing.JMenuItem Rpenggajian;
    private javax.swing.JMenuItem Rperlengkapan;
    private javax.swing.JMenuItem Rproduk;
    private javax.swing.JButton bdrop;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bexport;
    private javax.swing.JButton bprint;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tperlengkapan;
    // End of variables declaration//GEN-END:variables
}
