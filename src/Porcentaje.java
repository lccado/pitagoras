public class Porcentaje extends FuncionMatematica {

    public Porcentaje(int aa) {
        this();
    }

    public Porcentaje() {
        super();

    }

    /**
     * Calcula los porcentaje.
     * @param valor
     * @param porcentaje
     * @return
     */
    public int calculaPorcentaje(int valor, int porcentaje) {
        return valor*porcentaje/100;
    }

    /**
     * Imprime los resultados.
     * @param valor
     * @param porcentaje
     */
    public void printPorcentaje(int valor, int porcentaje) {
        int resultado = this.calculaPorcentaje(valor, porcentaje);
        int total = valor + resultado;
        System.out.println("Valor : "+ valor);
        System.out.println("Porcentaje : "+ porcentaje + "% = " + resultado);
        System.out.println("Total : "+ total);
    }
}
