package Semester3.PBO.WEEK11_Gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.regex.PatternSyntaxException;

public class TokoFrame extends JFrame {
    // Komponen Input
    JPanel inputPanel;
    JLabel namaProdukLabel;
    JTextField namaProdukField;
    JLabel hargaProdukLabel;
    JTextField hargaProdukField;
    
    // Komponen Tabel
    String[] columnNames = {"Nama Produk", "Harga"};
    DefaultTableModel produkTableModel;
    JTable produkTable;
    JScrollPane scrollPane;
    
    // Komponen Tombol
    JButton simpanButton;
    JButton hapusButton; // Fitur Hapus
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
        
        // Nama Produk
        namaProdukLabel = new JLabel("Nama Produk: ");
        namaProdukLabel.setBounds(10, 10, 100, 25);
        inputPanel.add(namaProdukLabel);

        namaProdukField = new JTextField();
        namaProdukField.setBounds(120, 10, 200, 25);
        inputPanel.add(namaProdukField);

        // Harga Produk
        hargaProdukLabel = new JLabel("Harga (Rp): ");
        hargaProdukLabel.setBounds(10, 50, 100, 25);
        inputPanel.add(hargaProdukLabel);

        hargaProdukField = new JTextField();
        hargaProdukField.setBounds(120, 50, 200, 25);
        inputPanel.add(hargaProdukField);

        // --- Tombol ---
        simpanButton = new JButton("Simpan");
        simpanButton.setBounds(10, 90, 100, 25);
        inputPanel.add(simpanButton);

        // Tombol Hapus (Ditambahkan kembali)
        hapusButton = new JButton("Hapus");
        hapusButton.setBounds(120, 90, 100, 25);
        inputPanel.add(hapusButton);

        // Tombol Reset Form
        resetButton = new JButton("Reset Form");
        resetButton.setBounds(10, 130, 150, 25); 
        inputPanel.add(resetButton);

        // --- Tabel dan ScrollPane (Kanan) ---
        produkTableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 1) { // Kolom Harga (index 1)
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
        scrollPane.setBounds(420, 50, 900, 660); 

        // --- Fitur Pencarian/Filter ---
        JLabel searchLabel = new JLabel("Cari Produk:");
        searchLabel.setBounds(420, 10, 100, 25);
        add(searchLabel);

        searchField = new JTextField();
        searchField.setBounds(520, 10, 300, 25);
        add(searchField);

        searchButton = new JButton("Cari");
        searchButton.setBounds(830, 10, 80, 25);
        add(searchButton);
        
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
            Double harga = (Double) produkTableModel.getValueAt(i, 1);
            if (harga != null) {
                total += harga;
            }
        }
        totalHargaField.setText(String.format("%,.2f", total));
    }
    
    // --- Metode Bantuan untuk Reset Form ---
    private void clearForm() {
        namaProdukField.setText("");
        hargaProdukField.setText("");
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
        String namaProduk = namaProdukField.getText().trim();
        String hargaProdukStr = hargaProdukField.getText().trim();
        
        if (namaProduk.isEmpty() || hargaProdukStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama Produk dan Harga tidak boleh kosong.", "Error Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Double hargaProduk = parseHarga(hargaProdukStr);
        if (hargaProduk == null) {
            return;
        }

        produkTableModel.addRow(new Object[] { namaProduk, hargaProduk });
        updateTotalHarga(); 
        
        JOptionPane.showMessageDialog(this, "Data berhasil di simpan:\nNama Produk: " + namaProduk + "\nHarga: " + hargaProduk);
        
        clearForm();
        namaProdukField.requestFocus(); // Auto-Focus
    }


    void populateActionListener() {
        // Aksi Tombol Simpan (Klik Mouse)
        simpanButton.addActionListener(e -> {
            performSimpanAction();
        });

        // KeyListener pada hargaProdukField (Enter untuk Simpan)
        hargaProdukField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    simpanButton.doClick(); 
                    e.consume(); 
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
        
        // --- Aksi Hapus (Fitur Hapus Data) ---
        hapusButton.addActionListener(e -> {
            int selectedRow = produkTable.getSelectedRow();
            if (selectedRow != -1) {
                // Mengambil indeks baris model (penting jika tabel sedang disortir/difilter)
                int modelRow = produkTable.convertRowIndexToModel(selectedRow); 
                
                int confirm = JOptionPane.showConfirmDialog(this, 
                    "Yakin ingin menghapus produk '" + produkTableModel.getValueAt(modelRow, 0) + "'?", 
                    "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
                
                if (confirm == JOptionPane.YES_OPTION) {
                    produkTableModel.removeRow(modelRow);
                    updateTotalHarga(); // Update total setelah dihapus
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        });
        
        // --- Aksi Reset Form ---
        resetButton.addActionListener(e -> {
            clearForm();
            namaProdukField.requestFocus();
        });

        // --- Aksi Cari/Filter ---
        searchButton.addActionListener(e -> {
            String searchText = searchField.getText();
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(produkTableModel);
            produkTable.setRowSorter(sorter);

            if (searchText.length() == 0) {
                sorter.setRowFilter(null);
            } else {
                try {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText)); 
                } catch (PatternSyntaxException pse) {
                    JOptionPane.showMessageDialog(this, "Pola pencarian tidak valid.", "Error Pencarian", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // --- Memastikan Filter Reset Saat Search Field Kosong ---
        searchField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {
                 if (searchField.getText().isEmpty()) {
                    searchButton.doClick(); 
                 }
            }
        });
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