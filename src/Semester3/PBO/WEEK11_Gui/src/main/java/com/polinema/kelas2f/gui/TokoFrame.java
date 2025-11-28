package com.polinema.kelas2f.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.regex.PatternSyntaxException;
import java.awt.event.ActionListener;

public class TokoFrame extends JFrame {
    // Komponen Input
    JPanel inputPanel;
    
    JLabel namaPelangganLabel;
    JTextField namaPelangganField;

    JLabel namaProdukLabel;
    JTextField namaProdukField;
    JLabel hargaProdukLabel;
    JTextField hargaProdukField;
    
    JLabel deskripsiLabel;
    JTextArea deskripsiArea;
    JScrollPane deskripsiScrollPane;
    
    JLabel pembayaranLabel;
    JComboBox<String> pembayaranComboBox;
    
    // Radio Button untuk Status Input
    JLabel statusLabel;
    JRadioButton tersediaRadio;
    JRadioButton tidakTersediaRadio;
    ButtonGroup statusGroup;

    // >>> KOMPONEN BARU: Filter Check Boxes
    JCheckBox filterTersedia;
    JCheckBox filterTidakTersedia;
    // <<< KOMPONEN BARU
    
    // Komponen Tabel
    String[] columnNames = {"Pelanggan", "Nama Produk", "Harga", "Deskripsi", "Pembayaran", "Status"};
    DefaultTableModel produkTableModel;
    JTable produkTable;
    JScrollPane scrollPane;
    
    // Komponen Tombol
    JButton simpanButton;
    JButton hapusButton; 
    JButton resetButton; 

    // Komponen Total Harga
    JLabel totalHargaLabel;
    JTextField totalHargaField;
    
    // Komponen Pencarian
    JTextField searchField;
    JButton searchButton;
    
    public TokoFrame() {
        setTitle("Toko Application");
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 

        populateComponents();
        populateActionListener();
        loadDataFromDatabase();

        add(inputPanel);
        add(scrollPane);
        add(totalHargaLabel);
        add(totalHargaField);
    }

    void populateComponents() {
        // --- Input Panel (Kiri) ---
        inputPanel = new JPanel();
        inputPanel.setBounds(10, 10, 400, 700);
        inputPanel.setLayout(null);
        
        // 1. Nama Pelanggan
        namaPelangganLabel = new JLabel("Nama Pelanggan: ");
        namaPelangganLabel.setBounds(10, 10, 110, 25);
        inputPanel.add(namaPelangganLabel);

        namaPelangganField = new JTextField();
        namaPelangganField.setBounds(120, 10, 200, 25);
        inputPanel.add(namaPelangganField);
        
        // 2. Nama Produk
        namaProdukLabel = new JLabel("Nama Produk: ");
        namaProdukLabel.setBounds(10, 50, 100, 25);
        inputPanel.add(namaProdukLabel);

        namaProdukField = new JTextField();
        namaProdukField.setBounds(120, 50, 200, 25);
        inputPanel.add(namaProdukField);

        // 3. Harga Produk
        hargaProdukLabel = new JLabel("Harga (Rp): ");
        hargaProdukLabel.setBounds(10, 90, 100, 25);
        inputPanel.add(hargaProdukLabel);

        hargaProdukField = new JTextField();
        hargaProdukField.setBounds(120, 90, 200, 25);
        inputPanel.add(hargaProdukField);
        
        // 4. Deskripsi (JTextArea)
        deskripsiLabel = new JLabel("Deskripsi: ");
        deskripsiLabel.setBounds(10, 130, 100, 25);
        inputPanel.add(deskripsiLabel);

        deskripsiArea = new JTextArea();
        deskripsiArea.setLineWrap(true); 
        deskripsiArea.setWrapStyleWord(true); 
        deskripsiScrollPane = new JScrollPane(deskripsiArea);
        deskripsiScrollPane.setBounds(120, 130, 200, 60); 
        inputPanel.add(deskripsiScrollPane);
        
        // 5. Pembayaran
        int pembayaranY = 200;
        pembayaranLabel = new JLabel("Pembayaran:");
        pembayaranLabel.setBounds(10, pembayaranY, 100, 25);
        inputPanel.add(pembayaranLabel);

        String[] opsiPembayaran = {"Tunai", "QRIS"};
        pembayaranComboBox = new JComboBox<>(opsiPembayaran);
        pembayaranComboBox.setBounds(120, pembayaranY, 200, 25);
        inputPanel.add(pembayaranComboBox);
        
        // 6. Status (Radio Button Input)
        int statusY = 240;
        statusLabel = new JLabel("Status:");
        statusLabel.setBounds(10, statusY, 100, 25);
        inputPanel.add(statusLabel);

        tersediaRadio = new JRadioButton("Tersedia", true); 
        tersediaRadio.setBounds(120, statusY, 80, 25);
        inputPanel.add(tersediaRadio);

        tidakTersediaRadio = new JRadioButton("Tidak Tersedia");
        tidakTersediaRadio.setBounds(200, statusY, 120, 25);
        inputPanel.add(tidakTersediaRadio);

        statusGroup = new ButtonGroup();
        statusGroup.add(tersediaRadio);
        statusGroup.add(tidakTersediaRadio);
        
        // --- Tombol (Posisi Y disesuaikan) ---
        int buttonY = 280; 

        simpanButton = new JButton("Simpan");
        simpanButton.setBounds(10, buttonY, 100, 25);
        inputPanel.add(simpanButton);

        hapusButton = new JButton("Hapus");
        hapusButton.setBounds(120, buttonY, 100, 25);
        inputPanel.add(hapusButton);

        resetButton = new JButton("Reset Form");
        resetButton.setBounds(10, buttonY + 40, 150, 25); 
        inputPanel.add(resetButton);

        // --- Tabel dan ScrollPane (Kanan) ---
        produkTableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 2) { 
                    return Double.class; 
                }
                return String.class;
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };
        produkTable = new JTable(produkTableModel);
        scrollPane = new JScrollPane(produkTable);
        scrollPane.setBounds(420, 80, 900, 630); // Posisi Y lebih rendah untuk Check Boxes

        // --- Fitur Pencarian/Filter (di atas tabel) ---
        JLabel searchLabel = new JLabel("Cari:");
        searchLabel.setBounds(420, 10, 40, 25);
        add(searchLabel);

        searchField = new JTextField();
        searchField.setBounds(460, 10, 200, 25);
        add(searchField);

        searchButton = new JButton("Cari");
        searchButton.setBounds(670, 10, 80, 25);
        add(searchButton);
        
        // >>> KOMPONEN BARU: Filter Check Boxes
        JLabel filterLabel = new JLabel("Filter Status:");
        filterLabel.setBounds(420, 45, 80, 25);
        add(filterLabel);
        
        filterTersedia = new JCheckBox("Tersedia", true); // Default: Terpilih
        filterTersedia.setBounds(500, 45, 80, 25);
        add(filterTersedia);

        filterTidakTersedia = new JCheckBox("Tidak Tersedia", true); // Default: Terpilih
        filterTidakTersedia.setBounds(580, 45, 120, 25);
        add(filterTidakTersedia);
        // <<< KOMPONEN BARU
        
        // --- Fitur Total Harga ---
        totalHargaLabel = new JLabel("TOTAL KESELURUHAN:");
        totalHargaLabel.setBounds(1100, 720, 150, 25);

        totalHargaField = new JTextField();
        totalHargaField.setBounds(1250, 720, 80, 25);
        totalHargaField.setEditable(false);
        
        updateTotalHarga();
    }

    // --- Metode Bantuan untuk Total Harga ---
    private void updateTotalHarga() {
        double total = 0.0;
        int rowCount = produkTableModel.getRowCount();
        
        for (int i = 0; i < rowCount; i++) {
            // Kolom Harga ada di indeks 2
            Double harga = (Double) produkTableModel.getValueAt(i, 2); 
            if (harga != null) {
                total += harga;
            }
        }
        totalHargaField.setText(String.format("%,.2f", total));
    }
    
    // --- Metode Bantuan untuk Reset Form ---
    private void clearForm() {
        namaPelangganField.setText("");
        namaProdukField.setText("");
        hargaProdukField.setText("");
        deskripsiArea.setText(""); 
        pembayaranComboBox.setSelectedIndex(0); 
        tersediaRadio.setSelected(true); 
    }
    
    // --- Metode Bantuan untuk Validasi Harga ---
    private Double parseHarga(String hargaStr) {
        try {
            return Double.parseDouble(hargaStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Harga harus berupa angka yang valid.", "Error Input", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    // --- Metode Bantuan untuk Logika Simpan ---
    private void performSimpanAction() {
        // 1. Ambil nilai dari input
        String namaPelanggan = namaPelangganField.getText().trim();
        String namaProduk = namaProdukField.getText().trim();
        String hargaProdukStr = hargaProdukField.getText().trim();
        
        String deskripsi = deskripsiArea.getText(); 
        String pembayaran = (String) pembayaranComboBox.getSelectedItem(); 
        String status = tersediaRadio.isSelected() ? "Tersedia" : "Tidak Tersedia";
        
        // 2. Validasi input kosong
        if (namaPelanggan.isEmpty() || namaProduk.isEmpty() || hargaProdukStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama Pelanggan, Nama Produk, dan Harga tidak boleh kosong.", "Error Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 3. Validasi angka harga
        Double hargaProduk = parseHarga(hargaProdukStr);
        if (hargaProduk == null) {
            return;
        }

        // --- KODE DUPLIKAT YANG LAMA SAYA HAPUS DI SINI ---

        // 4. Simpan ke Database Dulu
        boolean isSaved = insertDataToDatabase(namaPelanggan, namaProduk, hargaProduk, deskripsi, pembayaran, status);

        // 5. Jika sukses masuk DB, baru masukkan ke Tabel GUI
        if (isSaved) {
            produkTableModel.addRow(new Object[] { 
                namaPelanggan, namaProduk, hargaProduk, deskripsi, pembayaran, status 
            });
            updateTotalHarga(); 
            
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            
            clearForm();
            namaPelangganField.requestFocus(); 
            applyFilters(); 
        }
    }
    
    // --- Metode Bantuan untuk Menerapkan Filter ---
    private void applyFilters() {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(produkTableModel);
        produkTable.setRowSorter(sorter);

        // Filter status (Kolom Status ada di indeks 5)
        int statusColumnIndex = 5;
        
        boolean showTersedia = filterTersedia.isSelected();
        boolean showTidakTersedia = filterTidakTersedia.isSelected();
        
        String searchText = searchField.getText();

        if (!showTersedia && !showTidakTersedia) {
            // Jika kedua checkbox tidak dipilih, tampilkan kosong (atau tampilkan semua jika diinginkan)
            sorter.setRowFilter(RowFilter.regexFilter("a^")); // Filter yang selalu false
        } else {
            // Buat regex filter untuk status
            String statusRegex = "";
            if (showTersedia) {
                statusRegex += "Tersedia";
            }
            if (showTidakTersedia) {
                if (!statusRegex.isEmpty()) statusRegex += "|";
                statusRegex += "Tidak Tersedia";
            }
            
            // Buat compound filter untuk menggabungkan Status dan Pencarian
            try {
                RowFilter<Object, Object> statusFilter = RowFilter.regexFilter(statusRegex, statusColumnIndex);
                
                RowFilter<Object, Object> searchFilter = null;
                if (!searchText.isEmpty()) {
                    // searchFilter = RowFilter.regexFilter("(?i)" + Pattern.quote(searchText));
                }

                if (searchFilter != null) {
                    sorter.setRowFilter(RowFilter.andFilter(java.util.Arrays.asList(statusFilter, searchFilter)));
                } else {
                    sorter.setRowFilter(statusFilter);
                }

            } catch (PatternSyntaxException pse) {
                JOptionPane.showMessageDialog(this, "Pola pencarian tidak valid.", "Error Pencarian", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    void populateActionListener() {
        // Aksi Tombol Simpan (Klik Mouse)
        simpanButton.addActionListener(e -> {
            performSimpanAction();
        });

        // KeyListener pada Deskripsi Area (Enter untuk Simpan)
        deskripsiArea.addKeyListener(new KeyListener() { 
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    e.consume(); 
                    simpanButton.doClick(); 
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
        
        // --- Aksi Hapus ---
        hapusButton.addActionListener(e -> {
            int selectedRow = produkTable.getSelectedRow();
            if (selectedRow != -1) {
                int modelRow = produkTable.convertRowIndexToModel(selectedRow); 
                
                int confirm = JOptionPane.showConfirmDialog(this, 
                    "Yakin ingin menghapus transaksi untuk pelanggan '" + produkTableModel.getValueAt(modelRow, 0) + "'?", 
                    "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
                
                if (confirm == JOptionPane.YES_OPTION) {
                    produkTableModel.removeRow(modelRow);
                    updateTotalHarga();
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
                    applyFilters(); // Terapkan filter setelah hapus
                }
            } else {
                JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        });
        
        // --- Aksi Reset Form ---
        resetButton.addActionListener(e -> {
            clearForm();
            namaPelangganField.requestFocus();
        });

        // --- Aksi Cari/Filter (Tombol Cari) ---
        searchButton.addActionListener(e -> {
            applyFilters();
        });
        
        // --- Aksi Filter Check Boxes ---
        ActionListener filterListener = e -> {
            applyFilters();
        };
        filterTersedia.addActionListener(filterListener);
        filterTidakTersedia.addActionListener(filterListener);
        
        // --- Memastikan Filter Reset Saat Search Field Kosong ---
        searchField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {
                 if (searchField.getText().isEmpty()) {
                    applyFilters(); // Terapkan filter segera
                 }
            }
        });
    }
    
    // Tambahkan import java.sql.PreparedStatement;

    private boolean insertDataToDatabase(String namaPelanggan, String namaProduk, Double harga, String deskripsi, String pembayaran, String status) {
        String query = "INSERT INTO product (nama_pelanggan, nama_produk, harga, deskripsi, pembayaran, status) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
            java.sql.PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setString(1, namaPelanggan);
            pstmt.setString(2, namaProduk);
            pstmt.setDouble(3, harga);
            pstmt.setString(4, deskripsi);
            pstmt.setString(5, pembayaran);
            pstmt.setString(6, status);
            
            pstmt.executeUpdate();
            return true; // Berhasil simpan
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal simpan ke DB: " + e.getMessage());
            return false; // Gagal
        }
    }
    
    private void loadDataFromDatabase(){
        String query = "SELECT nama_pelanggan, nama_produk, harga, deskripsi, pembayaran , status FROM product";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String namaPelanggan = rs.getString("nama_pelanggan");
                String namaProduk = rs.getString("nama_produk");
                Double harga = rs.getDouble("harga");
                String deskripsi = rs.getString("deskripsi");
                String pembayaran = rs.getString("pembayaran");
                String status = rs.getString("status");

                produkTableModel.addRow(new Object[] {
                    namaPelanggan, namaProduk, harga, deskripsi, pembayaran, status
                });
            }
            updateTotalHarga();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error Database", JOptionPane.ERROR_MESSAGE);
        }
    }


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        SwingUtilities.invokeLater(() -> {
            TokoFrame frame = new TokoFrame();
            frame.setVisible(true);
        });
    }
}