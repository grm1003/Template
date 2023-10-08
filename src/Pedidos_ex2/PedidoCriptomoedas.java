package Pedidos_ex2;

public class PedidoCriptomoedas extends PedidosTemplate{
    @Override
    protected void processarPagamento(double valor, String metodo) {
        System.out.println("Processando pagamento via criptomoeda: "+metodo+"!");
    }
    @Override
    protected void entregaPedido() {
        System.out.println("Pedido será enviado ao endereço solicitado");
    }

}
