package competitive;

import java.util.*;
public class string_anagram {
    public static void main(String[] args) {
        String a = "silent";
        String b = "listen";

        boolean isanagram = false;
        boolean visted[]=new boolean[b.length()];

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            isanagram = false;
            for (int j = 0; j < b.length(); j++) {
                if (ch == b.charAt(j)&&!visted[j]) {
                    visted[j]=true;
                    isanagram = true;
                }
            }

            if (!isanagram) {
                break;
            }
        }
        if(isanagram)
        {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
