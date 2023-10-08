package Pedidos_ex2;
// b) O padrão de projeto Template se diferencia do padrão Decorator, pois o Decorator está relacionado a incrementar funcionalidades em classes, em quanto o Template implementa classes abstradas para implementar uma sequencia de passos
public class MainPedidos {
    public static void main(String[] args) {
        PedidosTemplate online = new PedidoOnline();
        PedidosTemplate loja = new PedidoLoja();
        PedidosTemplate criptomoeda = new PedidoCriptomoedas();

        try{
            online.processarPedido(15,2,"cartão de crédito");
            loja.processarPedido(11,3,"dinheiro");
            criptomoeda.processarPedido(20, 5, "DogdeCoin");
        }catch (Exception e){
            System.out.println("Erro ao realizar algum pedido");
        }
    }
}
