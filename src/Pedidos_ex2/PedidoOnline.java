package Pedidos_ex2;

public class PedidoOnline extends PedidosTemplate{
    @Override
    protected void processarPagamento(double valor, String metodo) {
        System.out.println("Processando pagamento online via " + metodo+"!");
    }
    @Override
    protected void entregaPedido() {
        System.out.println("Pedido será enviado ao endereço solicitado");
    }

}
