package Array;

// TIME COMPLEXITY : O(n) , n=bars (linear time)
public class TrappingRainwater {
    public static int trappedRainwater(int height[]) {
        int n = height.length;

        // calculate left max boundary [array] : from first to last
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // calculate right max boundary [array] : from last to first
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 2; i--) {
            rightmax[i] = Math.max(height[i], leftmax[i + 1]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterlevel=min(leftmax boundary, rigthmax boundary)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // trapped water= waterlevel-heigth[i]
            trappedWater += waterlevel - height[i];

        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };// height of bars

        System.out.print("trapped water = ");
        System.out.println(trappedRainwater(height));
    }

}
