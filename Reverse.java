import java.util.Arrays;

public class Reverse{
    private static char[] reverse(char[]s){
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
            

        }
        return s ;
        
        
    }
    public static void main(String[]args){
        char c[]={'h','l','f','q'};
        char[] b = reverse(c);

        System.out.println(Arrays.toString(b));
    }
}