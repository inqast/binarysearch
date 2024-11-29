package comparable;

import java.util.Comparator;

public class ComparableObject implements Comparable<ComparableObject> {
    int valueToCompare;

    public ComparableObject(int num) {
        this.valueToCompare = num;
    }

    @Override
    public int compareTo(ComparableObject other) {

        return Integer.compare(this.valueToCompare, other.valueToCompare);
    }

    public static class ComparatorForObject implements Comparator<ComparableObject> {
        @Override
        public int compare(ComparableObject left, ComparableObject right) {

            return left.compareTo(right);
        }
    }
}
