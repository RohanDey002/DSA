package Strings;

//Find the maximum nested dept parenthesis
public class MaxDepthParantesis {
    public static void main(String[] args) {
        String str ="(1+(2*3)+((8)/4))+1";
        System.out.println(maxdepthpara(str));
    }
    static int maxdepthpara(String s){
        int count =0;
        int maxdepth=0;
        for (char c:s.toCharArray()){
            if(c=='('){
                count++;
                maxdepth=Math.max(maxdepth,count);
            }
            if(c==')'){
                count--;
                maxdepth=Math.max(maxdepth,count);
            }
        }

        return maxdepth;
    }
}
