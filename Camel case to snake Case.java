//import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i =0; i<t; i++){
            String str = scn.next();
            String result = "";
            char c = str.charAt(0);
            result = result + Character.toLowerCase(c);
            for(int j =1; j< str.length(); j++){
                char ch = str.charAt(j);
                if(Character.isUpperCase(ch)){
                    result += '_';
                    result += Character.toLowerCase(ch);
                }else{
                    result += ch;
                }
            }
            System.out.println(result);
        }
        scn.close();
    }
}