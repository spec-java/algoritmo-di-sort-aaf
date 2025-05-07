public class App {
    public static void main(String[] args) throws Exception {
        int[] arrayInt = { 4, 9, 3, 7 };
        String[] arrayString  = {"piero", "pierone", "pierluigi", "piergianpaolo"};

        System.out.println("Ordinamento array numerico: ");
        sortingNumbersMethod(arrayInt);

        System.out.println("Ordinamento array di stringhe per lunghezza:");
        sortingStringsMethod(arrayString);

    }

    public static int[] sortingNumbersMethod(int[] arrayInt) {
        int[] sortedArray = new int[arrayInt.length];

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
            arrayInt[lastNumIndex] = 100;
            sortedArray[i] = lowerNum;

        }

        for (int num : sortedArray) {
            System.out.println(num);
        }

        return sortedArray;
    }

    public static String[] sortingStringsMethod(String[] arrayString) {
        String[] sortedArray = new String[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            String lowestString = "aklnbsdlknsdannaslsaknlasklsa";
            int lastStringIndex = 0;

            for (int y = 0; y < arrayString.length; y++) {
                String currentString = arrayString[y];

                if (lowestString.length() > currentString.length()) {
                    lowestString = currentString;
                    lastStringIndex = y;

                }

            }
            arrayString[lastStringIndex] = "aklnbsdlknsdannaslsaknlasklsa";
            sortedArray[i] = lowestString;

        }

        for (String string : sortedArray ) {
            System.out.println(string + ", lunghezza: " + string.length());
        }

        return sortedArray;
    }
}
