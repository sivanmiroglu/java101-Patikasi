public class tekrarEdenSayilar {
    static boolean isFind(int list[], int value) {
        for(int i : list) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {3, 7, 3, 2, 9, 4, 21, 1, 33, 9, 10, 2, 10, 5, 8, 7, 4, 0, 33, 6, 4};
        int[] repetitive = new int[array.length];
        int startIndex = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j]) && (array[i] % 2 == 0)) {
                    if (!isFind(repetitive, array[i])) {
                        repetitive[startIndex++] = array[i];
                    }
                    break;
                }
            }
        }

        System.out.println("Sayı dizisindeki tekrar eden çift sayılar : ");

        for (int value : repetitive) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}