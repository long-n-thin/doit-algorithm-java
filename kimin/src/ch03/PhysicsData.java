package ch03;

import java.util.Comparator;

public class PhysicsData {
    private String name;
    private int height;
    private double vision;

    public PhysicsData(String name, int height, double vision) {
        this.name = name;
        this.height = height;
        this.vision = vision;
    }

    public String toString() {
        return "name: " + name + ", height: " + height + ", vision: " + vision + "\n";
    }

    // 키 오름차순 정렬
    public static final Comparator<PhysicsData> HEIGHT_ORDER = new HeightOrderComparator();

    private static class HeightOrderComparator implements Comparator<PhysicsData> {
        public int compare(PhysicsData data1, PhysicsData data2) {
            return Integer.compare(data1.height, data2.height);
        }
    }

    // 시력 내림차순 정렬
    public static final Comparator<PhysicsData> VISION_ORDER = new VisionOrderComparator().reversed();

    private static class VisionOrderComparator implements Comparator<PhysicsData> {
        public int compare(PhysicsData data1, PhysicsData data2) {
            return Double.compare(data1.vision, data2.vision);
        }
    }
}
