package Composicao.UmParaMuitos;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	String cliente;
	List<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(String nome, int quantidade, double preco) {
		
		this.adicionarItem(new Item(nome,quantidade,preco));
	}
	
	void adicionarItem(Item item) {
		
		this.itens.add(item);
		item.compra = this;
	}
	
	double valorTotal() {
		
		double total = 0;
		
		for(Item item: itens) {
			
			total += item.quantidade * item.preco;
		}
		
		return total;
	}

}
