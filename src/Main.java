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
}
