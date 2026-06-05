public class triplets {

    public static void triplets_array(int[] arr, int n) {
        System.out.println("Geometric triplets are :");

        for (int j = 1; j < n - 1; j++) {
            int i = j - 1;

            while (i >= 0) {
                int k = j + 1;

                while (k < n) {

                    if (arr[j] * arr[j] == arr[i] * arr[k]) {
                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                    }
                    k++;
                }
                i--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 9, 9, 27, 81};
        int n = arr.length;

        triplets_array(arr, n);
    }
}