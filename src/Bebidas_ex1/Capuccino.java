package Bebidas_ex1;

public class Capuccino extends  BebidasTemplate{
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando capuccino!");
    }

    @Override
    protected void adicionarContimentos() {
        System.out.println("Adicionando açúcar e mais leite de acordo com o pedido!");
    }
}
