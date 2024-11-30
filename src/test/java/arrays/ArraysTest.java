package arrays;

import java.util.stream.Stream;
 
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ArraysTest {

    private static Stream<Arguments> byteInputsAndResults() {
        byte[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        byte[] empty = {};

        return Stream.of(
                Arguments.of(arr, (byte) 15, 5),
                Arguments.of(arr, (byte) 1, 0),
                Arguments.of(arr, (byte) 45, 8),
                Arguments.of(arr, (byte) 50, -1),
                Arguments.of(arr, (byte) -5, -1),
                Arguments.of(empty, (byte) -5, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("byteInputsAndResults")
    @DisplayName("BinarySearch with bytes")   
    void testBinarySearchBytes(byte[] a, byte key, int expectedIndex) {
        assertEquals(expectedIndex, arrays.Arrays.binarySearch(a, key));  
    }

    private static Stream<Arguments> byteInputsAndResultsBounded() {
        byte[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        byte[] empty = {};

        return Stream.of(
                Arguments.of(arr, 2, 6, (byte) 15, 5),
                Arguments.of(arr, 0, 3, (byte) 1, 0),
                Arguments.of(arr, 2, 8, (byte) 45, 8),
                Arguments.of(arr, 2, 5, (byte) 50, -1),
                Arguments.of(arr, 2, 5, (byte) -5, -1),
                Arguments.of(empty, 1, 2, (byte) -5, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("byteInputsAndResultsBounded")
    @DisplayName("BinarySearch with bytes bounded")   
    void testBinarySearchBytesBounded(byte[] a, int from, int to, byte key, int expectedIndex) {
        assertEquals(expectedIndex, arrays.Arrays.binarySearch(a, from, to, key));  
    }

    private static Stream<Arguments> floatInputsAndResults() {
        float[] arr = {1.5f, 2.3f, 3.15f, 5.27f, 8.33f, 15.24f, 20f, 30.34f, 45f};
        float[] empty = {};

        return Stream.of(
                Arguments.of(arr, 15.24f, 5),
                Arguments.of(arr, 1.5f, 0),
                Arguments.of(arr, 45f, 8),
                Arguments.of(arr, 50f, -1),
                Arguments.of(arr, -5f, -1),
                Arguments.of(arr, 5.29f, -1),
                Arguments.of(empty, -5f, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("floatInputsAndResults")
    @DisplayName("BinarySearch with floats")   
    void testBinarySearchFloats(float[] a, float key, int expectedIndex) {
        assertEquals(expectedIndex, arrays.Arrays.binarySearch(a, key));  
    }

    private static Stream<Arguments> floatInputsAndResultsBounded() {
        float[] arr = {1.5f, 2.3f, 3.15f, 5.27f, 8.33f, 15.24f, 20f, 30.34f, 45f};

        return Stream.of(
                Arguments.of(arr, 2, 6, 15.24f, 5),
                Arguments.of(arr, 0, 3, 1.5f, 0),
                Arguments.of(arr, 2, 8, 45f, 8),
                Arguments.of(arr, 2, 5, 50f, -1),
                Arguments.of(arr, 2, 5, -5f, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("floatInputsAndResultsBounded")
    @DisplayName("BinarySearch with floats bounded")   
    void testBinarySearchFloatsBounded(float[] a, int from, int to, float key, int expectedIndex) {
        assertEquals(expectedIndex, arrays.Arrays.binarySearch(a, from, to, key));  
    }

    private static Stream<Arguments> doubleInputsAndResults() {
        double[] arr = {1.5, 2.3, 3.15, 5.27, 8.33, 15.24, 20, 30.34, 45};
        double[] empty = {};

        return Stream.of(
                Arguments.of(arr, (double) 15.24, 5),
                Arguments.of(arr, (double) 1.5, 0),
                Arguments.of(arr, (double) 45, 8),
                Arguments.of(arr, (double) 50, -1),
                Arguments.of(arr, (double)-5, -1),
                Arguments.of(arr, (double)5.29, -1),
                Arguments.of(empty, (double) -5, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("doubleInputsAndResults")
    @DisplayName("BinarySearch with double")   
    void testBinarySearchDouble(double[] a, double key, int expectedIndex) {
        assertEquals(expectedIndex, arrays.Arrays.binarySearch(a, key));  
    }

    private static Stream<Arguments> doubleInputsAndResultsBounded() {
        double[] arr = {1.5, 2.3, 3.15, 5.27, 8.33, 15.24, 20, 30.34, 45};

        return Stream.of(
                Arguments.of(arr, 2, 6, (double) 15.24, 5),
                Arguments.of(arr, 0, 3, (double) 1.5, 0),
                Arguments.of(arr, 2, 8, (double) 45, 8),
                Arguments.of(arr, 2, 5, (double) 50, -1),
                Arguments.of(arr, 2, 5, (double) -5, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("doubleInputsAndResultsBounded")
    @DisplayName("BinarySearch with double bounded")   
    void testBinarySearchDoubleBounded(double[] a, int from, int to, double key, int expectedIndex) {
        assertEquals(expectedIndex, arrays.Arrays.binarySearch(a, from, to, key));  
    }

    private static Stream<Arguments> intInputsAndResults() {
        int[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        int[] empty = {};

        return Stream.of(
                Arguments.of(arr, 15, 5),
                Arguments.of(arr, 1, 0),
                Arguments.of(arr, 45, 8),
                Arguments.of(arr, 50, -1),
                Arguments.of(arr, -5, -1),
                Arguments.of(empty, -5, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("intInputsAndResults")
    @DisplayName("BinarySearch with ints")   
    void testBinarySearchInts(int[] a, int key, int expectedIndex) {
        assertEquals(expectedIndex, arrays.Arrays.binarySearch(a, key));  
    }

    private static Stream<Arguments> intInputsAndResultsBounded() {
        int[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        int[] empty = {};

        return Stream.of(
                Arguments.of(arr, 2, 6, 15, 5),
                Arguments.of(arr, 0, 3, 1, 0),
                Arguments.of(arr, 2, 8, 45, 8),
                Arguments.of(arr, 2, 5, 50, -1),
                Arguments.of(arr, 2, 5, -5, -1),
                Arguments.of(empty, 1, 2, -5, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("intInputsAndResultsBounded")
    @DisplayName("BinarySearch with int bounded")   
    void testBinarySearchIntsBounded(int[] a, int from, int to, int key, int expectedIndex) {
        assertEquals(expectedIndex, arrays.Arrays.binarySearch(a, from, to, key));  
    }

    private static Stream<Arguments> longInputsAndResults() {
        long[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        long[] empty = {};

        return Stream.of(
                Arguments.of(arr, (long) 15, 5),
                Arguments.of(arr, (long) 1, 0),
                Arguments.of(arr, (long) 45, 8),
                Arguments.of(arr, (long) 50, -1),
                Arguments.of(arr, (long) -5, -1),
                Arguments.of(empty, (long) -5, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("longInputsAndResults")
    @DisplayName("BinarySearch with longs")   
    void testBinarySearchLongs(long[] a, long key, int expectedIndex) {
        assertEquals(expectedIndex, arrays.Arrays.binarySearch(a, key));  
    }

    private static Stream<Arguments> longInputsAndResultsBounded() {
        long[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        long[] empty = {};

        return Stream.of(
                Arguments.of(arr, 2, 6, (long) 15, 5),
                Arguments.of(arr, 0, 3, (long) 1, 0),
                Arguments.of(arr, 2, 8, (long) 45, 8),
                Arguments.of(arr, 2, 5, (long) 50, -1),
                Arguments.of(arr, 2, 5, (long) -5, -1),
                Arguments.of(empty, 1, 2, (long) -5, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("longInputsAndResultsBounded")
    @DisplayName("BinarySearch with longs bounded")   
    void testBinarySearchLongsBounded(long[] a, int from, int to, long key, int expectedIndex) {
        assertEquals(expectedIndex, arrays.Arrays.binarySearch(a, from, to, key));  
    }

    private static Stream<Arguments> shortInputsAndResults() {
        short[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        short[] empty = {};

        return Stream.of(
                Arguments.of(arr, (short) 15, 5),
                Arguments.of(arr, (short) 1, 0),
                Arguments.of(arr, (short) 45, 8),
                Arguments.of(arr, (short) 50, -1),
                Arguments.of(arr, (short) -5, -1),
                Arguments.of(empty, (short) -5, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("shortInputsAndResults")
    @DisplayName("BinarySearch with shorts")   
    void testBinarySearchLongs(short[] a, short key, int expectedIndex) {
        assertEquals(expectedIndex, arrays.Arrays.binarySearch(a, key));  
    }

    private static Stream<Arguments> shortInputsAndResultsBounded() {
        short[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        short[] empty = {};

        return Stream.of(
                Arguments.of(arr, 2, 6, (short) 15, 5),
                Arguments.of(arr, 0, 3, (short) 1, 0),
                Arguments.of(arr, 2, 8, (short) 45, 8),
                Arguments.of(arr, 2, 5, (short) 50, -1),
                Arguments.of(arr, 2, 5, (short) -5, -1),
                Arguments.of(empty, 1, 2, (short) -5, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("shortInputsAndResultsBounded")
    @DisplayName("BinarySearch with short bounded")   
    void testBinarySearchShortBounded(short[] a, int from, int to, short key, int expectedIndex) {
        assertEquals(expectedIndex, arrays.Arrays.binarySearch(a, from, to, key));  
    }
}