public class AddTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {4,5,6,7};
        int[] result = addArr(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] addArr(int[] arr1, int[] arr2) {
        int n = Math.max(arr1.length, arr2.length);
        int[] sum = new int[n];
        int carry = 0;
        for(int i = n-1; i > 0; --i){
            int s = arr1[i] + arr2[i] + carry;
            if(s > 10){
                s = s % 10;
                carry = s / 10;  
                sum[i] = s;              
            }
            else{
                sum[i] = s;
            }
        }
        return sum;
    }
}