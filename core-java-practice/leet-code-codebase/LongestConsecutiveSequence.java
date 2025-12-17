import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args){
        int[] arr = {2,7,4,8,5,1,10,3,14,15,18,12,16,11};
        System.out.println(consecutive(arr));
    }
    public static int consecutive(int[] arr){
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i]-1)){
                map.put(arr[i],false);
            }
            else{
                map.put(arr[i],true);
            }
            if(map.containsKey(arr[i]+1)){
                map.put(arr[i]+1, false);
            }
        }
        int ans = 0;
        for(int key:map.keySet()){
            if(map.get(key)){
                int count = 0;
                while(map.containsKey(key)){
                    count++;
                    key++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}
