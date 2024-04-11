import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_duplicates {

    // given two list of integers remove all duplicates
    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
        // copy arr into unique arr
        List<Integer> uniqueArr = arr;
        // for each duplicate element in arr add value to uniqueArr 
        for (int i = 0; i < uniqueArr.size(); i++) {
            // if its a duplicate to add to uniqueArr
            if (!uniqueArr.contains(uniqueArr.get(i))) {
                arr.add(uniqueArr.get(i));
            } else {
                removedElements.remove(arr.get(i));
            }
        }
        // return new array
        return arr;
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
