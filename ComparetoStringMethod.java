public class ComparetoStringMethod{
    public static int Compare(String str1,String str2){
    int result=str1.compareTo(str2);
    if(result==0){
        return 0;

    }
    return result;
}
  public static void main(String[]args){
    String str1="harshmita";
    String str2="harshqit";
    System.out.print(Compare(str1,str2));
  }  
}
