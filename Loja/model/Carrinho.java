package model;

import java.util.ArrayList;

public class Carrinho {

    private Cliente cliente;
    private ArrayList<ItemCarrinho> itens;

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        ItemCarrinho novoItem = new ItemCarrinho(produto);
        itens.add(novoItem);
    }

    public void removerItem(Produto produto) {
        ItemCarrinho itemRemover = null;
        for (ItemCarrinho item : itens) {
            if (item.getProduto().equals(produto)) {
                itemRemover = item;
                break;
            }
        }
        if (itemRemover != null) {
            itens.remove(itemRemover);
        }
    }

    public ArrayList<ItemCarrinho> getItens() {
        return itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getProduto().getPreco();
        }
        return total;
    }

    public int getQuantidadeTotal() {
        return itens.size();
    }
    public void esvaziarCarrinho() {
        itens.clear();
    }
}
