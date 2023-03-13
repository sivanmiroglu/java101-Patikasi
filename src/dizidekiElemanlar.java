public class dizidekiElemanlar {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double result = 0.0;
        for(int i = 1; i <= array.length; i++) {
            result += (1.0 / i);
        }
        double avarage = array.length / result;
        System.out.println("Dizideki sayıların harmonik ortalaması : " + avarage);
    }
}