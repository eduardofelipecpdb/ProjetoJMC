package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import view.HomeVendedor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class RegistrarVenda extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarVenda frame = new RegistrarVenda();
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
	public RegistrarVenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBounds(0, 0, 450, 300);
		int height = contentPane.getHeight();
		int width = contentPane.getWidth();
		
		JLabel lblNewLabel = new JLabel("REGISTRAR VENDA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblNewLabel.setBounds(width / 2 - 85 , 11, 160, 27);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(45, 57, 230, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setBounds(width / 2 - 180, 44, 40, 14);
		contentPane.add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(287, 57, 67, 30);
		contentPane.add(spinner);
		
		JLabel lblQtd = new JLabel("Qtd.");
		lblQtd.setBounds(287, 43, 40, 14);
		contentPane.add(lblQtd);
		
		JLabel lblNewLabel_2 = new JLabel("Valor a ser pago: R$ 0,00");
		lblNewLabel_2.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblNewLabel_2.setBounds(45, 140, 186, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblPagamento = new JLabel("Pagamento:");
		lblPagamento.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblPagamento.setBounds(45, 178, 85, 27);
		contentPane.add(lblPagamento);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 176, 150, 30);
		contentPane.add(textField_1);
		
		JLabel lblTrocoR = new JLabel("Troco: R$ 0,00");
		lblTrocoR.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblTrocoR.setBounds(45, 216, 186, 27);
		contentPane.add(lblTrocoR);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(45, 102, 230, 30);
		contentPane.add(textField_2);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(45, 89, 40, 14);
		contentPane.add(lblCliente);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				HomeVendedor cancelar = new HomeVendedor();
				cancelar.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(68, 254, 150, 30);
		contentPane.add(btnNewButton);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(228, 254, 150, 30);
		contentPane.add(btnFinalizar);
	}
}
