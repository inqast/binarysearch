package collections;

import java.util.ArrayList;
import java.util.stream.Stream;
 
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import comparable.ComparableObject;

public class CollectionsTest {
    private static Stream<Arguments> intColInputsAndResults() {
       ArrayList<Integer> col = new ArrayList<>();
        col.add(1); 
        col.add(2); 
        col.add(3); 
        col.add(5); 
        col.add(8); 
        col.add(15); 
        col.add(20); 
        col.add(30); 
        col.add(45);
        ArrayList<Integer> empty = new ArrayList<>();


        return Stream.of(
                Arguments.of(col, 15, 5),
                Arguments.of(col, 1, 0),
                Arguments.of(col, 45, 8),
                Arguments.of(col, 50, -1),
                Arguments.of(col, -5, -1),
                Arguments.of(empty, -5, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("intColInputsAndResults")
    @DisplayName("BinarySearch in int collection")   
    void testBinarySearchInts(ArrayList<Integer> a, int key, int expectedIndex) {
        assertEquals(expectedIndex, collections.Collections.binarySearch(a, key));  
    }

    private static Stream<Arguments> objColInputsAndResults() {
       ArrayList<ComparableObject> col = new ArrayList<>();
        col.add(new ComparableObject(1)); 
        col.add(new ComparableObject(2)); 
        col.add(new ComparableObject(3)); 
        col.add(new ComparableObject(5)); 
        col.add(new ComparableObject(8)); 
        col.add(new ComparableObject(15)); 
        col.add(new ComparableObject(20)); 
        col.add(new ComparableObject(30)); 
        col.add(new ComparableObject(45));
         ArrayList<ComparableObject> empty = new ArrayList<>();
 
 
         return Stream.of(
                 Arguments.of(col, new ComparableObject(15), 5),
                 Arguments.of(col, new ComparableObject(1), 0),
                 Arguments.of(col, new ComparableObject(45), 8),
                 Arguments.of(col, new ComparableObject(50), -1),
                 Arguments.of(col, new ComparableObject(-5), -1),
                 Arguments.of(empty, new ComparableObject(-5), -1)
         );
     }
     @ParameterizedTest
     @MethodSource("objColInputsAndResults")
     @DisplayName("BinarySearch in obj collection with comparator")   
     void testBinarySearchObjects(ArrayList<ComparableObject> a, ComparableObject key, int expectedIndex) {
         assertEquals(expectedIndex, collections.Collections.binarySearch(a, key, new ComparableObject.ComparatorForObject()));  
     }
}
