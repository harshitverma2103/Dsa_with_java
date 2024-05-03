package ArraysProblem;

public class problem20 {
     public static void main(String[] args) {
          // Testing the sortPeople method
          String[] names = {"John", "Alice", "Bob", "Emily"};
          int[] heights = {180, 165, 175, 170};
          String[] sortedNames = sortPeople(names, heights);
          for (String name : sortedNames) {
               System.out.println(name);
          }
     }

     public static String[] sortPeople(String[] name, int[] height) {
          for (int i = 0; i < name.length - 1; i++) {
               for (int j = 0; j < name.length - i - 1; j++) {
                    if (height[j] < height[j + 1]) {
                         int tempHeight = height[j];
                         height[j] = height[j + 1];
                         height[j + 1] = tempHeight;
                         String tempName = name[j];
                         name[j] = name[j + 1];
                         name[j + 1] = tempName;
                    }
               }
          }
          return name;
     }
}
