import java.util.Arrays;
public class Array_leaders {
        public int[] replaceElements(int[] arr) {
            int n = arr.length;
            int maximRight = -1;

            for (int i = n - 1; i >= 0; i--) {
                int current = arr[i];
                arr[i] = maximRight;
                maximRight = Math.max(maximRight, current);
            }
            return arr;
        }
        public static void main(String[] args) {
            int[] arr = {17, 18, 5, 4, 6, 1};
            Array_leaders obj = new Array_leaders();
            int[] result = obj.replaceElements(arr);
            System.out.println(Arrays.toString(result));
        }
    }

