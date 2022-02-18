class Vendedor {
    private var nome: String? = null
    private var telefone: String? = null

    override fun toString(): String {
        return "O vendedor(a) " + nome + " tem o seguinte telefone " + telefone + ""
    }
}