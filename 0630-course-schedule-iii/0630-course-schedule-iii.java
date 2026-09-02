import java.util.*;

class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]); // sort by deadline
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int time = 0;

        for (int[] course : courses) {
            int duration = course[0], deadline = course[1];
            time += duration;
            maxHeap.add(duration);

            if (time > deadline) {
                time -= maxHeap.poll(); // remove longest course
            }
        }
        return maxHeap.size();
    }
}
