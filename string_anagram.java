package competitive;

import java.util.Scanner;

public class string_anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int temp,tempp, size1,size;
        a=a.toUpperCase();
        b=b.toUpperCase();

        char charArray[] = a.toCharArray();
        char charArrayy[] = b.toCharArray();

        size = charArray.length;
        size1 = charArrayy.length;

        for(int i = 0; i < size; i++ ) {
            for(int j = i+1; j < size; j++) {
                if(charArray[i]>charArray[j]) {
                    temp = charArray[i];

                    charArray[i] = charArray[j];

                    charArray[j] = (char) temp;



                }
            }
        }
        for(int i = 0; i < size1; i++ ) {
            for(int j = i+1; j < size1; j++) {
                if(charArrayy[i]>charArrayy[j]) {

                    tempp = charArrayy[i];
                    charArrayy[i] = charArrayy[j];
                    charArrayy[j] = (char) tempp;


                }
            }
        }
        String str1=String.valueOf(charArray);
        String str2=String.valueOf(charArrayy);

        System.out.println(String.valueOf(charArray));
        System.out.println(str2);

        if(str1.equalsIgnoreCase(str2)&&(a.length()==b.length()))
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
