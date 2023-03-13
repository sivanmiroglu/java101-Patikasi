import java.util.Arrays;


public class maksMin {




    public static void main(String[] args) {

        int[] numbers = {11, 8, 99,-24,7,9,3};
        int number = 12;
        int temp= 0;
        Arrays.sort(numbers);

        for (int a : numbers) {

            if (number<a) {
                temp = a;
                System.out.println("En yakın büyük sayı: "+ a);
                break;

            }


        }
        if (numbers[Arrays.binarySearch(numbers, temp)-1] != number) {
            System.out.println("En yakın küçük sayı: " +numbers[Arrays.binarySearch(numbers, temp)-1]);


        }else{
            System.out.println("En yakın küçük sayı: " +numbers[Arrays.binarySearch(numbers, temp)-2]);

        }

    }

}