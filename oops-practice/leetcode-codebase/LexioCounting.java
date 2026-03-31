public class LexioCounting {
    public static void main(String[] args) {
        int n = 1000;
        Print(0,n);
    }
    public static void Print(int curr, int n){
        if(curr > n){
            return;
        }
        System.out.println(curr);

        int i = 0;
        if(curr == 0){
            i=1;
        }
        for (; i <= 9; i++) {
            Print(curr*10+i, n);
        }
    }
}
