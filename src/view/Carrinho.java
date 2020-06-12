package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import view.HomeVendedor;
import view.FinalizarCarrinho;

import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Carrinho extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarProduto frame = new BuscarProduto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Carrinho() {
		setTitle("Buscar Produto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] columns = new String[] {
			"Id", "Nome", "Preço", "Descrição"
		};
		Object[][] data = new Object[][] {
			{1, "Gtx 1080", 2500.0, "6gb, pci express" },
		    {2, "Gt 1030", 9999.0, "2gb, ddr4" },
		    {3, "Gtx 1050", 2000.0, "5gb, ddr5, pci express" },
		    {1, "Gtx 2080", 2500.0, "Lider de mercado" },
		};
		
		Object[][] data2 = new Object[][] {
			{1, "Roteador", 500.0, "4 antenas, 400mbps" },
		    {2, "Gabinete", 250.0, "Cor: preto" },
		    {3, "Monitor", 1500.0, "Full hd, 24'" },
		    {1, "Teclado", 450.0, "Mecânico, RGB" },
		};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 522, 113);
		contentPane.add(scrollPane);
		
		JTable table_1 = new JTable(data, columns);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setEnabled(false);
		scrollPane.setViewportView(table_1);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 410, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setBounds(430, 11, 102, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				HomeVendedor voltar = new HomeVendedor();
				voltar.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 349, 522, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 198, 522, 113);
		contentPane.add(scrollPane_1);
		
		JTable table_2 = new JTable(data2, columns);
		scrollPane_1.setViewportView(table_2);
		table_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_2.setEnabled(false);
		
		JButton btnNewButton_2 = new JButton("Adicionar");
		btnNewButton_2.setBounds(10, 166, 522, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			FinalizarCarrinho finalizar = new FinalizarCarrinho();
				finalizar.setVisible(true);
				dispose();
			}
		});
		btnFinalizar.setBounds(10, 322, 522, 23);
		contentPane.add(btnFinalizar);
	}
}
