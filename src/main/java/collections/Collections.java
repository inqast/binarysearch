package collections;

import java.util.Comparator;
import java.util.List;

public class Collections {
    public static <T> int binarySearch(List<? extends Comparable<T>> list, T key) {
        int left = 0;
        int right = list.size()-1;

        while (left <= right) {
            int mid = left+((right-left) / 2);
            Comparable<T> midVal = list.get(mid);

            int cmp = midVal.compareTo(key);
            if (cmp < 0) {
                left = mid + 1;
            } else if (cmp > 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static <T> int binarySearch(List<T> list, T key, Comparator<T> c) {
        int left = 0;
        int right = list.size()-1;

        while (left <= right) {
            int mid = left+((right-left) / 2);
            T midVal = list.get(mid);

            int cmp = c.compare(midVal, key);
            if (cmp < 0) {
                left = mid + 1;
            } else if (cmp > 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
