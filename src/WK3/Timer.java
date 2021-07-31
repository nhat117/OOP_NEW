package WK3;

public class Timer {
    public static class Stopwatch {
        boolean isRunning;
        //A simple stop watch
        private long startTime;
        private long stopTime;

        public Stopwatch() {
            this.startTime = 0;
            this.stopTime = 0;
        }

        public void Start() {
            startTime = System.currentTimeMillis();
            isRunning = true;
        }

        public void Stop() {
            stopTime = System.currentTimeMillis();
            isRunning = false;
        }

        public long getElapsed() {
            return (isRunning) ? startTime - System.currentTimeMillis() : stopTime - startTime;
        }

        @Override
        public String toString() {
            return "Time elapse: " + getElapsed() + " milis";
        }
    }

    //Selection sort

    // Java program for implementation of Selection Sort
    public static class SelectionSort {
        SelectionSort() {
        }

        public void sort(int arr[]) {
            int n = arr.length;
            Stopwatch timer = new Stopwatch();
            timer.Start();
            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i + 1; j < n; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;

                // Swap the found minimum element with the first
                // element
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
            timer.Stop();
            System.out.println(timer);
        }
    }

    //Driving class
    public static class Main {
        public static void main(String[] args) {
            int[] arr = new int[100000];
            SelectionSort sort = new SelectionSort();
            sort.sort(arr);
        }
    }
}