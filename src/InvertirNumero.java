public class InvertirNumero {

    public static int invertirNumero(int valor) {
        int nuevoValor = 0;
        while (valor > 0) {
            nuevoValor *= 10;
            nuevoValor = nuevoValor + valor % 10;
            valor = valor / 10;
        }
        return nuevoValor;
    }

}
