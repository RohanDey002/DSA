package Strings;


//Sum of beauty of all the substring
//beauty is the difference between most frequent and least frequent character
public class SumOfBeauty {
    public static void main(String[] args) {
        String str = "aabcbaa";
        System.out.println(sumOfBeauty(str));
    }
    static int sumOfBeauty(String s){
        int beauty =0;
        for (int i = 0; i <s.length() ; i++) {
            int [] freq = new int[26];
            for (int j = i; j <s.length() ; j++) {
                freq[s.charAt(j)-'a']++;

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int k = 0; k < 26; k++) {
                    if(freq[k]>0){
                        min=Math.min(min,freq[k]);
                        max=Math.max(max,freq[k]);
                    }
                }
                beauty+=(max-min);
            }

        }
        return beauty;
    }
}
