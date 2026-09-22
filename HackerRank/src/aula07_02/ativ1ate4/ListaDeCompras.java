/*package aula07_02;

import java.util.ArrayList;

public class ListaDeCompras {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Produto produto : produtos) {
            total += produto.getPreco();
        }

        return total;
    }

    public void imprimirTodos() {
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome()
                    + " | Preço: " + produto.getPreco());
        }
    }
}

 */