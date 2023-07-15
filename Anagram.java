import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean areAnagrams = checkAnagrams(str1, str2);
        System.out.println(areAnagrams);

        str1 = "restful";
        str2 = "fluster";
        areAnagrams = checkAnagrams(str1, str2);
        System.out.println(areAnagrams);
    }

    public static boolean checkAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("[^a-z]", "");
        str2 = str2.toLowerCase().replaceAll("[^a-z]", "");

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}

