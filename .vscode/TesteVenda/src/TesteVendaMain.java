import java.time.LocalDate;

public class TesteVendaMain {
    public static void main(String[] args){

    //Criar produtos
    Produto produto1 = new Produto(01, "Produto", "Martelo", 10.00);
    Produto produto2 = new Produto(02, "Produto", "Alicate", 5.00);
    Produto produto3 = new Produto(03, "Produto", "Chave", 20.00);
    Produto produto4 = new Produto(04, "Produto", "Ferramenta", 15.00);

    //Instanciamento de 4 objetos do tipo itemVenda
    itemVenda item1 = new itemVenda(10, produto1);
    item1.setProduto(produto1);
    item1.setQuantidade(10);

    itemVenda item2 = new itemVenda(5, produto2);
    item2.setProduto(produto2);
    item2.setQuantidade(5);

    itemVenda item3 = new itemVenda(10, produto3);
    item3.setProduto(produto3);
    item3.setQuantidade(10);

    itemVenda item4 = new itemVenda(2, produto4);
    item4.setProduto(produto4);
    item4.setQuantidade(2);

    //Instanciar um objeto do tipo Cliente
    Cliente cliente = new Cliente("José Maria Marques", "123456", LocalDate.of(1997, 5, 10));

    // Instanciar 1 objeto do tipo Venda associando-o ao cliente criado anteriormente
    Venda venda = new Venda(LocalDate.of(2020, 12, 23), cliente, "Maria Dolores Sampaio");

    venda.adicionarItem(item1);
    venda.adicionarItem(item2);
    venda.adicionarItem(item3);
    venda.adicionarItem(item4);

    // Chame o método "listarItensVenda" do objeto Venda para imprimir as informações
    venda.listaritensVendas();
    }
   

}

    

