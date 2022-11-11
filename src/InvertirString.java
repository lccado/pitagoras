public class InvertirString {
    public static String invertir(String valor){
        StringBuffer str = new StringBuffer();
        for (int x = 0; x < valor.length(); x++){
            str.append(valor.charAt(valor.length()-1-x));
        }
        return str.toString();
    }

    public static String invertir2(String valor){
        StringBuffer str = new StringBuffer(valor);
        char aux;
        for (int x = 0; x < valor.length() / 2; x++){
            aux = str.charAt(x);
            str.setCharAt(x, str.charAt(valor.length()-1-x));
            str.setCharAt(valor.length()-1-x, aux);
        }
        return str.toString();
    }
}
