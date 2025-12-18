import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Merge_Sort {
    void mergesort(List<Integer> ar, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (ar.get(left) <= ar.get(right)) {
                temp.add(ar.get(left));
                left++;
            } else {
                temp.add(ar.get(right));
                right++;
            }
        }
        while (left <= mid) {
            temp.add(ar.get(left));
            left++;
        }
        while (right <= high) {
            temp.add(ar.get(right));
            right++;
        }
        for (int i = low; i <= high; i++) {
            ar.set(i, temp.get(i - low));
        }

    }

    void ms(List<Integer> ar, int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        ms(ar, low, mid);
        ms(ar, mid + 1, high);
        mergesort(ar, low, mid, high);
    }

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 4, 3, 7, 8, 9));
        Merge_Sort t = new Merge_Sort();
        t.ms(ar, 0, ar.size() - 1);
        System.out.println(ar.toString());
    }
}