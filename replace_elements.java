class replace_elements {
    public int[] replaceElements ( int[] arr){
        int n = arr.length;
        if (n == 0) {
            return arr;
        }
        int maxRight = -1;
        for (int i = n - 1; i >= 0; i--) {
            int currentElement = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, currentElement);
        }
        return arr;
    }
}
