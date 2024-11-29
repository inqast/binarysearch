package binarysearch;

import java.util.ArrayList;

import comparable.ComparableObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("default byte");
        runByteTests();
        System.out.println("bounded byte");
        runByteBoundedTests();
        System.out.println("default double");
        runDoubleTests();
        System.out.println("bounded double");
        runDoubleBoundedTests();
        System.out.println("default float");
        runFloatTests();
        System.out.println("bounded float");
        runFloatBoundedTests();
        System.out.println("default int");
        runIntTests();
        System.out.println("bounded int");
        runIntBoundedTests();
        System.out.println("default long");
        runLongTests();
        System.out.println("bounded long");
        runLongBoundedTests();
        System.out.println("default short");
        runShortTests();
        System.out.println("bounded short");
        runShortBoundedTests();
        System.out.println("default jeneric");
        runJenericTests();
        System.out.println("bounded jeneric");
        runJenericBoundedTests();
        System.out.println("collection");
        runCollectionTests();
        System.out.println("collection with comparator");
        runCollectionWithComparatorTests();
    }

    public static void runByteTests() {
        byte[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        byte[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, (byte) 15);
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, (byte) 1);
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, (byte) 45);
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, (byte) 50);
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, (byte) -5);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(empty, (byte) -5);
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }

    public static void runByteBoundedTests() {
        byte[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        byte[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, 2, 6, (byte) 15);
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, 0, 3, (byte) 1);
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 8, (byte) 45);
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 5, (byte) 45);
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 5, (byte) 1);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(empty, 1, 2, (byte) -5);
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }

    public static void runFloatTests() {
        float[] arr = {1.5f, 2.3f, 3.15f, 5.27f, 8.33f, 15.24f, 20f, 30.34f, 45f};
        float[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, 15.24f);
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, 1.5f);
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, 45f);
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, 50f);
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, -5f);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, 5.29f);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(empty, -5f);
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }

    public static void runFloatBoundedTests() {
        float[] arr = {1.5f, 2.3f, 3.15f, 5.27f, 8.33f, 15.24f, 20f, 30.34f, 45f};
        float[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, 2, 6, 15.24f);
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, 0, 3, 1.5f);
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 8, 45f);
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 5, 50f);
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 5, -5f);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }
    }

    public static void runDoubleTests() {
        double[] arr = {1.5, 2.3, 3.15, 5.27, 8.33, 15.24, 20, 30.34, 45};
        double[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, 15.24);
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, 1.5);
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, 45);
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, 50);
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, -5);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, 5.29);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(empty, -5);
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }

    public static void runDoubleBoundedTests() {
        double[] arr = {1.5, 2.3, 3.15, 5.27, 8.33, 15.24, 20, 30.34, 45};
        double[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, 2, 6,15.24);
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, 0, 3, 1.5);
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 8, 45);
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 5, 50);
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 5, -5);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }
    }

    public static void runIntTests() {
        int[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        int[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, 15);
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, 1);
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, 45);
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, 50);
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, -5);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(empty, -5);
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }

    public static void runIntBoundedTests() {
        int[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        int[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, 2, 6, 15);
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, 0, 3, 1);
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 8, 45);
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 5, 45);
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 5, 1);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(empty, 1, 2, -5);
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }

    public static void runLongTests() {
        long[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        long[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, 15);
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, 1);
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, 45);
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, 50);
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, -5);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(empty, -5);
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }

    public static void runLongBoundedTests() {
        long[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        long[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, 2, 6, 15);
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, 0, 3, 1);
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 8, 45);
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 5, 45);
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 5, 1);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(empty, 1, 2, -5);
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }

    public static void runShortTests() {
        short[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        short[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, (short) 15);
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, (short) 1);
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, (short) 45);
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, (short) 50);
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, (short) -5);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(empty, (short) -5);
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }

    public static void runShortBoundedTests() {
        short[] arr = {1, 2, 3, 5, 8, 15, 20, 30, 45};
        short[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, 2, 6, (short) 15);
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, 0, 3, (short) 1);
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 8, (short) 45);
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 5, (short) 45);
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 5, (short) 1);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(empty, 1, 2, (short) -5);
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }

    public static void runJenericTests() {
        ComparableObject[] arr = {
            new ComparableObject(1), 
            new ComparableObject(2), 
            new ComparableObject(3), 
            new ComparableObject(5), 
            new ComparableObject(8), 
            new ComparableObject(15), 
            new ComparableObject(20), 
            new ComparableObject(30), 
            new ComparableObject(45)};
        ComparableObject[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, new ComparableObject(15), new ComparableObject.ComparatorForObject());
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, new ComparableObject(1), new ComparableObject.ComparatorForObject());
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, new ComparableObject(45), new ComparableObject.ComparatorForObject());
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, new ComparableObject(50), new ComparableObject.ComparatorForObject());
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr, new ComparableObject(-5), new ComparableObject.ComparatorForObject());
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(empty, new ComparableObject(-5), new ComparableObject.ComparatorForObject());
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }

    public static void runJenericBoundedTests() {
        ComparableObject[] arr = {
            new ComparableObject(1), 
            new ComparableObject(2), 
            new ComparableObject(3), 
            new ComparableObject(5), 
            new ComparableObject(8), 
            new ComparableObject(15), 
            new ComparableObject(20), 
            new ComparableObject(30), 
            new ComparableObject(45)};
        ComparableObject[] empty = {};
        int result;

        result = arrays.Arrays.binarySearch(arr, 2, 6, new ComparableObject(15), new ComparableObject.ComparatorForObject());
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = arrays.Arrays.binarySearch(arr, 0, 3, new ComparableObject(1), new ComparableObject.ComparatorForObject());
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 8, new ComparableObject(45), new ComparableObject.ComparatorForObject());
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = arrays.Arrays.binarySearch(arr, 2, 5, new ComparableObject(50), new ComparableObject.ComparatorForObject());
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(arr,2, 5, new ComparableObject(-5), new ComparableObject.ComparatorForObject());
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = arrays.Arrays.binarySearch(empty, 1, 2, new ComparableObject(-5), new ComparableObject.ComparatorForObject());
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }

    public static void runCollectionTests() {
        ArrayList<Integer> col = new ArrayList<Integer>();
        col.add(1); 
        col.add(2); 
        col.add(3); 
        col.add(5); 
        col.add(8); 
        col.add(15); 
        col.add(20); 
        col.add(30); 
        col.add(45);

        ArrayList<Integer> empty = new ArrayList<Integer>();
        int result;

        result = collections.Collections.binarySearch(col, 15);
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = collections.Collections.binarySearch(col, 1);
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = collections.Collections.binarySearch(col, 45);
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = collections.Collections.binarySearch(col, 50);
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = collections.Collections.binarySearch(col, -5);
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = collections.Collections.binarySearch(empty, -5);
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }

    public static void runCollectionWithComparatorTests() {
        ArrayList<ComparableObject> col = new ArrayList<ComparableObject>();
        col.add(new ComparableObject(1)); 
        col.add(new ComparableObject(2)); 
        col.add(new ComparableObject(3)); 
        col.add(new ComparableObject(5)); 
        col.add(new ComparableObject(8)); 
        col.add(new ComparableObject(15)); 
        col.add(new ComparableObject(20)); 
        col.add(new ComparableObject(30)); 
        col.add(new ComparableObject(45));

        ArrayList<ComparableObject> empty = new ArrayList<ComparableObject>();
        int result;

        result = collections.Collections.binarySearch(col, new ComparableObject(15), new ComparableObject.ComparatorForObject());
        if (result != 5) {
            System.out.println("index found");
            System.out.println(result + " != 5");
        }

        result = collections.Collections.binarySearch(col, new ComparableObject(1), new ComparableObject.ComparatorForObject());
        if (result != 0) {
            System.out.println("first index");
            System.out.println(result + " != 0");
        }

        result = collections.Collections.binarySearch(col, new ComparableObject(45), new ComparableObject.ComparatorForObject());
        if (result != 8) {
            System.out.println("last index");
            System.out.println(result + " != 8");
        }

        result = collections.Collections.binarySearch(col, new ComparableObject(50), new ComparableObject.ComparatorForObject());
        if (result != -1) {
            System.out.println("not found bigger");
            System.out.println(result + " != -1");
        }

        result = collections.Collections.binarySearch(col, new ComparableObject(-5), new ComparableObject.ComparatorForObject());
        if (result != -1) {
            System.out.println("not found smaller");
            System.out.println(result + " != -1");
        }

        result = collections.Collections.binarySearch(empty, new ComparableObject(-5), new ComparableObject.ComparatorForObject());
        if (result != -1) {
            System.out.println("empty array");
            System.out.println(result + " != -1");
        }
    }
}