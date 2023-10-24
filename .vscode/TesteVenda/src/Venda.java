import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    
    private LocalDate data;
    private Cliente cliente;
    private String atendente;
    private List<itemVenda> itens;

    public Venda(LocalDate data, Cliente cliente, String atendente){
        this.data = data;
        this.cliente = cliente;
        this.atendente = atendente;
        this.itens = new ArrayList<>();    
    }

    //Metódo para adicionar Item
    public void adicionarItem(itemVenda item){
        itens.add(item);
    }

    //Metódo para calcular Item
    public double calcularTotal() {
        double total = 0.0;
        for (itemVenda item : itens){
            total += item.calcularTotal();
        }
        return total;
    }
    
    public void listaritensVendas() {
        System.out.println("Data da venda: " + data);
        System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf() + " | Idade: " + cliente.calcularIdade());
        System.out.println("Atendente: " + atendente);
        System.out.println("\nNome do produto (Código) | Preço     | Quantidade | Total ");
        System.out.println("-----------------------------------------------------------");
        
        for (itemVenda item : itens) {
            Produto produto = item.getProduto();
            System.out.printf("%-20s (%d) | R$ %6.2f | %10d | R$ %6.2f\n", produto.getNome(), produto.getCodigo(), produto.getPreco(), item.getQuantidade(), item.calcularTotal());
        }
        
        System.out.println("-----------------------------------------------------------");
        System.out.printf("Total da Venda: \t\t\tR$ %.2f\n", calcularTotal());
    }
}







