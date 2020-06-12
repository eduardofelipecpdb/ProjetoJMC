package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import view.CadastrarCliente;
import view.Login;
import view.BuscarProduto;
import view.RegistrarVenda;
import view.Carrinho;
import classes.Cliente;
import classes.Produto;


public class HomeVendedor extends JFrame {
	
	public interface java {

	}
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeVendedor frame = new HomeVendedor();
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
	
	public HomeVendedor() {
		
		setTitle("Home Vendedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBounds(0, 0, 450, 300);
		int height = contentPane.getHeight();
		int width = contentPane.getWidth();
		
		JLabel lblNewLabel = new JLabel("HOME VENDEDOR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblNewLabel.setBounds(width / 2 - 75 , 11, 139, 38);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Registrar Venda");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				RegistrarVenda sair = new RegistrarVenda();
				sair.setVisible(true);
				dispose();
			}
		});
		
		btnNewButton.setBounds(width / 2 - 75, 70, 140, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Novo Carrinho");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Carrinho carrinho = new Carrinho();
				carrinho.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(width / 2 - 75, 140, 140, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cadastrar Cliente");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CadastrarCliente newcliente = new CadastrarCliente();
				newcliente.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(width / 2 - 75, 175, 140, 30);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Pesquisar Produto");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				BuscarProduto pesquisar = new BuscarProduto();
				pesquisar.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(width / 2 - 75, 105, 140, 30);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Sair");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Login sair = new Login();
				sair.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBounds(width / 2 - 75, 210, 140, 30);
		contentPane.add(btnNewButton_4);
	}
}
