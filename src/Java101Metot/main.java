package Java101Metot;

public class main {

    public static void main(String[] args) {
        //int x = 25;
        //System.out.println(run(5));

        //int case1=power(2,3);
        System.out.println(power(2,3));

        int case2=power(2,4);
        System.out.println(case2);
    }

    static int power(int base , int exp){
        int result =1;
        for(int i=1;i<=exp;i++){
            result*=base;
        }
        return result;
    }

    //static int run(int x) {
        //x = 10;
        //return x;
    //}
}



