public class ParallelSum {
    public static void main(String[] args) {
        int numThreads = 10;
        int numNumbers = 1000;
        int numbersPerThread = numNumbers / numThreads;

        PartialSum[] sums = new PartialSum[numThreads];
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            sums[i] = new PartialSum(i * numbersPerThread + 1, (i + 1) * numbersPerThread);
            threads[i] = new Thread(sums[i]);
            threads[i].start();
        }

        long totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
                totalSum += sums[i].getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total sum: " + totalSum);
    }
}