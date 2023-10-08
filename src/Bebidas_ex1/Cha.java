package Bebidas_ex1;

public class Cha extends  BebidasTemplate{
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando chá!");
    }

    @Override
    protected void adicionarContimentos() {
        System.out.println("Adicionando açúcar de acordo com o pedido!");

    }
}
