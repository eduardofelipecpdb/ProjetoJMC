package classes;

import java.util.Random;

public class Venda {

	private Cliente cliente;
	private Vendedor vendedor;
	private float valor_venda;
	private int iD;
	
	public Venda(Loja store, Cliente cliente, Vendedor vendedor) {
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.setiD(store);
		this.valor_venda = cliente.getCarrinho().getPreco_total();
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public float getValor_venda() {
		return valor_venda;
	}
	public void setValor_venda() {
		this.valor_venda = this.cliente.getCarrinho().getPreco_total();
	}
	public int getiD() {
		return iD;
	}
	public void setiD(Loja store) {
		
		int nulo = store.getVendas().size();
		if (nulo == 0) {
			Random gerador = new Random();
			this.iD = gerador.nextInt(500);
		} else {
			int anterior = store.getVendas().indexOf(this) - 1;
			this.iD = store.getVendas().get(anterior).iD + 1;
		}
	}
	
	
	
}
