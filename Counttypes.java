import java.util.Scanner;

public class Counttypes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int vowels=0;
        int digit=0;
        int consonants=0;
        int specialch=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowels++;
            }
            else if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')){
                consonants++;
            }
            else if(ch>='0' && ch<='9'){
                digit++;

            }
            else{
                specialch++;
            }


        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digit);
        System.out.println("Special Characters = " + specialch); 
        sc.close();

    }

}