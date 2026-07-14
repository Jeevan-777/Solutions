import java.util.*;
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] arr) {
        long curr=mass;
        Arrays.sort(arr);
        for(int i:arr){
            if(curr<i){
                return false;
            }
            curr+=i;
        }
        return true;
    }
}