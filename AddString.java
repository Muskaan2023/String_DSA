public class AddString {
    public static String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;

        String result = "";

        while (i >= 0 || j >= 0 || carry > 0) {

            int n1 = 0;
            int n2 = 0;

            if (i >= 0) {
                n1 = num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                n2 = num2.charAt(j) - '0';
                j--;
            }

            int sum = n1 + n2 + carry;

            result = (sum % 10) + result;

            carry = sum / 10;
        }

        return result;
    }
    public static void main(String[]args){
        String a="1234";
        String b="2345";
        System.out.print(addStrings(a,b));
    }
}