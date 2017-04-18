public class Solution {
    public String reverseWords(String s) {
        
        String[] splited = s.split("\\s+");
        String result="";
        for(int i=0;i<splited.length;i++){
            result+=new StringBuilder(splited[i]).reverse().toString();
            result+=" ";
        }
        result=result.substring(0, result.length() - 1); //remove the last space

        //System.out.println(result);
        return result;
    }
}
