package pl.radekcholuj.junit.math;

public final class ArrayCalculation {
    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) {
            if(value < min){
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if(value > max){
                max = value;
            }
        }
        return max;
    }

    public static int avg(int[] values) {
        return sum(values)/values.length;
    }

    private static int sum(int[] values){
        int sum = 0;
        for (int value : values) {
            sum+=value;
        }
        return sum;
    }

    public static double median(int[] values) {
        sort(values);
        if(values.length % 2 == 0){
            double first = values[values.length/2-1];
            double second = values[values.length/2];

            return (first+second)/2;
        } else {
            return values[values.length/2];
        }
    }

    private static void sort(int[] values){
        for(int j = 0; j < values.length-1; j++){
            for(int i = 0; i < values.length-1; i++){
                if(values[i] > values[i+1]){
                    int tmp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = tmp;
                }
            }
        }
    }
}
