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

public class FinalizarCarrinho extends JFrame {

	private JPanel contentPane;
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
	public FinalizarCarrinho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 287);
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
		
		JLabel lblNewLabel_2 = new JLabel("Valor a ser pago: R$ 0,00");
		lblNewLabel_2.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblNewLabel_2.setBounds(45, 100, 186, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblPagamento = new JLabel("Pagamento:");
		lblPagamento.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblPagamento.setBounds(45, 138, 85, 27);
		contentPane.add(lblPagamento);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 136, 150, 30);
		contentPane.add(textField_1);
		
		JLabel lblTrocoR = new JLabel("Troco: R$ 0,00");
		lblTrocoR.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblTrocoR.setBounds(45, 176, 186, 27);
		contentPane.add(lblTrocoR);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(45, 62, 230, 30);
		contentPane.add(textField_2);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(45, 49, 40, 14);
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
		btnNewButton.setBounds(68, 214, 150, 30);
		contentPane.add(btnNewButton);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				HomeVendedor finalizar = new HomeVendedor();
				finalizar.setVisible(true);
				dispose();
			}
		});
		btnFinalizar.setBounds(228, 214, 150, 30);
		contentPane.add(btnFinalizar);
	}
}
