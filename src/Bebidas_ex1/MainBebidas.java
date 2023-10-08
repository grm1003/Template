package Bebidas_ex1;

public class MainBebidas {
    public static void main(String[] args) {
        BebidasTemplate cafe = new Cafe();
        BebidasTemplate capuccino = new Capuccino();
        BebidasTemplate cha = new Cha();
        try{
            cafe.pedidoBebida();
            capuccino.pedidoBebida();
            cha.pedidoBebida();
        }catch (Exception e){
            System.out.println("Problemas ao realizar pedido");
        }

    }
}
