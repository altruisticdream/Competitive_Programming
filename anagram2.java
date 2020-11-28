package competitive;
import java.util.Arrays;
public class anagram2 {
    public static void main(String[] args)
    {
        String a="acf c gf";
        String b="acgf f c";

        boolean arrr=false;
        char[] arr=a.toCharArray();
        char[] arr1=b.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(String.valueOf(arr));
        System.out.println(String.valueOf(arr1));
        arrr=Arrays.equals(arr,arr1);
        if(arrr)
        {
            System.out.println("Anagram");

        }
        else
            System.out.println("not");
    }
}
