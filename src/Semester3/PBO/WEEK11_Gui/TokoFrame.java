package Semester3.PBO.WEEK11_Gui;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class TokoFrame extends JFrame{
    JPanel inputPanel;
    JLabel namaProdukLabel;
    JTextField namaProdukField;
    JLabel hargaProdukLabel;
    JTextField hargaProdukField;
    String[] columnNames = {"Nama Produk", "Harga"};
    DefaultTableModel produkTableModel;
    JTable produkTable;
    JScrollPane scrollPane;
    JButton simpanButton;
    
    public TokoFrame(){
        setTitle("Toko Application");
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        populateComponents();
        populateActionListener();
        
        setContentPane(inputPanel);
    }

    void populateComponents(){
        inputPanel = new JPanel();
        inputPanel.setBounds(10, 10, 400, 700);
        inputPanel.setLayout(null);
        add(inputPanel);

        namaProdukLabel = new JLabel("Nama Produk: ");
        inputPanel.add(namaProdukLabel);
        namaProdukLabel.setBounds(10, 10, 100, 25);

        namaProdukField = new JTextField();
        namaProdukField.setBounds(120, 10, 200, 25);
        inputPanel.add(namaProdukField);
        
        hargaProdukLabel = new JLabel("Harga: ");
        hargaProdukLabel.setBounds(10, 50, 100, 25);
        inputPanel.add(hargaProdukLabel);

        hargaProdukField = new JTextField();
        hargaProdukField.setBounds(120, 50, 200, 25);
        inputPanel.add(hargaProdukField);

        // untuk tabel
        produkTableModel = new DefaultTableModel(columnNames, 0);
        produkTable = new JTable(produkTableModel);
        scrollPane = new JScrollPane(produkTable);
        scrollPane.setBounds(420, 10, 900, 700);
        inputPanel.add(scrollPane);
        
        // untuk button
        simpanButton = new JButton("Simpan");
        simpanButton.setBounds(10, 90, 100, 25);
        inputPanel.add(simpanButton);
    }

    void populateActionListener(){
        simpanButton.addActionListener(e -> {
            String namaProduk = namaProdukField.getText();
            String hargaProduk = hargaProdukField.getText();
            produkTableModel.addRow(new Object[] { namaProduk, hargaProduk});
            JOptionPane.showMessageDialog(this, "Data berhasil di simpan:\nNama Produk: " + namaProduk + "\nHarga: " + hargaProduk);
        });
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        TokoFrame frame = new TokoFrame();
        frame.setVisible(true);
    }
}