package finalexam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jevonopel
 */
public class ComicZone extends javax.swing.JFrame {
    final List<Books> bookListName = new ArrayList<>();
    private Books selectedBook;

    public ComicZone() {
        initComponents();
        bookListName.add(new Books("", "", 0));
        KodeBuku.addItem("--Pilih Kode--");
        txtGrandTotal.setText("0.0");
        disableInput();
        getDateNow();
        readAllBooks();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGrandTotal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        IdSewa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IdCustomer = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        IdKaryawan = new javax.swing.JTextField();
        btnViewKaryawanName = new javax.swing.JButton();
        btnViewCustomerName = new javax.swing.JButton();
        TextBoxViewCustomerName = new javax.swing.JTextField();
        TextBoxViewKaryawanName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        KodeBuku = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NamaBuku = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tglPeminjaman = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tglPengembalian = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Harga = new javax.swing.JTextField();
        btnTambahItem = new javax.swing.JButton();
        btnHapusItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDetailOrder = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Bayar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Kembalian = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 300));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel1.setText("Rental");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setText("COMIC ZONE");

        txtGrandTotal.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtGrandTotal.setText("txtGrandTotal");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setText("ID SEWA");

        jLabel4.setText("ID CUSTOMER");

        jLabel5.setText("ID KARYAWAN");

        btnViewKaryawanName.setText("View Karyawan Name");
        btnViewKaryawanName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewKaryawanNameActionPerformed(evt);
            }
        });

        btnViewCustomerName.setText("View Customer Name");
        btnViewCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(65, 65, 65)
                        .addComponent(IdKaryawan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(65, 65, 65))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(100, 100, 100)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewKaryawanName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TextBoxViewKaryawanName)
                    .addComponent(TextBoxViewCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IdSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TextBoxViewCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextBoxViewKaryawanName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(IdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewCustomerName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(IdKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewKaryawanName))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(249, 249, 249));

        KodeBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KodeBukuActionPerformed(evt);
            }
        });

        jLabel6.setText("Kode Buku");

        jLabel7.setText("Nama Buku");

        jLabel8.setText("tgl peminjaman");

        jLabel9.setText("tgl pengembalian");

        jLabel10.setText("Harga");

        btnTambahItem.setText("Tambah Item");
        btnTambahItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahItemActionPerformed(evt);
            }
        });

        btnHapusItem.setText("Hapus Item");
        btnHapusItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(KodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(NamaBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(tglPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(tglPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnTambahItem)
                .addGap(8, 8, 8)
                .addComponent(btnHapusItem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnTambahItem)
                    .addComponent(btnHapusItem)
                    .addComponent(Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamaBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tableDetailOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Buku", "Nama Buku", "tgl peminjam", "tgl pengembalian", "harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDetailOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDetailOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDetailOrder);

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel11.setText("Detail Order");

        jLabel12.setText("Bayar");

        Bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BayarKeyTyped(evt);
            }
        });

        jLabel13.setText("Kembalian");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGrandTotal)
                    .addComponent(jLabel1))
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                            .addGap(312, 312, 312)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGrandTotal)
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerNameActionPerformed
        try {
            String sqlQuery = "SELECT * FROM `Customer` WHERE Id_customer = '"+IdCustomer.getText()+"'";
            Connection conn = DatabaseConnection.connectionDB();
            PreparedStatement prepare = conn.prepareStatement(sqlQuery);
            ResultSet result = prepare.executeQuery();
            
            if(result.next()){
                TextBoxViewCustomerName.setText(result.getString("Name_customer"));
            } else {
                TextBoxViewCustomerName.setText("");
                showDialog("kode customer tidak di temukan");
            }
        } catch (SQLException e){
            TextBoxViewCustomerName.setText("");
            showDialog("Gagal mengambil data customer " + e.getMessage());
        }
    }//GEN-LAST:event_btnViewCustomerNameActionPerformed

    private void btnViewKaryawanNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewKaryawanNameActionPerformed
        try {
            String sqlQuery = "SELECT * FROM `karyawan` WHERE Id_karyawan = '"+IdKaryawan.getText()+"'";
            Connection conn = DatabaseConnection.connectionDB();
            PreparedStatement prepare = conn.prepareStatement(sqlQuery);
            ResultSet result = prepare.executeQuery();
            
            if(result.next()){
                TextBoxViewKaryawanName.setText(result.getString("Nama_karyawan"));
            } else {
                TextBoxViewKaryawanName.setText("");
                showDialog("kode karyawan tidak di temukan");
            }
        } catch (SQLException e){
            TextBoxViewKaryawanName.setText("");
            showDialog("Gagal mengambil data karyawan " + e.getMessage());
        }
    }//GEN-LAST:event_btnViewKaryawanNameActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void KodeBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KodeBukuActionPerformed
        if(!bookListName.isEmpty()){
            selectedBook = bookListName.get(KodeBuku.getSelectedIndex());
            NamaBuku.setText(selectedBook.getNama_buku());
            
            if(!tglPengembalian.getText().isEmpty() && countBetweenDateString(tglPeminjaman.getText(), tglPengembalian.getText()) > 0){
                int totalPrice = countBetweenDateString(tglPeminjaman.getText(), tglPengembalian.getText()) * selectedBook.getHarga();
                Harga.setText(String.valueOf(totalPrice));
            }
        }
    }//GEN-LAST:event_KodeBukuActionPerformed

    private void btnTambahItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahItemActionPerformed
        if(selectedBook.getId_books().isEmpty()){
            showDialog("Harap pilih kode buku");
        } else if(tglPengembalian.getText().isEmpty()){
            showDialog("Harap isi tanggal pengembalian");
        } else if(countBetweenDateString(tglPeminjaman.getText(), tglPengembalian.getText()) < 0){
            showDialog("Tanggal pengembalian tidak valid");
        } else {
            int totalPrice = countBetweenDateString(tglPeminjaman.getText(), tglPengembalian.getText()) * selectedBook.getHarga();
            Harga.setText(String.valueOf(totalPrice));
            addDataToTableContent();
            
            KodeBuku.setSelectedIndex(0);
            tglPengembalian.setText("");
        }
    }//GEN-LAST:event_btnTambahItemActionPerformed

    private void tableDetailOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDetailOrderMouseClicked
        DefaultTableModel model = (DefaultTableModel) tableDetailOrder.getModel();
        
        KodeBuku.setSelectedItem(model.getValueAt(tableDetailOrder.getSelectedRow(), 0));
        NamaBuku.setText(String.valueOf(model.getValueAt(tableDetailOrder.getSelectedRow(), 1)));
        tglPeminjaman.setText(String.valueOf(model.getValueAt(tableDetailOrder.getSelectedRow(), 2)));
        tglPengembalian.setText(String.valueOf(model.getValueAt(tableDetailOrder.getSelectedRow(), 3)));
        Harga.setText(String.valueOf(model.getValueAt(tableDetailOrder.getSelectedRow(), 4)));
    }//GEN-LAST:event_tableDetailOrderMouseClicked

    private void btnHapusItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusItemActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableDetailOrder.getModel();
        
        if(tableDetailOrder.getSelectedRowCount() == 1){
            KodeBuku.setSelectedIndex(0);
            tglPengembalian.setText("");
            model.removeRow(tableDetailOrder.getSelectedRow());
            countTotalRent();
        } else if(tableDetailOrder.getRowCount() == 0){
            showDialog("Table masih kosong");
        } else {
            showDialog("Hanya bisa satu baris");
        }
        
    }//GEN-LAST:event_btnHapusItemActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if(IdSewa.getText().isEmpty()){
            showDialog("Masukan Id Sewa");
        } else if(IdCustomer.getText().isEmpty()){
            showDialog("Masukan Id Customer");
        } else if(IdKaryawan.getText().isEmpty()){
            showDialog("Masukan Id Karyawan");
        } else if(tableDetailOrder.getRowCount() == 0){
            showDialog("Detail Order Masih Kosong");
        } else if(Bayar.getText().isEmpty()){
            showDialog("kurang bayar!!!!!");
        } else {
            int paymentRetrun = Integer.valueOf(Bayar.getText()) - Integer.valueOf(txtGrandTotal.getText());
            
            if(paymentRetrun < 0) showDialog("kurang bayar!!!!!");
            else addTransaction();
        }  
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void BayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BayarKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
        
        Bayar.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {countPaymentRetrun();}

            @Override
            public void removeUpdate(DocumentEvent e) {countPaymentRetrun();}

            @Override
            public void changedUpdate(DocumentEvent e) {countPaymentRetrun();}
        });
    }//GEN-LAST:event_BayarKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComicZone().setVisible(true);
            }
        });
    }
    
    private void addTransaction(){
          String idSewa = IdSewa.getText();
          String idKaryawan = IdKaryawan.getText();
          String idCustomer = IdCustomer.getText();
          int totalPayment = Integer.valueOf(Bayar.getText());
            
        // INSERT VALUE IN RENT TABLE
        try { 
            String sqlQueryRent = "INSERT INTO `rent` "
                    + "(`Id_rent`, `Id_karyawan`, `Id_customer`, `total_payment`) "
                    + "VALUES ('"+idSewa+"', '"+idKaryawan+"', '"+idCustomer+"','"+totalPayment+"')";
            Connection conn = DatabaseConnection.connectionDB();
            PreparedStatement prepareRent = conn.prepareStatement(sqlQueryRent);
            prepareRent.execute();           
        } catch (SQLException e){
            System.out.println("Gagal Menambah Data " + e.getMessage());
            showDialog("Gagal Menambah Data " + e.getMessage());
        }
        
         // INSERT VALUE IN BOOKS_RENT TABLE
        try {
            Connection conn = DatabaseConnection.connectionDB();
            for(int i = 0; i < tableDetailOrder.getRowCount(); i++){
                DefaultTableModel model = (DefaultTableModel) tableDetailOrder.getModel();
                 
                String sqlQueryBookRent = "INSERT INTO `books_rent` "
                    + "(`Id_rent`, `Id_books`, `tgl_peminjaman`, `tgl_pengembalian`, `harga`) "
                    + "VALUES ('"+idSewa+"', '"+model.getValueAt(i, 0)+"', '"+model.getValueAt(i, 2)+"',"
                    + "'"+model.getValueAt(i, 3)+"', '"+model.getValueAt(i, 4)+"')";
                PreparedStatement prepareRent = conn.prepareStatement(sqlQueryBookRent);
                prepareRent.execute();
            }
            showDialog("Berhasil menambahkan data ");
            clearAllForm();
        } catch (SQLException e){
            System.out.println("Gagal Menambah Data " + e.getMessage());
            showDialog("Gagal Menambah Data " + e.getMessage());
        }
    }
     
    private void readAllBooks(){
        try {
            String sqlQuery = "SELECT * FROM `books`";
            Connection conn = DatabaseConnection.connectionDB();
            PreparedStatement prepare = conn.prepareStatement(sqlQuery);
            ResultSet result = prepare.executeQuery();
            
            while(result.next()){
               KodeBuku.addItem(result.getString("Id_books"));
               bookListName.add(new Books(
                       result.getString("Id_books"), 
                       result.getString("Nama_buku"), 
                       result.getInt("Harga")));
            }    
        } catch (SQLException e){
            showDialog("Gagal mengambil data Buku " + e.getMessage());
        }
    }
    

    private void showDialog(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
    private void addDataToTableContent(){
        DefaultTableModel model = (DefaultTableModel) tableDetailOrder.getModel();
        model.addRow(new Object[]{
            selectedBook.getId_books(),
            selectedBook.getNama_buku(),
            tglPeminjaman.getText(),
            tglPengembalian.getText(),
            Integer.valueOf(Harga.getText())
        });
        
        countTotalRent();
    }
    
    private int countBetweenDateString(String borrowDateStr, String retrunDateStr){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date borrowDate = dateFormat.parse(borrowDateStr);
            Date retrunDate = dateFormat.parse(retrunDateStr);
            long countDate = retrunDate.getTime() - borrowDate.getTime();
            return (int) TimeUnit.DAYS.convert(countDate, TimeUnit.MILLISECONDS);
        } catch (ParseException ex) {
            showDialog("Harap menggunakan format 'dd-MM-yyyy'");
        }
        return 0;
    }
    
    private void getDateNow(){
        Date date = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        tglPeminjaman.setText(s.format(date));
    }
    
    private void disableInput(){
        Harga.setEditable(false);
        NamaBuku.setEditable(false);
        Kembalian.setEditable(false);
        tglPeminjaman.setEditable(false);
        TextBoxViewCustomerName.setEditable(false);
        TextBoxViewKaryawanName.setEditable(false);
        TextBoxViewKaryawanName.setEditable(false);
    }
    
    private void countTotalRent(){
        int totalRow = tableDetailOrder.getRowCount();
        int totalAll = 0;
        for (int i = 0; i < totalRow; i++) {
            totalAll = totalAll + Integer.valueOf(tableDetailOrder.getValueAt(i, 4).toString());
        }
        
        txtGrandTotal.setText(String.valueOf(totalAll));
    }
       
    private void countPaymentRetrun(){
        int paymentRetrun = 0;
        if(!Bayar.getText().isEmpty()){
            paymentRetrun = Integer.valueOf(Bayar.getText()) - Integer.valueOf(txtGrandTotal.getText());
            if(paymentRetrun < 0) Kembalian.setText("");  
            else Kembalian.setText(String.valueOf(paymentRetrun));   
        } else {
            Kembalian.setText(""); 
        }
    }
    
    private void clearAllForm(){
        DefaultTableModel model = (DefaultTableModel) tableDetailOrder.getModel();
        
        IdSewa.setText("");
        IdCustomer.setText("");
        TextBoxViewCustomerName.setText("");
        TextBoxViewKaryawanName.setText("");
        IdKaryawan.setText("");
        KodeBuku.setSelectedIndex(0);
        tglPengembalian.setText("");
        countTotalRent();
        
        while(model.getRowCount()>0){
            model.removeRow(0);
        }
        Bayar.setText("");
        Kembalian.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bayar;
    private javax.swing.JTextField Harga;
    private javax.swing.JTextField IdCustomer;
    private javax.swing.JTextField IdKaryawan;
    private javax.swing.JTextField IdSewa;
    private javax.swing.JTextField Kembalian;
    private javax.swing.JComboBox<String> KodeBuku;
    private javax.swing.JTextField NamaBuku;
    private javax.swing.JTextField TextBoxViewCustomerName;
    private javax.swing.JTextField TextBoxViewKaryawanName;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHapusItem;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahItem;
    private javax.swing.JButton btnViewCustomerName;
    private javax.swing.JButton btnViewKaryawanName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDetailOrder;
    private javax.swing.JTextField tglPeminjaman;
    private javax.swing.JTextField tglPengembalian;
    private javax.swing.JLabel txtGrandTotal;
    // End of variables declaration//GEN-END:variables
}
