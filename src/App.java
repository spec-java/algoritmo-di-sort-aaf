public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println("Hello, World!");

        int[] arrayInt = { 4, 9, 3, 7 };

        sortingMethod(arrayInt);
        // for (int num : arrayInt) {
        // System.out.println(num);
        // }
    }

    public static int[] sortingMethod(int[] arrayInt) {
        int[] lastArray = new int[arrayInt.length];
        int[] sortedArray = new int[arrayInt.length];
        int higherNum = 0;

        for (int i = 0; i < arrayInt.length; i++) {

            sortedArray[i] = arrayInt[i];

        }

        for (int i = 0; i < sortedArray.length; i++) {
            int currentNum = sortedArray[i];

            if(higherNum < currentNum){
                higherNum  = currentNum;
                lastArray[i] = higherNum;
            //  currentNum = 0;

            }

            // higherNum = 0;

        }
        System.out.println(higherNum);

         for (int num : lastArray) {
             System.out.println(num);
         }

        return arrayInt;
    }
}
