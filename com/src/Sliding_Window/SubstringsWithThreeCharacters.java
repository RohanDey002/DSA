package Sliding_Window;

//Number of Substrings Containing All Three Characters
//Given a string s consisting only of characters a, b and c.
//
//Return the number of substrings containing at least one occurrence of all these characters a, b and c.
public class SubstringsWithThreeCharacters {
    public static void main(String[] args) {
        String str = "aabc";
        System.out.println(countSubstrings(str));

    }
    static int countSubstrings(String s){
        int ctn =0;
        int[] lastseen ={-1,-1,-1};
        for (int i = 0; i < s.length(); i++) {
            lastseen[s.charAt(i)-'a']=i;
            if(lastseen[0]!=-1&&lastseen[1]!=-1&&lastseen[2]!=-1){
                ctn+= 1+ Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2] ) );

            }
        }
        return ctn;
    }
}
