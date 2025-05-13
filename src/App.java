import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arrayInt = { 4, 9, 3, 7 };
        String[] arrayString = { "asdddddddd", "a", "pollo", "precipitevolissimevolmente", "boh" };

        System.out.println("Ordinamento array numerico: ");
        sortingNumbersMethod(arrayInt);

        System.out.println("Ordinamento array di stringhe per lunghezza:");
        sortingStringsMethod(arrayString);

        // algoritmo 2
        int[] arrayInt2 = { 4, 9, 3, 7, 12 };
        String[] arrayString2 = { "asdddddddd", "a", "pollo", "precipitevolissimevolmente", "boh" };

        System.out.println("Metodo lento numeri");
        for (int i = 0; i < arrayInt2.length; i++) {
            System.out.println(sortingNumbersMethod2(arrayInt2)[i]);
        }

        System.out.println("Metodo lento stringhe");
        for (int i = 0; i < arrayString2.length; i++) {
            System.out.println(sortingStringsMethod2(arrayString2)[i]);
        }
    }

    public static int[] sortingNumbersMethod(int[] arrayInt) {
        int[] sortedArray = new int[arrayInt.length];
        int higherNum = 0;

        for (int x = 0; x < arrayInt.length; x++) {

            int currentNum = arrayInt[x];
            if (higherNum < currentNum) {
                higherNum = currentNum;
            }

        }
        for (int i = 0; i < arrayInt.length; i++) {
            int lowerNum = 100;
            int lastNumIndex = 0;

            for (int y = 0; y < arrayInt.length; y++) {
                int currentNum = arrayInt[y];

                if (lowerNum > currentNum) {
                    lowerNum = currentNum;
                    lastNumIndex = y;

                }

            }
            arrayInt[lastNumIndex] = higherNum + 1;
            sortedArray[i] = lowerNum;

        }

        for (int num : sortedArray) {
            System.out.println(num);
        }

        return sortedArray;
    }

    public static String[] sortingStringsMethod(String[] arrayString) {
        String[] sortedArray = new String[arrayString.length];
        int higherNum = 0;

        for (int x = 0; x < arrayString.length; x++) {

            String currentString = arrayString[x];
            if (higherNum < currentString.length()) {
                higherNum = currentString.length();
            }

        }

        for (int i = 0; i < arrayString.length; i++) {
            String lowestString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            int lastStringIndex = 0;

            for (int y = 0; y < arrayString.length; y++) {
                String currentString = arrayString[y];

                if (lowestString.length() > currentString.length()) {
                    lowestString = currentString;
                    lastStringIndex = y;

                }

            }
            arrayString[lastStringIndex] = generaStringaCasuale(higherNum + 1);
            sortedArray[i] = lowestString;

        }

        for (String string : sortedArray) {
            System.out.println(string + ", lunghezza: " + string.length());
        }

        return sortedArray;
    }

    public static String generaStringaCasuale(int lunghezza) {
        String caratteri = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(lunghezza);

        for (int i = 0; i < lunghezza; i++) {
            int indice = random.nextInt(caratteri.length());
            sb.append(caratteri.charAt(indice));
        }

        return sb.toString();
    }

    // ALGORITMO 2

    public static int[] sortingNumbersMethod2(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                for (int j2 = 0; j2 < array.length; j2++) {
                    for (int k = 0; k < array.length; k++) {
                        for (int k2 = 0; k2 < array.length; k2++) {
                            for (int l = 0; l < array.length; l++) {
                                if (array[j] > array[j + 1]) {
                                    int num = array[j];
                                    array[j] = array[j + 1];
                                    array[j + 1] = num;
                                }
                            }
                        }
                    }
                }
            }
        }

        return array;
    }

    public static String[] sortingStringsMethod2(String[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                for (int j2 = 0; j2 < array.length; j2++) {
                    for (int k = 0; k < array.length; k++) {
                        for (int k2 = 0; k2 < array.length; k2++) {
                            for (int l = 0; l < array.length; l++) {
                                if (array[j].length() > array[j + 1].length()) {
                                    String string = array[j];
                                    array[j] = array[j + 1];
                                    array[j + 1] = string;
                                }
                            }
                        }
                    }
                }
            }
        }

        return array;
    }
}
