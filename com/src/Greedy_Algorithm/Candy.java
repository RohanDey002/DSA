package Greedy_Algorithm;

public class Candy {
    public static void main(String[] args) {
        int[] ratings = {1,2,87,87,87,2,1};
        System.out.println(candy(ratings));
    }
    static int candy(int[] ratings) {
        int n = ratings.length;
        int candy = n;

        int i = 1;
        while (i < n) {

            if (ratings[i] == ratings[i - 1]) {
                i++;
                continue;
            }


            int peak = 0;
            while (i < n && ratings[i] > ratings[i - 1]) {
                peak++;
                candy += peak;
                i++;
            }


            int valley = 0;
            while (i < n && ratings[i] < ratings[i - 1]) {
                valley++;
                candy += valley;
                i++;
            }


            candy -= Math.min(peak, valley);
        }

        return candy;
    }
}
