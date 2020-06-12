package classes;

import java.util.ArrayList;

public class Loja {
	
	private ArrayList<Produto> estoque = new ArrayList<Produto>();
	private ArrayList<Venda> vendas = new ArrayList<Venda>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
	private ArrayList<Admin> administradores = new ArrayList<Admin>();
	
	public Loja() {
		
	}
	
	public ArrayList<Venda> getVendas() {
		return vendas;
	}
	public void addVenda(Venda venda) {
		this.vendas.add(venda);
	}
	public void delVenda(Venda venda) {
		
		for (int a = 0; a < this.vendas.size(); a++) {
			if (this.vendas.get(a).equals(venda)) {
				this.vendas.remove(a);
				break;
			}
		}
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void delCliente(Cliente cliente) {
		
		for (int a = 0; a < this.clientes.size(); a++) {
			if (this.clientes.get(a).equals(cliente)) {
				this.clientes.remove(a);
				break;
			}
		}
	}
	
	public ArrayList<Produto> getEstoque() {
		return estoque;
	}
	public void addEstoque(Produto produto) {
		this.estoque.add(produto);
	}
	public void delProduto(Produto produto) {
		
		for (int a = 0; a < this.estoque.size(); a++) {
			if (this.estoque.get(a).equals(produto)) {
				this.estoque.remove(a);
				break;
			}
		}
	}
	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}
	public void addVendedor(Vendedor vendedor) {
		this.vendedores.add(vendedor);
	}
	public void delVendedor(Vendedor vendedor) {
		
		for (int a = 0; a < this.vendedores.size(); a++) {
			if (this.vendedores.get(a).equals(vendedor)) {
				this.vendedores.remove(a);
				break;
			}
		}
	}
	public ArrayList<Admin> getAdministradores() {
		return administradores;
	}
	public void addAdministrador(Admin administrador) {
		this.administradores.add(administrador);
	}
	public void delAdministrador(Admin administrador) {
		
		for (int a = 0; a < this.administradores.size(); a++) {
			if (this.administradores.get(a).equals(administrador)) {
				this.administradores.remove(a);
				break;
			}
		}
	}
}
