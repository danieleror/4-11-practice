import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_duplicates {

    // given two list of integers remove all duplicates
    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
        // make new array with only unique elements
        List<Integer> uniqueArr = new ArrayList<>();
        // for each duplicate element in arr add value to uniqueArr 
        for (int i = 0; i < arr.size(); i++) {
            // if its a duplicate to add to uniqueArr
            if (!uniqueArr.contains(arr.get(i))) {
                uniqueArr.add(arr.get(i));
            } else {
                removedElements.add(arr.get(i));
            }
        }
        // return new array
        return uniqueArr;
    }

    // test removeDuplicates method
    public static void main(String[] args) {
        // Test the method
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> removedElements = new ArrayList<>();
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements);
        // print array
        System.out.println("Original array: " + arr);
        System.out.println("Unique array: " + uniqueArr);
        System.out.println("Removed elements: " + removedElements);
    }
}
