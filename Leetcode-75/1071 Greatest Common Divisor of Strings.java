import java.util.*;
class GSD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String word1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String word2 = sc.nextLine();
        System.out.println(gcdOfStrings(word1, word2));
        sc.close();
    }
    public static String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        else if (!str1.startsWith(str2)) {
            return "";
        }
        else if (str2.isEmpty()) {
            return str1;
        }
        else {
            return gcdOfStrings(str1.substring(str2.length()),
                    str2);
        }
    }
}
