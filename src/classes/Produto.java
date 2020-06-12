package classes;

import java.util.Random;

public class Produto {
	
	private String Nome;
	private String tipo;
	private String descricao;
	private int quantidade;
	private int iD;
	private float preco;
	
	public Produto(Loja store, String nome, String tipo, int quantidade, int iD, float preco) {
		this.Nome = nome;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.setiD(store);
	
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(Loja store) {
		
		int nulo = store.getEstoque().size();
		if (nulo == 0) {
			Random gerador = new Random();
			this.iD = gerador.nextInt(500);
		} else {
			int anterior = store.getEstoque().indexOf(this) - 1;
			this.iD = store.getEstoque().get(anterior).iD + 1;
		}
		
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}