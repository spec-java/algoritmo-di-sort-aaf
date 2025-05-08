import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arrayInt = { 4, 9, 3, 7 };
        String[] arrayString = { "piero", "pierone", "pierluigi", "piergianpaolo" };

        System.out.println("Ordinamento array numerico: ");
        sortingNumbersMethod(arrayInt);

        System.out.println("Ordinamento array di stringhe per lunghezza:");
        sortingStringsMethod(arrayString);

        // algoritmo 2
        int[] arrayInt2 = { 4, 9, 3, 7, 12 };

        for (int num : arrayInt2) {
            System.out.println(num);
        }

        sortingNumbersMethod2(arrayInt2);
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

        

        return array;
    }
}
