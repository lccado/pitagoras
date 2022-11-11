public class FuncionMatematica {
    private int tipo;

    /**
     * Default Contructor.
     */
    public FuncionMatematica() {
        this.tipo = 40;
    }

    public FuncionMatematica(int valor1) {
        this.tipo = valor1;
    }


    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
