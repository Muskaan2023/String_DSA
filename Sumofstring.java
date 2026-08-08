public class Sumofstring{
    public static int SumofSubStringNum(int Num){
        String str="";
        str=str+Num;
        int sum=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String r=str.substring(i, j+1);
                int result=Integer.parseInt(r);
                sum=sum+result;
            }
        }
        return sum;

    }
    public static void main(String [] args){
        int N=1234;
        System.out.print(SumofSubStringNum(N));
    }
}