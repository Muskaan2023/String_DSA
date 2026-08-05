public class Palindrome{
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }
    public static void main(String args[]){
        String v="madam";
        if(isPalindrome(v)){
            System.out.print("Yes it's a palindrome");

        }
        else{
            System.out.print("No,it's not a Palindrome");
        }
        
        
        //System.out.print(isPalindrome(v));
    }
}