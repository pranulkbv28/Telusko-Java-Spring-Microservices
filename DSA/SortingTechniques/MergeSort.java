package DSA.SortingTechniques;

public class MergeSort {
    public static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            merge(nums, left, mid, right);
        }
    }

    public static void merge(int[] nums, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int x = 0; x < n1; x++) {
            leftArr[x] = nums[left + x];
        }
        for (int x = 0; x < n2; x++) {
            rightArr[x] = nums[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                nums[k] = leftArr[i];
                i++;
            } else {
                nums[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            nums[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            nums[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 6, 5, 2, 8, 9, 4 };

        System.out.println("Before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        mergeSort(nums, 0, nums.length - 1);

        System.out.println();
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
