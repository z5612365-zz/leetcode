public class Solution {
    //binary hammingDistance is how much 1 of (x XOR y)
    public int hammingDistance(int x, int y) {
        String val=Integer.toBinaryString(x^y);
        int dist = 0;
        for(int i=0;i<val.length();i++){

            if(val.charAt(i)=='1'){
                
                dist++;
            }
        }
        return dist;
    }
}
