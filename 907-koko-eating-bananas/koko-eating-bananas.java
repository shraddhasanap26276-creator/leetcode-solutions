class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed = 1;
        int maxspeed = 0;

        for (int pile : piles)
            maxspeed = Math.max(maxspeed, pile);

        while (minspeed < maxspeed) {
            int mid = minspeed + (maxspeed - minspeed) / 2;

            int hours = 0;
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h)
                maxspeed = mid;
            else
                minspeed = mid + 1;
        }

        return minspeed;
    }
}
