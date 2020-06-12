package classes;

import java.util.Random;

public class Admin extends User {

	private String nome;
	private int iD;
	
	public Admin(String nome, int iD) {
		this.nome = nome;
		this.iD = iD;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(Loja store) {
		
		int nulo = store.getAdministradores().size();
		if (nulo == 0) {
			Random gerador = new Random();
			this.iD = gerador.nextInt(500);
		} else {
			int anterior = store.getAdministradores().indexOf(this) - 1;
			this.iD = store.getAdministradores().get(anterior).iD + 1;
		}
	}
	public void novoProduto(Loja store, Produto produto) {
		store.addEstoque(produto);	
	}
	public void deletarProduto(Loja store, Produto produto) {
		store.delProduto(produto);
	}
	public void novoCliente(Loja store, Cliente cliente) {
		store.addCliente(cliente);	
	}
	public void deleltarCliente(Loja store, Cliente cliente) {
		store.delCliente(cliente);
	}
	public void novoVendedor(Loja store, Vendedor vendedor) {
		store.addVendedor(vendedor);	
	}
	public void deletarVendedor(Loja store, Vendedor vendedor) {
		store.delVendedor(vendedor);
	}
	public void novoAdministrador(Loja store, Admin administrador) {
		store.addAdministrador(administrador);	
	}
	public void deletarAdministrador(Loja store, Admin administrador) {
		store.delAdministrador(administrador);
	}
	
	
	
}
