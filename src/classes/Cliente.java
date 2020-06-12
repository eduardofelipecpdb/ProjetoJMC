package classes;

import java.util.Random;

public class Cliente {
	
	private String nome;
	private int iD;
	private int cpf;
	private String contato;
	private String status;
	private Carrinho carrinho;
	
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
		
		int nulo = store.getClientes().size();
		if (nulo == 0) {
			Random gerador = new Random();
			this.iD = gerador.nextInt(500);
		} else {
			int anterior = store.getClientes().indexOf(this) - 1;
			this.iD = store.getClientes().get(anterior).iD + 1;
		}
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	
	
	
}
