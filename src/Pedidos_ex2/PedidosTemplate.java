package Pedidos_ex2;

public abstract class PedidosTemplate {
    public final void processarPedido(double valor_produto, int quantidade, String metodo_pagamento){
        System.out.println("Pedido : {");
        processarPagamento(valor_produto*quantidade,metodo_pagamento);
        entregaPedido();
        System.out.println("}");
    }

    protected abstract void processarPagamento(double valor, String metodo);

    protected abstract void entregaPedido();

}
