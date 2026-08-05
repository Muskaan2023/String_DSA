public class CountlengthofString{
    private static int CountLengthofString(String str){
        int count=0;
        char []ch=str.toCharArray();
        for(char s:ch){
            count++;
        }
        return count;
    }
    public static void main(String[]args){
        String str="Hello,My Name is Lucy.";
        System.out.print(CountLengthofString(str));
    }
}