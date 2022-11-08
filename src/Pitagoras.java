public class Pitagoras {

    public static double calcularHipotenusa(int catetoA, int catetoB) {
        return Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
    }

    public double calcularHipotenusa2(int catetoA, int catetoB) {
        return Math.sqrt(catetoA*catetoA + catetoB*catetoB);
    }
}
