package ArraysProblem;

public class problem6 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] newArray = removeFirstElementOfArray(array);
        for(int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i] + "");
        }
        
    }

    public static int[] removeFirstElementOfArray(int[] array) {
        int[] newArray = new int[array.length - 1];
        for (int i = 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }
        return newArray;
    }
}
