package arrays;

import java.util.Comparator;

public abstract class Arrays {
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length-1, key);
    }
    
    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        if (fromIndex > toIndex) {
            return -1;
        }

        int left = fromIndex;
        if (left < 0) {
            left = 0;
        }
        int right = toIndex;
        if (right > a.length-1) {
            right = a.length-1;
        }

        while (left <= right) {
            int mid = left+((right-left) / 2);
            long midVal = a[mid];

            long cmp = (key - midVal);
            if (cmp > 0) {
                left = mid + 1;
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length-1, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        if (fromIndex > toIndex) {
            return -1;
        }

        int left = fromIndex;
        if (left < 0) {
            left = 0;
        }
        int right = toIndex;
        if (right > a.length-1) {
            right = a.length-1;
        }

        while (left <= right) {
            int mid = left+((right-left) / 2);
            long midVal = a[mid];

            long cmp = (key - midVal);
            if (cmp > 0) {
                left = mid + 1;
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length-1, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        if (fromIndex > toIndex) {
            return -1;
        }

        int left = fromIndex;
        if (left < 0) {
            left = 0;
        }
        int right = toIndex;
        if (right > a.length-1) {
            right = a.length-1;
        }

        while (left <= right) {
            int mid = left+((right-left) / 2);
            double midVal = a[mid];

            double cmp = (key - midVal);
            if (cmp > 0) {
                left = mid + 1;
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length-1, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        if (fromIndex > toIndex) {
            return -1;
        }

        int left = fromIndex;
        if (left < 0) {
            left = 0;
        }
        int right = toIndex;
        if (right > a.length-1) {
            right = a.length-1;
        }

        while (left <= right) {
            int mid = left+((right-left) / 2);
            float midVal = a[mid];

            float cmp = (key - midVal);
            if (cmp > 0) {
                left = mid + 1;
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length-1, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        if (fromIndex > toIndex) {
            return -1;
        }

        int left = fromIndex;
        if (left < 0) {
            left = 0;
        }
        int right = toIndex;
        if (right > a.length-1) {
            right = a.length-1;
        }

        while (left <= right) {
            int mid = left+((right-left) / 2);
            long midVal = a[mid];

            long cmp = (key - midVal);
            if (cmp > 0) {
                left = mid + 1;
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length-1, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        if (fromIndex > toIndex) {
            return -1;
        }

        int left = fromIndex;
        if (left < 0) {
            left = 0;
        }
        int right = toIndex;
        if (right > a.length-1) {
            right = a.length-1;
        }

        while (left <= right) {
            int mid = left+((right-left) / 2);
            long midVal = a[mid];

            long cmp = (key - midVal);
            if (cmp > 0) {
                left = mid + 1;
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length-1, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        if (fromIndex > toIndex) {
            return -1;
        }

        int left = fromIndex;
        if (left < 0) {
            left = 0;
        }
        int right = toIndex;
        if (right > a.length-1) {
            right = a.length-1;
        }

        while (left <= right) {
            int mid = left+((right-left) / 2);
            long midVal = a[mid];

            long cmp = (key - midVal);
            if (cmp > 0) {
                left = mid + 1;
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static <T> int binarySearch(T[] a, T key, Comparator<T> c) {
        return binarySearch(a, 0, a.length-1, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<T> c) {
        if (fromIndex > toIndex) {
            return -1;
        }

        int left = fromIndex;
        if (left < 0) {
            left = 0;
        }
        int right = toIndex;
        if (right > a.length-1) {
            right = a.length-1;
        }

        while (left <= right) {
            int mid = left+((right-left) / 2);
            T midVal = a[mid];

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