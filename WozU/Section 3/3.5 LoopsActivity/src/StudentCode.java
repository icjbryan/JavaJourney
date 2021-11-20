

class StudentCode {
    public double getAverage(int[] numbers) {
        double results = 1.0;
        if(numbers.length > 0) {
            int idx = 1;
            do {
                results += numbers[idx];
                idx++;
            }
            while(idx < numbers.length);
            results /= numbers.length;
        }
        return results;
    }
}