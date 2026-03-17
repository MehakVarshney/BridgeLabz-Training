import java.util.*;
import java.util.regex.*;

public class DynamicTemplateProcessor {

    public static String process(String s) {

        Pattern p = Pattern.compile("\\$\\{([A-Z]+):(.*?)\\}");
        Matcher m = p.matcher(s);

        StringBuffer result = new StringBuffer();

        while(m.find()) {

            String t = m.group(1);
            String v = m.group(2);

            String newS = "";

            switch(t) {

                case "UPPER":
                    newS = v.toUpperCase();
                    break;

                case "LOWER":
                    newS = v.toLowerCase();
                    break;

                case "REPEAT":

                    String[] arr = v.split(",");

                    if(arr.length != 2) {
                        newS="INVALID";
                        break;
                    }

                    String word = arr[0];

                    try{

                        int count=Integer.parseInt(arr[1]);

                        String temp="";

                        for(int i=0;i<count;i++)
                            temp+=word;

                        newS=temp;

                    }
                    catch(Exception e){
                        newS="INVALID";
                    }

                    break;

                case "DATE":

                    String[] d=v.split("-");

                    if(d.length!=3){
                        newS="INVALID";
                        break;
                    }

                    try{

                        int day=Integer.parseInt(d[0]);
                        int mon=Integer.parseInt(d[1]);
                        int y=Integer.parseInt(d[2]);

                        if(day<1 || day>31 || mon<1 || mon>12)
                            newS="INVALID";
                        else
                            newS=y+"/"+String.format("%02d",mon)+"/"+String.format("%02d",day);

                    }
                    catch(Exception e){
                        newS="INVALID";
                    }

                    break;

                default:
                    newS="INVALID";
            }

            m.appendReplacement(result, Matcher.quoteReplacement(newS));
        }

        m.appendTail(result);

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();

        while(n-->0){

            String s=sc.nextLine();

            System.out.println(process(s));
        }
    }
}