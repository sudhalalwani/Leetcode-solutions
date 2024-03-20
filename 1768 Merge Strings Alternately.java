import java.util.*;
public class MSA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word1: ");
        String word1 = sc.nextLine();
        System.out.print("Enter word2: ");
        String word2 = sc.nextLine();
        System.out.println(mergeAlternately(word1, word2));
        sc.close();
    }
    public static String mergeAlternately(String word1, String word2) {
        String output = "";
        int i;
        String remain  = "";
        if(word1.length() > word2.length()){
            i = word2.length();
            remain = word1.substring(i, word1.length());
        }else if(word1.length() < word2.length()){
            i = word1.length();
            remain = word2.substring(i, word2.length());
        }else{
            i = word1.length();
            remain = "";
        }
        for(int l = 1; l< i+1; l++){
            output = output + word1.substring(l-1, l);
            output = output + word2.substring(l-1, l);
        }
        return output + remain;
    }
}