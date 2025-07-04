package assn_05;

public class DuplicateStringFinder {
    public static void main(String[] args) {
        String[] arr1 = {"apple", "banana", "cherry", "apple", "date", "banana"};
        String[] arr2 = {"elephant", "fox", "grape"};

        System.out.println("Duplicates in arr1:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i].equals(arr2[j])) {
                    System.out.println(arr2[i]);
                    break; 
                }
            }
        }
    }
}
