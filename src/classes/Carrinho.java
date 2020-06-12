package classes;

import java.util.ArrayList;

public class Carrinho {
	
	ArrayList<Produto> carrinho = new ArrayList<Produto>();
	private float preco_total;
	
	public Carrinho(Produto[] p, int p_size, int[] quantList) {
		this.setCarrinho(p, p_size, quantList);
		this.setPreco_total();
		
	}
	 
	public ArrayList<Produto> getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Produto[] product, int product_index, int[] listQuant) {
		
		Produto lista[] = new Produto[product_index];
		
		for (int a = 0; a < product_index; a++) {
			
			Produto produto = product[product_index];
			int b = produto.getQuantidade();
			int c = listQuant[product_index];
			
			if (b >= c ){
				Produto phanton = product[product_index];
				phanton.setQuantidade(c);
				lista[product_index] = phanton;
				int d = produto.getQuantidade();
				int e = phanton.getQuantidade();
				
				int quantidade = d - e;
				produto.setQuantidade(quantidade);
			} else {
				String f = produto.getNome();
				System.out.println("Não há quantidade suficiente do produto <"+ f + ">. Por favor, refazer o pedido!");
				return;
			}
		}
		
		for(int count = 0; count < product_index; count++) {
			this.carrinho.add(lista[count]);
		}
	}
	
	public float getPreco_total() {
		return preco_total;
	}
	public void setPreco_total() {
		float p = 0;
		for(int a = 0; a < this.carrinho.size(); a++) {
			p = p + this.carrinho.get(a).getPreco();
		}
		this.preco_total = p;
	}
	
	public void editPreco_Total(float a) {
		this.preco_total = a;
	}
	
	
	
}
