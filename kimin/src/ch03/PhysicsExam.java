package ch03;

import java.util.Arrays;
import java.util.Comparator;

public class PhysicsExam {
    public void searchHeight(PhysicsData[] data, int height) {
        Arrays.sort(data, PhysicsData.HEIGHT_ORDER);

        int index = Arrays.binarySearch(data, new PhysicsData("", height, 0.0), PhysicsData.HEIGHT_ORDER);

        showResult(data, index);

        System.out.println(Arrays.toString(data));
    }

    public void searchVision(PhysicsData[] data, double vision) {
        Arrays.sort(data, PhysicsData.VISION_ORDER);

        int index = Arrays.binarySearch(data, new PhysicsData("", 0, vision), PhysicsData.VISION_ORDER);

        showResult(data, index);

        System.out.println(Arrays.toString(data));
    }

    private void showResult(PhysicsData[] data, int index) {
        if (index < 0) {
            System.out.println("No result found.");
        } else {
            System.out.println("Result found at data[" + index + "]");
            System.out.println(data[index]);
        }
    }
}
