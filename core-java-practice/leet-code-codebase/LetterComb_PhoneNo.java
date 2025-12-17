public class LetterComb_PhoneNo {

    static String[] code = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String s = "23";
        Print(s,"");
    }
    public static void Print(String s, String ans){

        if(s.length() == 0){
            System.out.println(ans +" ");
            return;
        }
        char ch = s.charAt(0); //50
        String btn = code[ch-48];
        for(int i = 0;i<btn.length(); i++){
            Print(s.substring(1), ans + btn.charAt(i));
        }
    }
}
