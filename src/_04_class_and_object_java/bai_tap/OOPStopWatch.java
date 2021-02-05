package _04_class_and_object_java.bai_tap;

import java.time.LocalTime;

public class OOPStopWatch {
    public static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = (int) (Math.random() * 100000);
        }
        LocalTime start = LocalTime.now();
        System.out.println("Start time : "+ start);
        selectionSort(a);
        LocalTime end = LocalTime.now();
        System.out.println("End time : " + end);
        StopWatch sw = new StopWatch(start, end);
        System.out.println("Time: " + sw.getElapsedTime());
//        for (int x : a) {
//            System.out.println(x);
//        }
    }
    static class StopWatch {
        private LocalTime startTime, endTime;

        public StopWatch() {
        }

        public StopWatch(LocalTime startTime, LocalTime endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public LocalTime getStartTime() {
            return this.startTime;
        }

        public LocalTime getEndTime() {
            return this.endTime;
        }

        public void start() {
            this.startTime = LocalTime.now();
        }

        public void stop() {
            this.endTime = LocalTime.now();
        }

        public int getElapsedTime() {
            return (((this.endTime.getHour() - this.startTime.getHour()) * 3600 +
                    (this.endTime.getMinute() - this.startTime.getMinute()) * 60 +
                    (this.endTime.getSecond() - this.startTime.getSecond())))*1000;
        }
    }

}


