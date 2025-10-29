class kata55 {
    public static String rangeExtraction(int[] arr) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < arr.length) {
            int start = i;
            while (i + 1 < arr.length && arr[i + 1] == arr[i] + 1)
                i++;
            if (i - start >= 2)
                result.append(arr[start]).append("-").append(arr[i]);
            else
                for (int j = start; j <= i; j++)
                    result.append(arr[j]).append(j < i ? "," : "");
            if (i < arr.length - 1)
                result.append(",");
            i++;
        }
        return result.toString();
    }
}
