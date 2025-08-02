package Greedy_Algorithm;

import java.util.Arrays;

//Assume you are an awesome parent and want to give your children some cookies.
// But, you should give each child at most one cookie.
//
//Each child i has a greed factor g[i], which is the minimum size of a cookie
// that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i],
// we can assign the cookie j to the child i, and the child i will be content. Your goal is
// to maximize the number of your content children and output the maximum number.
//
//
public class AssignCookies {
    public static void main(String[] args) {
        int[] greed={2,1,4,3};
        int[] cookies ={1,7,2};
       int result= findContentChildren(greed,cookies);
        System.out.println(result);

    }
    static int findContentChildren(int[] g, int[] s) {
     int maxnum=0;
     int right=0;
     int left=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (right< s.length && left<g.length){
            if(g[left]<=s[right]){
                maxnum+=1;
                left++;
            }
            right++;
        }

        return maxnum;
    }
}
