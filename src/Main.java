import java.util.Scanner;

public class Main {

    /*
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese cateto A");
        int catA = keyboard.nextInt();
        System.out.println("Ingrese cateto B");
        int catB = keyboard.nextInt();
        Pitagoras obj = new Pitagoras();
        System.out.println("Hipotenusa :[" + obj.calcularHipotenusa(catA, catB) + "]");
    }
    */
/*
    public static void main(String[] args) {
        int catA = (int) Math.floor(Math.random()*100);
        int catB = (int) Math.floor(Math.random()*100);
        Integer catR = (int) Math.floor(Math.random()*100);
        Pitagoras obj = new Pitagoras();

        System.out.println("Cateto A[" + catA + "] Cateto B[" + catB +"]");
        System.out.println("Hipotenusa :[" + Pitagoras.calcularHipotenusa(catA, catB) + "]");
        System.out.println("Hipotenusa :[" + obj.calcularHipotenusa2(catA, catB) + "]");

        Mamifero aaaa = new Mamifero();
        aaaa.saludar();
        aaaa.ver();

        SerVivo bbb = new Mamifero();
        bbb.saludar();
        ((Mamifero)bbb).ver();
        ((Animal)bbb).respirar();

        Animal cccc = new Mamifero();
        ((SerVivo)cccc).saludar();

    }

    */

/**
    public static void main(String ... args) {
        Porcentaje obj = new Porcentaje(45);
        obj.printPorcentaje(100, 75);
    }
 */

    public static void main(String ... argv) {
        String valor = "arbol";
        System.out.println("Valor original:"+valor);
        System.out.println("Al reve:"+InvertirString.invertir2(valor));
        int valornum = 123456;
        System.out.println("Valor original:"+valornum);
        System.out.println("Al reve:"+InvertirNumero.invertirNumero(valornum));

    }
}
