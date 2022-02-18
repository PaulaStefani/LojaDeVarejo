class Estoque(quantidadeDisponivel: String, produto: String, quantidadeVendida: String) {

    var quantidadeDisponivel: String
    var produto: String
    var quantidadeVendida: String

    init {
        this.quantidadeDisponivel = quantidadeDisponivel
        this.produto = produto
        this.quantidadeVendida = quantidadeVendida
    }
}