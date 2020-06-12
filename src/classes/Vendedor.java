package classes;

import java.util.Random;

public class Vendedor extends User {
	
	private String nome;
	private int iD;
	
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
		
		int nulo = store.getVendedores().size();
		if (nulo == 0) {
			Random gerador = new Random();
			this.iD = gerador.nextInt(500);
		} else {
			int anterior = store.getVendedores().indexOf(this) - 1;
			this.iD = store.getVendedores().get(anterior).iD + 1;
		}
	}
	
	public void realizarVenda(Loja store, Cliente cliente, Vendedor vendedor, int desconto) {
		
		float p = cliente.getCarrinho().getPreco_total();
		if (cliente.getStatus() == "VIP") {
			p = p - ((p*desconto)/100);
			cliente.getCarrinho().editPreco_Total(p);
			store.addVenda(new Venda(store, cliente, vendedor));
		} else {
			store.addVenda(new Venda(store, cliente, vendedor));
		}
	}
	
	public void desfazerVenda(Loja store, Venda venda) {
		store.delVenda(venda);
	}
	
	public void tornarClienteVIP(Cliente cliente) {
		cliente.setStatus("VIP");
	}
	
	public void delClienteVIP(Cliente cliente) {
		cliente.setStatus("normal");
	}

}
