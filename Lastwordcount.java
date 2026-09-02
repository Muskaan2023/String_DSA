class Lastwordcount {
    public  int lengthOfLastWord(String s) {
        int i = s.length() - 1;

       
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int count = 0;

        
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
    public static void main(String[]args){
        String str="Alice Calls Bob for the Parcel";
        Lastwordcount obj=new Lastwordcount();
        int result=obj.lengthOfLastWord(str);
        System.out.print(result);
    }
}