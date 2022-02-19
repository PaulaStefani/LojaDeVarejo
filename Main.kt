fun main(args: Array<String>) {
    val vendedor = Vendedor()
    val fornecedor = Fornecedor(
        "Pauliano Floridente",
        "paulinhofornecedor@gmail.com",
        " 5199468739"
    )
    print("o nome do fornecedor é:")
    println(fornecedor.nome)
    print("O email do fornecedor é:")
    println(fornecedor.email)
    print("O telefone comercial do fornecedor é:")
    println(fornecedor.telefoneComercial)

    val estoque = Estoque(
        "4554",
        "Sabão em pó cheirinho do bebê",
        "556"
    )
    print("A quantidade de produtos disponiveis no estoque é de:")
    println(estoque.quantidadeDisponivel)
    print("O produto é:")
    println(estoque.produto)
    print("A quantidade de produtos vendidos foi de:")
    println(estoque.quantidadeVendida)

    val filial = Filial(
        " filiallojadevarejo@gmail.com",
        " 50 ",
        " 51943872395"
    )
    print("O email da filial é:")
    println(filial.email)
    print("A quantidade de funcionários na filial é de:")
    println(filial.quantidadeFuncionarios)
    print("Telefone comercial da filial:")
    println(filial.telefoneComercial)

    val transportadora = Transportadora(
        "O nome da transportadora é: Transporte Paulinho e Zeca ao seu lado",
        "Telefone comercial da transportadora:5134932670",
        "Email da transportadora: transportepaulinhoezeca@gmail.com"
    )
    println(transportadora.email)
    println(transportadora.nome)
    println(transportadora.telefoneComercial)

    val cliente = Cliente(
        " João Alberto Ferreira dos Campos Amaro",
        "51993877382"
    )
    print("O nome do cliente é:")
    println(cliente.nome)
    print("Telefone do cliente:")
    println(cliente.telefone)

    val venda = Venda(
        "5564546"
    )
    print("A quantidade de produtos vendidos foi de:")
    println(venda.quantidade)

    val produto = Produto(
        " O higienico Neve extrasuave",
        "Higiene pessoal",
        "5 reais",
        "8 mil rolos"
    )
    print("O produto é:")
    println(produto.nome)
    print("A categoria do produto é a:")
    println(produto.categoria)
    print("O valor do produto é:")
    println(produto.valor)
    print("A quantidade disponivel em estoque é de:")
    println(produto.quantidadeEmEstoque)

}

