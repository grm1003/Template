package Bebidas_ex1;

public abstract class BebidasTemplate {

    public final void pedidoBebida(){
        System.out.println("Pedido bebida: {");
        esquentarAgua();
        prepararBebida();
        colocaXicara();
        adicionarContimentos();
        System.out.println("}");
    }


    private void esquentarAgua(){
        System.out.println("Esquentando água!");
    }
    protected abstract void prepararBebida();
    private void colocaXicara(){
        System.out.println("Colocando bebida na Xìcara!");
    }
    protected abstract void adicionarContimentos();
}
