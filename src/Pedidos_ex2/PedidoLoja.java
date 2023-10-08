package Pedidos_ex2;

public class PedidoLoja extends PedidosTemplate{
    @Override
    protected void processarPagamento(double valor, String metodo) {
        System.out.println("Processando pagamento na loja via " + metodo+"!");
    }
    @Override
    protected void entregaPedido() {
        System.out.println("Pedido está pronto para ser retirado");
    }

}
