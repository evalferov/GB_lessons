package CoreHW2;

public class Main {
    public static int arraySum(String[][] twoDimensionalArray) throws MyArraySizeException, MyArrayDataException {
        if (twoDimensionalArray.length !=4) {
            throw new MyArraySizeException("Длинна массива не равна 4");
        }

        for (String[] array: twoDimensionalArray) {
            if (array.length !=4){
                throw new MyArraySizeException("высота не = 4");
            }
        }
        int sum = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
              try {
                  sum += Integer.parseInt(twoDimensionalArray[i][j]);
              } catch (NumberFormatException e) {
                  throw new MyArrayDataException("Не числовой элемент" + i + "," + j);
              }
            }
        }
        return sum;

    }
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] successArray = {{"1","2","3","4"},
        {"aa","2","3","4"},
        {"1","2","3","4"},
        {"1","2","3","4"}};
        try {
            System.out.println(arraySum(successArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        String[][] invalidArray = {{"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"}};
        try {
            System.out.println(arraySum(invalidArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }
}
