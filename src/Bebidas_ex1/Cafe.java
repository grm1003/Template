package Bebidas_ex1;

public class Cafe extends  BebidasTemplate{
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando café!");
    }

    @Override
    protected void adicionarContimentos() {
        System.out.println("Adicionando açúcar de acordo com o pedido!");

    }
}
