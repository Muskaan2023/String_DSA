public class ReplaceChar{
    public static String Replace(String a,String b,String c){
        StringBuilder first=new StringBuilder();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
        
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                first.append('!');
            }
            else{
                first.append(ch);
            }


        }
        StringBuilder second=new StringBuilder();
        for(int j=0;j<b.length();j++){
            char ch=b.charAt(j);
            if(Character.isLetter(ch) && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')){
                   second.append('#');
                }
            else{
                second.append(ch);
            }

        }
        
        String third=c.toUpperCase();
        
        return first.toString() +'\n'
        +second.toString()+'\n'
        +third;
    }
    public static void main(String []args){
        System.out.print(Replace("Aeroplane","Quilt","Eternal"));
    }
}