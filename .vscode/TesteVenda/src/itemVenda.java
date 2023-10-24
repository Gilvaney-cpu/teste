public class itemVenda {
    
    //Atributo
    private int quantidade;
    private Produto produto;
    
    //Construtor
    public itemVenda(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }

    //Metódos
    public double calcularTotal(){
        return produto.getPreco() * quantidade;
    }

    //get seters
    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}   
