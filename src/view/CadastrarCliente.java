package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import view.HomeVendedor;
import java.awt.Choice;
import classes.Cliente;

public class CadastrarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblContato;
	private JTextField textField_2;
	private JLabel lblCpf;
	private JButton btnNewButton;
	private JButton btnVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCliente frame = new CadastrarCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CadastrarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBounds(0, 0, 450, 300);
		int height = contentPane.getHeight();
		int width = contentPane.getWidth();
		
		JLabel lblNewLabel = new JLabel("CADASTRAR CLIENTE");
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblNewLabel.setBounds(width / 2 - 86, 0, 162, 46);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(45, 57, 350, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(width / 2 - 180, 43, 40, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(45, 109, 350, 30);
		contentPane.add(textField_1);
		
		lblContato = new JLabel("Contato");
		lblContato.setBounds(45, 95, 55, 14);
		contentPane.add(lblContato);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(45, 161, 209, 22);
		contentPane.add(textField_2);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setBounds(45, 148, 30, 14);
		contentPane.add(lblCpf);
		
		btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(73, 202, 129, 36);
		contentPane.add(btnNewButton);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				HomeVendedor voltar = new HomeVendedor();
				voltar.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(238, 202, 129, 36);
		contentPane.add(btnVoltar);
		
		Choice choice = new Choice();
		choice.setBounds(283, 161, 112, 30);
		choice.add("Tipo do cliente");
		choice.add("Simples");
		choice.add("Fidelidade");
		choice.add("Atacadista");
		choice.add("Premium");
		contentPane.add(choice);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Cliente cadastrando = new Cliente();
				cadastrando.setNome(textField.getText().toString());
				cadastrando.setCpf(Integer.parseInt(textField_2.getText().toString()));
				cadastrando.setContato(textField_1.getText().toString());
				cadastrando.setStatus(choice.getSelectedItem());
				
				//GRAVAÇÃO NO BANCO DE DADOS
				
				HomeVendedor salvou = new HomeVendedor();
				salvou.setVisible(true);
				dispose();
			}
		});
	}
}