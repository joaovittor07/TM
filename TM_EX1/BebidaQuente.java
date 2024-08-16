package TM_EX1;

abstract class BebidaQuente {
    // Template method
    public final void prepararReceita() {
        ferverAgua();
        preparar();
        despejarNoCopo();
        adicionarCondimentos();
    }

    // Métodos comuns para todas as bebidas
    void ferverAgua() {
        System.out.println("Fervendo água");
    }

    void despejarNoCopo() {
        System.out.println("Despejando no copo");
    }

    // Métodos abstratos que as subclasses implementarão
    abstract void preparar();

    abstract void adicionarCondimentos();
}

